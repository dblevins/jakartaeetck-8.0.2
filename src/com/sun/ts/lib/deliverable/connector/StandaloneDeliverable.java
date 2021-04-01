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

package com.sun.ts.lib.deliverable.connector;

import com.sun.ts.lib.deliverable.AbstractDeliverable;
import com.sun.ts.lib.deliverable.PropertyManagerInterface;
import com.sun.ts.lib.util.TestUtil;
import com.sun.ts.lib.implementation.sun.javaee.runtime.SunRIDeploymentInfo;
import com.sun.ts.lib.porting.DeploymentInfo;
import com.sun.javatest.TestEnvironment;

import java.util.Map;
import java.util.Properties;
import java.io.File;

/**
 * This class serves as a place for Deliverable specific info.
 */
public class StandaloneDeliverable extends AbstractDeliverable {

  public PropertyManagerInterface createPropertyManager(TestEnvironment te)
      throws Exception {
    StandalonePropertyManager propMgr = StandalonePropertyManager
        .getStandalonePropertyManager(te);

    return propMgr;
  }

  public PropertyManagerInterface createPropertyManager(Properties p)
      throws Exception {
    return StandalonePropertyManager.getStandalonePropertyManager(p);
  }

  public PropertyManagerInterface getPropertyManager() throws Exception {
    return StandalonePropertyManager.getStandalonePropertyManager();
  }

  public boolean supportsAutoDeployment() {
    return false;
  }

  public boolean supportsAutoJMSAdmin() {
    return false;
  }

  public boolean supportsInterop() {
    return false;
  }

  public Map getValidVehicles() {
    super.getValidVehicles();

    htTSValidVehicles.put("tests.service_eetest.vehicles",
        new String[] { "connectorservlet", "genericvehicle" });

    return htTSValidVehicles;
  }

  private void createDir(String sDir) throws Exception {
    File fDir = new File(sDir);

    if (!fDir.exists()) {
      if (!fDir.mkdirs()) {
        throw new Exception("Failed to create directory: " + sDir);
      }
      TestUtil.logHarnessDebug("Successfully created directory: " + sDir);
    }
  }
}
