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
// JAX-RPC Reference Implementation (1.1, build EA-R15)

package com.sun.ts.tests.jaxrpc.ee.wsi.rpc.literal.marshalltest;

public class WhyTheFault implements java.io.Serializable {
  private java.lang.String value;

  public static final String _FooBad1String = "FooBad1";

  public static final String _FooBad2String = "FooBad2";

  public static final String _FooBad3String = "FooBad3";

  public static final String _FooBad4String = "FooBad4";

  public static final String _FooBad5String = "FooBad5";

  public static final java.lang.String _FooBad1 = new java.lang.String(
      _FooBad1String);

  public static final java.lang.String _FooBad2 = new java.lang.String(
      _FooBad2String);

  public static final java.lang.String _FooBad3 = new java.lang.String(
      _FooBad3String);

  public static final java.lang.String _FooBad4 = new java.lang.String(
      _FooBad4String);

  public static final java.lang.String _FooBad5 = new java.lang.String(
      _FooBad5String);

  public static final WhyTheFault FooBad1 = new WhyTheFault(_FooBad1);

  public static final WhyTheFault FooBad2 = new WhyTheFault(_FooBad2);

  public static final WhyTheFault FooBad3 = new WhyTheFault(_FooBad3);

  public static final WhyTheFault FooBad4 = new WhyTheFault(_FooBad4);

  public static final WhyTheFault FooBad5 = new WhyTheFault(_FooBad5);

  protected WhyTheFault(java.lang.String value) {
    this.value = value;
  }

  public java.lang.String getValue() {
    return value;
  }

  public static WhyTheFault fromValue(java.lang.String value)
      throws java.lang.IllegalStateException {
    if (FooBad1.value.equals(value)) {
      return FooBad1;
    } else if (FooBad2.value.equals(value)) {
      return FooBad2;
    } else if (FooBad3.value.equals(value)) {
      return FooBad3;
    } else if (FooBad4.value.equals(value)) {
      return FooBad4;
    } else if (FooBad5.value.equals(value)) {
      return FooBad5;
    }
    throw new IllegalArgumentException();
  }

  public static WhyTheFault fromString(String value)
      throws java.lang.IllegalStateException {
    if (value.equals(_FooBad1String)) {
      return FooBad1;
    } else if (value.equals(_FooBad2String)) {
      return FooBad2;
    } else if (value.equals(_FooBad3String)) {
      return FooBad3;
    } else if (value.equals(_FooBad4String)) {
      return FooBad4;
    } else if (value.equals(_FooBad5String)) {
      return FooBad5;
    }
    throw new IllegalArgumentException();
  }

  public String toString() {
    return value.toString();
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof WhyTheFault)) {
      return false;
    }
    return ((WhyTheFault) obj).value.equals(value);
  }

  public int hashCode() {
    return value.hashCode();
  }
}
