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

/*
 * $URL$ $LastChangedDate$
 */

package com.sun.ts.tests.servlet.api.javax_servlet.servletoutputstream;

import java.io.PrintWriter;
import com.sun.javatest.Status;
import com.sun.ts.tests.servlet.common.client.AbstractUrlClient;

public class URLClient extends AbstractUrlClient {

  /**
   * Entry point for different-VM execution. It should delegate to method
   * run(String[], PrintWriter, PrintWriter), and this method should not contain
   * any test configuration.
   */
  public static void main(String[] args) {
    URLClient theTests = new URLClient();
    Status s = theTests.run(args, new PrintWriter(System.out),
        new PrintWriter(System.err));
    s.exit();
  }

  /**
   * Entry point for same-VM execution. In different-VM execution, the main
   * method delegates to this method.
   */
  public Status run(String args[], PrintWriter out, PrintWriter err) {

    setContextRoot("/servlet_js_servletoutputstream_web");
    setServletName("TestServlet");

    return super.run(args, out, err);
  }

  /*
   * @class.setup_props: webServerHost; webServerPort; ts_home;
   *
   */

  /* Run test */

  /*
   * @testName: print_StringTest
   *
   * @assertion_ids: Servlet:JAVADOC:140; Servlet:JAVADOC:73;
   *
   * @test_Strategy: Test for print(java.lang.String s) method
   */

  public void print_StringTest() throws Fault {
    TEST_PROPS.setProperty(SEARCH_STRING, "some text");

    TEST_PROPS.setProperty(APITEST, "print_StringTest");
    invoke();
  }

  /*
   * @testName: print_booleanTest
   *
   * @assertion_ids: Servlet:JAVADOC:140; Servlet:JAVADOC:75;
   *
   * @test_Strategy: Test for print(boolean b) method
   */

  public void print_booleanTest() throws Fault {
    String s = Boolean.TRUE.toString();

    StringBuffer ss = new StringBuffer(s);
    ss = ss.append(s);

    TEST_PROPS.setProperty(SEARCH_STRING, ss.toString());

    TEST_PROPS.setProperty(APITEST, "print_booleanTest");
    invoke();
  }

  /*
   * @testName: print_charTest
   *
   * @assertion_ids: Servlet:JAVADOC:140; Servlet:JAVADOC:77;
   *
   * @test_Strategy: Test for print(char c) method
   */

  public void print_charTest() throws Fault {
    TEST_PROPS.setProperty(SEARCH_STRING, "TEXT");

    TEST_PROPS.setProperty(APITEST, "print_charTest");
    invoke();
  }

  /*
   * @testName: print_doubleTest
   *
   * @assertion_ids: Servlet:JAVADOC:140; Servlet:JAVADOC:85;
   *
   * @test_Strategy: Test for print(double d) method
   */

  public void print_doubleTest() throws Fault {
    TEST_PROPS.setProperty(SEARCH_STRING, "12345.612345.6");

    TEST_PROPS.setProperty(APITEST, "print_doubleTest");
    invoke();
  }

  /*
   * @testName: print_floatTest
   *
   * @assertion_ids: Servlet:JAVADOC:140; Servlet:JAVADOC:83;
   *
   * @test_Strategy: Test for println(float f) method
   */

  public void print_floatTest() throws Fault {
    TEST_PROPS.setProperty(SEARCH_STRING, "1234.51234.5");

    TEST_PROPS.setProperty(APITEST, "print_floatTest");
    invoke();
  }

  /*
   * @testName: print_intTest
   *
   * @assertion_ids: Servlet:JAVADOC:140; Servlet:JAVADOC:79;
   *
   * @test_Strategy: Test for print(integer i) method
   */

  public void print_intTest() throws Fault {
    TEST_PROPS.setProperty(SEARCH_STRING, "11");

    TEST_PROPS.setProperty(APITEST, "print_intTest");
    invoke();
  }

  /*
   * @testName: print_longTest
   *
   * @assertion_ids: Servlet:JAVADOC:140; Servlet:JAVADOC:81;
   *
   * @test_Strategy: Test for print(long l) method
   */

  public void print_longTest() throws Fault {
    TEST_PROPS.setProperty(SEARCH_STRING, "12345678901234567890");

    TEST_PROPS.setProperty(APITEST, "print_longTest");
    invoke();
  }

