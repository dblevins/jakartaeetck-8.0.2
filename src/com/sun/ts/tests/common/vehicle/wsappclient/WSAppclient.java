/*
 * Copyright (c) 2006, 2018 Oracle and/or its affiliates. All rights reserved.
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
 * @(#)WSAppclient.java.src	1.6   06/02/27
 */

package  com.sun.ts.tests.common.vehicle.wsappclient;

import  com.sun.javatest.Status;
import  com.sun.ts.lib.util.*;
import  com.sun.ts.lib.harness.ServiceEETest;
import  com.sun.ts.tests.common.vehicle.VehicleClient;

import javax.xml.ws.WebServiceRef;
import javax.xml.ws.WebServiceRefs;
import javax.jws.HandlerChain;

/**
 * Class used as a client of all web services tests running in the 
 * appclient container.
 */

 

public class WSAppclient extends VehicleClient
{
  /* Run test in standalone mode */
  
   
  @WebServiceRef(name="service/WSSimple6Http")
  static com.sun.ts.tests.webservices12.wsdlImport.http.simple6.Simple6HttpSvc service = null;

  public static void main(String[] args) {
    WSAppclient client = new WSAppclient();
    VehicleClient.setClientSharedObject(service);
    Status s = client.run(args, System.out, System.err);
    if(s.getType() == Status.PASSED)
	TestUtil.logMsg("Test running in wsappclient vehicle passed");
    else
	TestUtil.logMsg("Test running in wsappclient vehicle failed");
    s.exit();
  }

}

