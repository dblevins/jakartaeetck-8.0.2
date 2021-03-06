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

/*
 * $Id: DataSourceBean.java 58932 2009-08-04 02:38:56Z cf126330 $
 */
package com.sun.ts.tests.ejb30.misc.datasource.appclientejb;

import java.sql.Connection;
import javax.annotation.PostConstruct;
import javax.annotation.sql.DataSourceDefinition;
import javax.annotation.sql.DataSourceDefinitions;
import javax.ejb.Remote;
import javax.ejb.Singleton;

import com.sun.ts.tests.ejb30.assembly.appres.common.AppResBeanBase;
import com.sun.ts.tests.ejb30.assembly.appres.common.AppResRemoteIF;
import com.sun.ts.tests.ejb30.common.helper.Helper;
import com.sun.ts.tests.ejb30.common.helper.ServiceLocator;
import com.sun.ts.tests.ejb30.lite.packaging.war.datasource.common.DataSourceTest;

@Singleton
@Remote(AppResRemoteIF.class)

@DataSourceDefinitions({
    @DataSourceDefinition(name="java:comp/env/compdsejb",
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
    @DataSourceDefinition(name="defaultdsejb",
            className="org.apache.derby.jdbc.ClientDataSource",
            portNumber=1527,
            serverName="localhost",
            databaseName="derbyDB",
            user="cts1",
            password="cts1",
            transactional=false,
            properties={}),
            
    @DataSourceDefinition(name="java:module/env/moduledsejb",
            className="org.apache.derby.jdbc.ClientDataSource",
            portNumber=1527,
            serverName="localhost",
            databaseName="derbyDB",
            user="cts1",
            password="cts1",
            transactional=false,
            properties={}),
            
    @DataSourceDefinition(name="java:app/env/ejb/appds",
            className="org.apache.derby.jdbc.ClientDataSource",
            portNumber=1527,
            serverName="localhost",
            databaseName="derbyDB",
            user="cts1",
            password="cts1",
            transactional=false,
            properties={}),
            
    @DataSourceDefinition(name="java:global/env/ts/datasource/ejb/globalds",
            className="org.apache.derby.jdbc.ClientDataSource",
            portNumber=1527,
            serverName="localhost",
            databaseName="derbyDB",
            user="cts1",
            password="cts1",
            transactional=false,
            properties={})
    })
public class DataSourceBean extends AppResBeanBase {
    @SuppressWarnings("unused")
    @PostConstruct
    private void postConstruct() {
        ServiceLocator.lookupShouldFail("java:comp/env/compds", getPostConstructRecords());
        ServiceLocator.lookupShouldFail("java:comp/env/defaultds", getPostConstructRecords());
        ServiceLocator.lookupShouldFail("java:module/env/moduleds", getPostConstructRecords());
        
        Helper.getLogger().info(getPostConstructRecords().toString());
        
        DataSourceTest.verifyDataSource(getPostConstructRecords(), false, 
                "java:comp/env/compdsejb",
                "java:comp/env/defaultdsejb",
                "java:module/env/moduledsejb",
                "java:app/env/ejb/appds",
                "java:global/env/ts/datasource/ejb/globalds",
                
                "java:app/env/appclient/appds",
                "java:global/env/ts/datasource/appclient/globalds"
        );
    }
}
