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

// This class was generated by the JAXRPC RI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Reference Implementation (1.1, build EA-R8)

package com.sun.ts.tests.jaxrpc.ee.wsi.rpc.literal.headertest;

import java.rmi.RemoteException;

public class HeaderTestImpl implements HeaderTest {
  public ProductOrderResponse submitOrder(ProductOrderRequest poRequest,
      ConfigHeader configHeader)
      throws BadOrderFault, ConfigFault, RemoteException {
    ProductOrderResponse poResponse = new ProductOrderResponse();
    String testName = configHeader.getTestName();
    if (testName.equals("GoodOrderTestWithSoapHeaderAndMUFalse")) {
      if (!ValidHeader(configHeader, false, "Config Header", testName))
        throw new ConfigFault(true,
            "Invalid ConfigHeader: mustUnderstand="
                + configHeader.isMustUnderstand() + ", message="
                + configHeader.getMessage() + ", testName=" + testName);
      poResponse.setItem(poRequest.getItem());
    } else if (testName.equals("GoodOrderTestWithSoapHeaderAndMUTrue")) {
      if (!ValidHeader(configHeader, true, "Config Header", testName))
        throw new ConfigFault(true,
            "Invalid ConfigHeader: mustUnderstand="
                + configHeader.isMustUnderstand() + ", message="
                + configHeader.getMessage() + ", testName=" + testName);
      poResponse.setItem(poRequest.getItem());
    } else if (testName.equals("SoapHeaderFaultTest")) {
      throw new ConfigFault(true, "This is a soap header fault ConfigFault");
    } else if (testName.equals("SoapFaultTest")) {
      throw new BadOrderFault("This is a soap fault BadOrderFault");
    } else {
      throw new ConfigFault(true,
          "Invalid ConfigHeader: mustUnderstand="
              + configHeader.isMustUnderstand() + ", message="
              + configHeader.getMessage() + ", testName=" + testName);
    }
    return poResponse;
  }

  private boolean ValidHeader(ConfigHeader ch, boolean mu, String msg,
      String test) {
    if (ch.isMustUnderstand() == mu && ch.getMessage().equals(msg)
        && ch.getTestName().equals(test))
      return true;
    else
      return false;
  }
}
