/*
 * Copyright (c) 2013, 2018 Oracle and/or its affiliates. All rights reserved.
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

package com.sun.ts.tests.jaxrs.ee.rs.ext.interceptor.writer.writerinterceptorcontext;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import com.sun.ts.tests.jaxrs.api.rs.ext.interceptor.TemplateInterceptorBody;

public class ProceedException extends WebApplicationException {

  private static final long serialVersionUID = -8012949565468746147L;

  private String msg;

  public ProceedException(String msg) {
    super(
        Response.ok(msg)
            .header(TemplateInterceptorBody.OPERATION,
                ContextOperation.FROMPROCEEDTHROWSWEBAPPEXCEPTION.name())
            .build());
    this.msg = msg;
  }

  /**
   * Acyclic getCause() returns equivalent of this
   */
  @Override
  public Throwable getCause() {
    return new ProceedException(msg) {
      private static final long serialVersionUID = 256996856963444570L;

      @Override
      public Throwable getCause() {
        return null;
      }
    };
  }

  @Override
  public String getMessage() {
    return msg;
  }
}