  /*
   * @testName: printlnTest
   *
   * @assertion_ids: Servlet:JAVADOC:140; Servlet:JAVADOC:87;
   * Servlet:JAVADOC:89;
   *
   * @test_Strategy: Test for println () method
   */

  public void printlnTest() throws Fault {
    TEST_PROPS.setProperty(SEARCH_STRING, "some test");
    TEST_PROPS.setProperty(UNEXPECTED_RESPONSE_MATCH, "some test text");

    TEST_PROPS.setProperty(APITEST, "printlnTest");
    invoke();
  }

  /*
   * @testName: println_StringTest
   *
   * @assertion_ids: Servlet:JAVADOC:140; Servlet:JAVADOC:89;
   *
   * @test_Strategy: Test for println(java.lang.String s) method
   */

  public void println_StringTest() throws Fault {
    TEST_PROPS.setProperty(SEARCH_STRING, "some|text");
    TEST_PROPS.setProperty(UNEXPECTED_RESPONSE_MATCH, "sometext");

    TEST_PROPS.setProperty(APITEST, "println_StringTest");
    invoke();
  }

  /*
   * @testName: println_booleanTest
   *
   * @assertion_ids: Servlet:JAVADOC:140; Servlet:JAVADOC:91;
   *
   * @test_Strategy: Test for println(boolean b) method
   */

  public void println_booleanTest() throws Fault {
    String s = Boolean.TRUE.toString();

    StringBuffer ss = new StringBuffer(s);
    ss = ss.append(s);

    TEST_PROPS.setProperty(SEARCH_STRING, s);
    TEST_PROPS.setProperty(UNEXPECTED_RESPONSE_MATCH, ss.toString());

    TEST_PROPS.setProperty(APITEST, "println_booleanTest");
    invoke();
  }

  /*
   * @testName: println_charTest
   *
   * @assertion_ids: Servlet:JAVADOC:140; Servlet:JAVADOC:93;
   *
   * @test_Strategy: Test for println(char c) method
   */

  public void println_charTest() throws Fault {
    TEST_PROPS.setProperty(SEARCH_STRING, "T|E|X|T");
    TEST_PROPS.setProperty(UNEXPECTED_RESPONSE_MATCH, "TEXT");

    TEST_PROPS.setProperty(APITEST, "println_charTest");
    invoke();
  }

  /*
   * @testName: println_doubleTest
   *
   * @assertion_ids: Servlet:JAVADOC:140; Servlet:JAVADOC:101;
   *
   * @test_Strategy: Test for println(double d) method
   */

  public void println_doubleTest() throws Fault {
    TEST_PROPS.setProperty(SEARCH_STRING, "12345.6");
    TEST_PROPS.setProperty(UNEXPECTED_RESPONSE_MATCH, "12345.612345.6");

    TEST_PROPS.setProperty(APITEST, "println_doubleTest");
    invoke();
  }

  /*
   * @testName: println_floatTest
   *
   * @assertion_ids: Servlet:JAVADOC:140; Servlet:JAVADOC:99;
   *
   * @test_Strategy: Test for print(float f) method
   */

  public void println_floatTest() throws Fault {
    TEST_PROPS.setProperty(SEARCH_STRING, "1234.5");
    TEST_PROPS.setProperty(UNEXPECTED_RESPONSE_MATCH, "1234.51234.5");

    TEST_PROPS.setProperty(APITEST, "println_floatTest");
    invoke();
  }

  /*
   * @testName: println_intTest
   *
   * @assertion_ids: Servlet:JAVADOC:140; Servlet:JAVADOC:95;
   *
   * @test_Strategy: Test for println(integer i) method
   */

  public void println_intTest() throws Fault {
    TEST_PROPS.setProperty(SEARCH_STRING, "1");
    TEST_PROPS.setProperty(UNEXPECTED_RESPONSE_MATCH, "11");

    TEST_PROPS.setProperty(APITEST, "println_intTest");
    invoke();
  }

  /*
   * @testName: println_longTest
   *
   * @assertion_ids: Servlet:JAVADOC:140; Servlet:JAVADOC:97;
   *
   * @test_Strategy: Test for println(long l) method
   */

  public void println_longTest() throws Fault {
    TEST_PROPS.setProperty(SEARCH_STRING, "1234567890");
    TEST_PROPS.setProperty(UNEXPECTED_RESPONSE_MATCH, "12345678901234567890");

    TEST_PROPS.setProperty(APITEST, "println_longTest");
    invoke();
  }
}
