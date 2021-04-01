/*
 * Copyright (c) 2007, 2018 Oracle and/or its affiliates. All rights reserved.
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

// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1, build EA-R25)

package com.sun.ts.tests.jaxrpc.wsi.w2j.rpc.literal.R2728;

public class EchoExceptionType extends Exception {
  private java.lang.String component;

  private java.lang.String message;

  private java.lang.String localizedMessage;

  public EchoExceptionType(java.lang.String component, java.lang.String message,
      java.lang.String localizedMessage) {
    this.component = component;
    this.message = message;
    this.localizedMessage = localizedMessage;
  }

  public java.lang.String getComponent() {
    return component;
  }

  public java.lang.String getMessage() {
    return message;
  }

  public java.lang.String getLocalizedMessage() {
    return localizedMessage;
  }
}
