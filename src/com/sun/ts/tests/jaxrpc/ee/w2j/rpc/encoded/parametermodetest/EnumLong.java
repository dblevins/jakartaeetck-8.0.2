/*
 * Copyright (c) 2018 Oracle and/or its affiliates. All rights reserved.
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

// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.1, build R5)
// Generated source version: 1.1.1

package com.sun.ts.tests.jaxrpc.ee.w2j.rpc.encoded.parametermodetest;

import java.util.Map;
import java.util.HashMap;

public class EnumLong {
  private long value;

  private static Map valueMap = new HashMap();

  public static final long _value1 = -9223372036854775808L;

  public static final long _value2 = 9223372036854775807L;

  public static final EnumLong value1 = new EnumLong(_value1);

  public static final EnumLong value2 = new EnumLong(_value2);

  protected EnumLong(long value) {
    this.value = value;
    valueMap.put(this.toString(), this);
  }

  public long getValue() {
    return value;
  }

  public static EnumLong fromValue(long value)
      throws java.lang.IllegalStateException {
    if (value1.value == value) {
      return value1;
    } else if (value2.value == value) {
      return value2;
    }
    throw new IllegalArgumentException();
  }

  public static EnumLong fromString(String value)
      throws java.lang.IllegalStateException {
    EnumLong ret = (EnumLong) valueMap.get(value);
    if (ret != null) {
      return ret;
    }
    if (value.equals("-9223372036854775808")) {
      return value1;
    } else if (value.equals("9223372036854775807")) {
      return value2;
    }
    throw new IllegalArgumentException();
  }

  public String toString() {
    return new Long(value).toString();
  }

  private Object readResolve() throws java.io.ObjectStreamException {
    return fromValue(getValue());
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof EnumLong)) {
      return false;
    }
    return ((EnumLong) obj).value == value;
  }

  public int hashCode() {
    return new Long(value).toString().hashCode();
  }
}
