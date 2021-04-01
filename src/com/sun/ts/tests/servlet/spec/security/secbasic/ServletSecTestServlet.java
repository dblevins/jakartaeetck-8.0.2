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

package com.sun.ts.tests.servlet.spec.security.secbasic;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletSecTestServlet extends HttpServlet {

  public void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    PrintWriter out = response.getWriter();

    System.out.println("Inside  ServletSecTestServlet ....." + "<BR>");
    System.out.println("The user principal is: "
        + request.getUserPrincipal().getName() + "<BR>");
    System.err.println("The user principal is: "
        + request.getUserPrincipal().getName() + "<BR>");

    out.println("The user principal is: " + request.getUserPrincipal().getName()
        + "<BR>");
    out.println("getRemoteUser(): " + request.getRemoteUser() + "<BR>");

    out.println("Inside  ServletSecTestServlet ....." + "<BR>"); // used for
                                                                 // validating
                                                                 // test7

    // Surround these with !'s so they are easier to search for.
    // (i.e. we can search for !true! or !false!)
    out.println(
        "isUserInRole(\"ADM\"): !" + request.isUserInRole("ADM") + "!<BR>");
    out.println(
        "isUserInRole(\"MGR\"): !" + request.isUserInRole("MGR") + "!<BR>");
    out.println(
        "isUserInRole(\"VP\"): !" + request.isUserInRole("VP") + "!<BR>");
    out.println(
        "isUserInRole(\"EMP\"): !" + request.isUserInRole("EMP") + "!<BR>");
    out.println("isUserInRole(\"Administrator\"): !"
        + request.isUserInRole("Administrator") + "!<BR>");

  }
}
