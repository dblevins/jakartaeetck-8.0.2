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

package com.sun.ts.tests.servlet.api.javax_servlet.dispatchtest;

import java.io.IOException;
import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.RequestDispatcher;

public final class TestListener2 implements AsyncListener {

  public TestListener2() throws IOException {
  }

  public void onError(AsyncEvent event) throws IOException {
    event.getSuppliedResponse().getWriter()
        .println("in onError method of TestListener2");
    event.getSuppliedResponse().getWriter()
        .println(event.getThrowable().getMessage());
    event.getSuppliedResponse().getWriter().println(event.getSuppliedRequest()
        .getAttribute(RequestDispatcher.ERROR_EXCEPTION));
    event.getAsyncContext().complete();
  }

  public void onStartAsync(AsyncEvent event) throws IOException {
    event.getSuppliedResponse().getWriter()
        .println("in onStartAsync method of TestListener2");
  }

  public void onComplete(AsyncEvent event) throws IOException {
    event.getSuppliedResponse().getWriter()
        .println("in onComplete method of TestListener2");
  }

  public void onTimeout(AsyncEvent event) throws IOException {
    event.getSuppliedResponse().getWriter()
        .println("in onTimeout method of TestListener2");
  }
}
