/*
 * Copyright (c) 2013, 2018 Oracle and/or its affiliates. All rights reserved.
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

package com.sun.ts.tests.websocket.ee.javax.websocket.coder;

import java.io.IOException;
import java.io.Reader;

import javax.websocket.DecodeException;
import javax.websocket.EndpointConfig;

import com.sun.ts.tests.websocket.common.stringbean.StringBean;
import com.sun.ts.tests.websocket.common.stringbean.StringBeanTextStreamDecoder;

public class InitDestroyTextStreamDecoder extends StringBeanTextStreamDecoder {
  @Override
  public void init(EndpointConfig config) {
    Logger.onInit(getClass());
  }

  @Override
  public void destroy() {
    Logger.onDestroy(getClass());
  }

  @Override
  public StringBean decode(Reader r) throws DecodeException, IOException {
    Logger.onCode(getClass());
    return super.decode(r);
  };
}
