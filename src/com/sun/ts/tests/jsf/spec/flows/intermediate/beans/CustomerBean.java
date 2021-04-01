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

package com.sun.ts.tests.jsf.spec.flows.intermediate.beans;

public class CustomerBean {
  private static int lastId = 0;

  private int myId;

  private boolean upgraded = false;

  public boolean isUpgraded() {
    return upgraded;
  }

  public void setUpgraded(boolean upgraded) {
    this.upgraded = upgraded;
  }

  public CustomerBean() {
    super();
    myId = incrementId();
  }

  public int getCustomerId() {
    return myId;
  }

  private synchronized int incrementId() {
    return ++lastId;
  }
}
