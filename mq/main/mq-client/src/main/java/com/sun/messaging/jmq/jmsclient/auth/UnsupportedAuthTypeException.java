/*
 * Copyright (c) 2000, 2017 Oracle and/or its affiliates. All rights reserved.
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
 * @(#)UnsupportedAuthTypeException.java	1.4 06/27/07
 */

package com.sun.messaging.jmq.jmsclient.auth;

public class UnsupportedAuthTypeException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 3648729855884353046L;

    public UnsupportedAuthTypeException() {
        super();
    }

    public UnsupportedAuthTypeException(String msg) {
        super(msg);
    }

}
