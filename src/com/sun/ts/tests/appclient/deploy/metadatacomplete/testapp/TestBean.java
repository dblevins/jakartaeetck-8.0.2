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

package com.sun.ts.tests.appclient.deploy.metadatacomplete.testapp;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.resource.ConnectionFactoryDefinition;
import javax.resource.AdministeredObjectDefinition;

@ConnectionFactoryDefinition(
	name = "java:app/jms/TestConnectionFactory",
	description = "application scoped jms connector resource definition",
	interfaceName = "javax.jms.ConnectionFactory",
	resourceAdapter="jmsra"
)
@AdministeredObjectDefinition(
                name = "java:app/jms/TestQ",
                description = "application scoped AdminObjectDefinition",
                interfaceName = "javax.jms.Queue",
                className = "com.sun.messaging.Queue",
                resourceAdapter="jmsra")
@ManagedBean("mybean")
public class TestBean {

  public TestBean() {
    System.out.println("TestBean : Constructor");
  }

  @PostConstruct
  public void postConstruct() {
    System.out.println("TestBean : postConstruct");
  }

  @PreDestroy
  public void preDestroy() {
    System.out.println("TestBean : preDestroy");
  }
}
