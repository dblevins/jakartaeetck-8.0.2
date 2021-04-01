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

package com.sun.ts.tests.jpa.core.derivedid.ex5a;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

/**
 *
 * @author Raja Perumal
 */
@Entity
@IdClass(DID5PersonId.class)
public class DID5Person implements Serializable {

  @Id
  String firstName;

  @Id
  String lastName;

  String ssn;

  public DID5Person(String firstName, String lastName, String ssn) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.ssn = ssn;
  }

  public DID5Person(DID5PersonId pId, String ssn) {
    this.firstName = pId.getFirstName();
    this.lastName = pId.getLastName();
    this.ssn = ssn;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public DID5Person() {
  }

  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final DID5Person other = (DID5Person) obj;
    if ((this.firstName == null) ? (other.firstName != null)
        : !this.firstName.equals(other.firstName)) {
      return false;
    }
    if ((this.lastName == null) ? (other.lastName != null)
        : !this.lastName.equals(other.lastName)) {
      return false;
    }
    if ((this.ssn == null) ? (other.ssn != null)
        : !this.ssn.equals(other.ssn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 53 * hash + (this.firstName != null ? this.firstName.hashCode() : 0);
    hash = 53 * hash + (this.lastName != null ? this.lastName.hashCode() : 0);
    hash = 53 * hash + (this.ssn != null ? this.ssn.hashCode() : 0);
    return hash;
  }

  @Override
  public String toString() {
    return "derivedssn5.DID5Person[ssn=" + ssn + "]";
  }
}
