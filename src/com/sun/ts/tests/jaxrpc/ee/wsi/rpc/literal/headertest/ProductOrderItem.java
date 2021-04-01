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

public class ProductOrderItem {
  protected java.lang.String productName;

  protected java.math.BigInteger productCode;

  protected int quantity;

  protected java.math.BigDecimal price;

  public ProductOrderItem() {
  }

  public ProductOrderItem(java.lang.String productName,
      java.math.BigInteger productCode, int quantity,
      java.math.BigDecimal price) {
    this.productName = productName;
    this.productCode = productCode;
    this.quantity = quantity;
    this.price = price;
  }

  public java.lang.String getProductName() {
    return productName;
  }

  public void setProductName(java.lang.String productName) {
    this.productName = productName;
  }

  public java.math.BigInteger getProductCode() {
    return productCode;
  }

  public void setProductCode(java.math.BigInteger productCode) {
    this.productCode = productCode;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public java.math.BigDecimal getPrice() {
    return price;
  }

  public void setPrice(java.math.BigDecimal price) {
    this.price = price;
  }
}
