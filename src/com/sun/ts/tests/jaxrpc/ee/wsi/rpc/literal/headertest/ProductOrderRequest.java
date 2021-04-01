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
// JAX-RPC Reference Implementation (1.1, build EA-R10)

package com.sun.ts.tests.jaxrpc.ee.wsi.rpc.literal.headertest;

public class ProductOrderRequest {
  protected com.sun.ts.tests.jaxrpc.ee.wsi.rpc.literal.headertest.ProductOrderItem[] item;

  protected com.sun.ts.tests.jaxrpc.ee.wsi.rpc.literal.headertest.CustomerInfo customerInfo;

  public ProductOrderRequest() {
  }

  public ProductOrderRequest(
      com.sun.ts.tests.jaxrpc.ee.wsi.rpc.literal.headertest.ProductOrderItem[] item,
      com.sun.ts.tests.jaxrpc.ee.wsi.rpc.literal.headertest.CustomerInfo customerInfo) {
    this.item = item;
    this.customerInfo = customerInfo;
  }

  public com.sun.ts.tests.jaxrpc.ee.wsi.rpc.literal.headertest.ProductOrderItem[] getItem() {
    return item;
  }

  public void setItem(
      com.sun.ts.tests.jaxrpc.ee.wsi.rpc.literal.headertest.ProductOrderItem[] item) {
    this.item = item;
  }

  public com.sun.ts.tests.jaxrpc.ee.wsi.rpc.literal.headertest.CustomerInfo getCustomerInfo() {
    return customerInfo;
  }

  public void setCustomerInfo(
      com.sun.ts.tests.jaxrpc.ee.wsi.rpc.literal.headertest.CustomerInfo customerInfo) {
    this.customerInfo = customerInfo;
  }
}
