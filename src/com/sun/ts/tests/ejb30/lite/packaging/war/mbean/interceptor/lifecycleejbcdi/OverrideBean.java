/*
 * Copyright (c) 2009, 2018 Oracle and/or its affiliates. All rights reserved.
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
package com.sun.ts.tests.ejb30.lite.packaging.war.mbean.interceptor.lifecycleejbcdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

import com.sun.ts.tests.ejb30.common.helper.Helper;

@Stateless(name = "OverrideBean")
public class OverrideBean extends OverrideBeanBase {
  private static final String simpleName = "OverrideBean";

  // @PostConstruct //override with a non-PostConstruct, neither is invoked
  @Override
  public void postConstructInOverrideBeanBase() {
    historySingletonBean.addPostConstructRecordFor(this,
        "should not reach here: OverrideBean.postConstructInOverrideBeanBase");
  }

  @Override
  // @PreDestroy //override with a non-PreDestroy method, neither is invoked
  public void preDestroyInOverrideBeanBase() {
    historySingletonBean.addPostConstructRecordFor(this,
        "should not reach here: OverrideBean.preDestroyInOverrideBeanBase");
  }

  @SuppressWarnings("unused")
  @PostConstruct
  private void postConstruct() {
    historySingletonBean.addPostConstructRecordFor(this, simpleName);
  }

  @SuppressWarnings("unused")
  @PreDestroy
  private void preDestroy() {
    Helper.getLogger().info("In preDestroy of " + this);
  }
}
