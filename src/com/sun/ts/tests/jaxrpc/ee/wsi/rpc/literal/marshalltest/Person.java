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

public class Person {
  protected java.lang.String name;

  protected int age;

  protected java.lang.String sex;

  protected boolean adult;

  protected float id;

  public Person() {
  }

  public Person(java.lang.String name, int age, java.lang.String sex,
      boolean adult, float id) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.adult = adult;
    this.id = id;
  }

  public java.lang.String getName() {
    return name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public java.lang.String getSex() {
    return sex;
  }

  public void setSex(java.lang.String sex) {
    this.sex = sex;
  }

  public boolean isAdult() {
    return adult;
  }

  public void setAdult(boolean adult) {
    this.adult = adult;
  }

  public float getId() {
    return id;
  }

  public void setId(float id) {
    this.id = id;
  }
}
