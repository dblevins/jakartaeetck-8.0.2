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
 * @(#)SimpleGetSetParent.java 1.1 10/31/02
 */

package com.sun.ts.tests.jsp.api.javax_servlet.jsp.tagext.simpletagsupport;

import com.sun.ts.tests.jsp.common.util.JspTestUtil;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTag;
import javax.servlet.jsp.JspException;
import java.io.IOException;

public class SimpleGetSetParent extends SimpleTagSupport {

  /**
   * Default constructor.
   */
  public SimpleGetSetParent() {
    super();
  }

  /**
   * Validates that getParent() returns the expected result. This indirectly
   * ensures that the container called setParent().
   * 
   * @throws JspException
   * @throws IOException
   */
  public void doTag() throws JspException, IOException {
    JspTestUtil.debug("[SimpleGetSetParent] in doTag()");
    JspTag tag = this.getParent();
    if (tag != null) {
      if (tag instanceof SimpleTag) {
        this.getJspContext().getOut().println("Test PASSED");
      } else {
        this.getJspContext().getOut().println("Test FAILED.  SimpleTagSupport"
            + ".getParent() returned a non-null value, but was not an instance "
            + "of the expected parent class.  Recieved: "
            + tag.getClass().getName());
      }
    } else {
      this.getJspContext().getOut().println(
          "Test FAILED.  SimpleTagSupport" + ".getParent() returned null.");
    }
  }
}
