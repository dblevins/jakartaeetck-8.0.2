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

// Tie class generated by rmic, do not edit.
// Contents subject to change without notice.

package org.omg.stub.com.sun.ts.tests.rmiiiop.ee.standalone;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.rmi.CORBA.Tie;
import javax.rmi.CORBA.Util;
import org.omg.CORBA.BAD_OPERATION;
import org.omg.CORBA.ORB;
import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;
import org.omg.CORBA.portable.UnknownException;
import org.omg.PortableServer.Servant;

import com.sun.ts.tests.rmiiiop.ee.standalone.*;

public class _CallBackImpl_Tie extends Servant implements Tie {

  private CallBackImpl target = null;

  private static final String[] _type_ids = {
      "RMI:com.sun.ts.tests.rmiiiop.ee.standalone.CallBackInterface:0000000000000000" };

  public void setTarget(Remote target) {
    this.target = (CallBackImpl) target;
  }

  public Remote getTarget() {
    return target;
  }

  public org.omg.CORBA.Object thisObject() {
    return _this_object();
  }

  public void deactivate() {
    try {
      _poa().deactivate_object(_poa().servant_to_id(this));
    } catch (org.omg.PortableServer.POAPackage.WrongPolicy exception) {

    } catch (org.omg.PortableServer.POAPackage.ObjectNotActive exception) {

    } catch (org.omg.PortableServer.POAPackage.ServantNotActive exception) {

    }
  }

  public ORB orb() {
    return _orb();
  }

  public void orb(ORB orb) {
    try {
      ((org.omg.CORBA_2_3.ORB) orb).set_delegate(this);
    } catch (ClassCastException e) {
      throw new org.omg.CORBA.BAD_PARAM(
          "POA Servant requires an instance of org.omg.CORBA_2_3.ORB");
    }
  }

  public String[] _all_interfaces(org.omg.PortableServer.POA poa,
      byte[] objectId) {
    return _type_ids;
  }

  public OutputStream _invoke(String method, InputStream _in,
      ResponseHandler reply) throws SystemException {
    try {
      org.omg.CORBA_2_3.portable.InputStream in = (org.omg.CORBA_2_3.portable.InputStream) _in;
      switch (method.charAt(6)) {
      case 49:
        if (method.equals("method1")) {
          target.method1();
          OutputStream out = reply.createReply();
          return out;
        }
      case 50:
        if (method.equals("method2")) {
          target.method2();
          OutputStream out = reply.createReply();
          return out;
        }
      }
      throw new BAD_OPERATION();
    } catch (SystemException ex) {
      throw ex;
    } catch (Throwable ex) {
      throw new UnknownException(ex);
    }
  }
}
