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

/*
 * $Id$
 */
package com.sun.ts.tests.servlet.api.javax_servlet.scinitializer.addlistener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public final class SRListener implements ServletRequestListener {

  // Public Methods
  public void requestDestroyed(ServletRequestEvent event) {
    System.out.print("in requestDestroyed method of CreateSRListener");
  }

  public void requestInitialized(ServletRequestEvent event) {
    System.out.print("CreateSRListener_INVOKED");
  }
}
