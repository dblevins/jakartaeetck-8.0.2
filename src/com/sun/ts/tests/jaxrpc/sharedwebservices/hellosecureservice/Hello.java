/*
 * Copyright (c) 2007, 2018 Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 2002 International Business Machines Corp. All rights reserved.
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

// This class was generated by the JAXRPC RI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Reference Implementation (1.1, build EA-R8)

package com.sun.ts.tests.jaxrpc.sharedwebservices.hellosecureservice;

public interface Hello extends java.rmi.Remote {
  public boolean getHttpSessionTest() throws java.rmi.RemoteException;

  public boolean getMessageContextTest() throws java.rmi.RemoteException;

  public boolean getServletContextTest() throws java.rmi.RemoteException;

  public boolean getUserPrincipalTest() throws java.rmi.RemoteException;

  public boolean isUserInRoleTest(java.lang.String string_1)
      throws java.rmi.RemoteException;

  public java.lang.String hello(java.lang.String string_1)
      throws java.rmi.RemoteException;
}
