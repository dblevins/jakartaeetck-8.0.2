/*
 * Copyright (c) 2012, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.ts.tests.jaxrs.ee.rs.container.requestcontext.illegalstate;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public abstract class RequestTemplateFilter extends TemplateFilter
    implements ContainerRequestFilter {
  @Override
  public void filter(ContainerRequestContext requestContext)
      throws IOException {
    this.requestContext = requestContext;
    String operation = requestContext.getHeaderString(OPERATION);
    Method[] methods = getClass().getMethods();
    for (Method method : methods)
      if (operation.equalsIgnoreCase(method.getName())) {
        try {
          method.invoke(this);
          if (entity != null) {
            Response response = Response.ok(entity).build();
            requestContext.abortWith(response);
          }
          return;
        } catch (Exception e) {
          e.printStackTrace();
          Response response = Response.status(Status.SERVICE_UNAVAILABLE)
              .entity(e.getMessage()).build();
          requestContext.abortWith(response);
        }
      }
    // If method not found, it is response context operation
  }

}
