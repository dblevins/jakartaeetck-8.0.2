/*
 * Copyright (c) 2017, 2018 Oracle and/or its affiliates. All rights reserved.
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

package com.sun.ts.tests.jsonb.customizedmapping.instantiation.model;

import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;

public class SimpleFactoryCreatorContainer {
  private String stringInstance;

  private Integer integerInstance;

  private float floatInstance;

  SimpleFactoryCreatorContainer() {
  }

  @JsonbCreator
  public static SimpleFactoryCreatorContainer createInstance(
      @JsonbProperty("constructorString") String stringInstance) {
    SimpleFactoryCreatorContainer simpleFactoryCreatorContainer = new SimpleFactoryCreatorContainer();
    simpleFactoryCreatorContainer.setStringInstance("Factory String");
    simpleFactoryCreatorContainer.setIntegerInstance(2);
    simpleFactoryCreatorContainer.setFloatInstance(3);
    return simpleFactoryCreatorContainer;
  }

  public String getStringInstance() {
    return stringInstance;
  }

  public void setStringInstance(String stringInstance) {
    this.stringInstance = stringInstance;
  }

  public Integer getIntegerInstance() {
    return integerInstance;
  }

  public void setIntegerInstance(Integer integerInstance) {
    this.integerInstance = integerInstance;
  }

  public float getFloatInstance() {
    return floatInstance;
  }

  public void setFloatInstance(float floatInstance) {
    this.floatInstance = floatInstance;
  }
}
