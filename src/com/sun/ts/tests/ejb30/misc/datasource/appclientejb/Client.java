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
 * $Id: Client.java 58926 2009-08-03 19:41:14Z cf126330 $
 */

package com.sun.ts.tests.ejb30.misc.datasource.appclientejb;

import java.sql.Connection;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.annotation.sql.DataSourceDefinition;
import javax.annotation.sql.DataSourceDefinitions;
import javax.ejb.EJB;

import com.sun.javatest.Status;
import com.sun.ts.lib.harness.EETest;
import com.sun.ts.tests.ejb30.assembly.appres.common.AppResRemoteIF;
import com.sun.ts.tests.ejb30.common.helper.Helper;
import com.sun.ts.tests.ejb30.common.helper.ServiceLocator;
import com.sun.ts.tests.ejb30.lite.packaging.war.datasource.common.DataSourceTest;

@DataSourceDefinitions({
    @DataSourceDefinition(name="java:comp/env/compds",
            className="org.apache.derby.jdbc.ClientDataSource",
            portNumber=1527,
            serverName="localhost",
            databaseName="derbyDB",
            user="cts1",
            password="cts1",
            
            description="ds1",
            initialPoolSize=1,
            
            loginTimeout=300,
            maxIdleTime=1000,
            maxPoolSize=2,
            minPoolSize=1,
            transactional=false,
            properties={},
            url="jdbc:derby://${derby.server}:${derby.port}/${derby.dbName};create=true"
    ),
    @DataSourceDefinition(name="defaultds",
            className="org.apache.derby.jdbc.ClientDataSource",
            portNumber=1527,
            serverName="localhost",
            databaseName="derbyDB",
            user="cts1",
            password="cts1",
            transactional=false,
            properties={}),
            
    @DataSourceDefinition(name="java:module/env/moduleds",
            className="org.apache.derby.jdbc.ClientDataSource",
            portNumber=1527,
            serverName="localhost",
            databaseName="derbyDB",
            user="cts1",
            password="cts1",
            transactional=false,
            properties={}),
            
    @DataSourceDefinition(name="java:app/env/appclient/appds",
            className="org.apache.derby.jdbc.ClientDataSource",
            portNumber=1527,
            serverName="localhost",
            databaseName="derbyDB",
            user="cts1",
            password="cts1",
            transactional=false,
            properties={}),
            
    @DataSourceDefinition(name="java:global/env/ts/datasource/appclient/globalds",
            className="org.apache.derby.jdbc.ClientDataSource",
            portNumber=1527,
            serverName="localhost",
            databaseName="derbyDB",
            user="cts1",
            password="cts1",
            transactional=false,
            properties={})
    })
public class Client extends EETest {
    private static StringBuilder postConstructRecords = new StringBuilder();
    
    @EJB
    private static AppResRemoteIF dataSourceBean;
    
    public static void main(String[] args) {
        Client theTests = new Client();
        Status s = theTests.run(args, System.out, System.err);
        s.exit();
    }
    
    public void setup(String[] args, Properties p) {
    }
    
    public void cleanup() {}

    @SuppressWarnings("unused")
    @PostConstruct
    private static void postConstruct() {
        ServiceLocator.lookupShouldFail("java:comp/env/compdsejb", postConstructRecords);
        ServiceLocator.lookupShouldFail("java:comp/env/defaultdsejb", postConstructRecords);
        ServiceLocator.lookupShouldFail("java:module/env/moduledsejb", postConstructRecords);
        
        Helper.getLogger().info(postConstructRecords.toString());
        
        DataSourceTest.verifyDataSource(postConstructRecords, false, 
                "java:comp/env/compds",
                "java:comp/env/defaultds",
                "java:module/env/moduleds",
                "java:app/env/appclient/appds",
                "java:global/env/ts/datasource/appclient/globalds",
                
                "java:app/env/ejb/appds",
                "java:global/env/ts/datasource/ejb/globalds"
                );
    }

    /*
     * @testName: clientPostConstruct
     * 
     * @test_Strategy: verify data sources injected and declared in descriptors inside appclient
     */
    public void clientPostConstruct() {
        Helper.getLogger().info(postConstructRecords.toString());
    }
    
    /*
     * @testName: ejbPostConstruct
     * 
     * @test_Strategy: verify data sources injected and declared in descriptors inside ejb 
     */
    public void ejbPostConstruct() {
        Helper.getLogger().info(dataSourceBean.getPostConstructRecords().toString());
    }

}
