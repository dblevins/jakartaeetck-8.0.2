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

package com.sun.ts.tests.jpa.core.override.mapkey;

import java.io.Serializable;
import java.util.Comparator;

public class EmployeeComparator implements Comparator, Serializable {

  public EmployeeComparator() {
  }

  public int compare(Object o1, Object o2) {
    Employee emp1 = (Employee) o1;
    Employee emp2 = (Employee) o2;

    if (emp1.getId() < emp2.getId()) {
      return -1;
    }
    if (emp1.getId() > emp2.getId()) {
      return 1;
    }
    return 0;
  }
}
