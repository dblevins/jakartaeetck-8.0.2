/*
 * Copyright (c) 2017, 2018 Oracle and/or its affiliates. All rights reserved.
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

package com.sun.ts.tests.appclient.deploy.metadatacomplete.testapp;

import java.io.PrintStream;
import javax.annotation.Resource;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.naming.NamingEnumeration;
import javax.naming.NameClassPair;
import java.util.Properties;
import com.sun.ts.lib.harness.EETest;
import com.sun.ts.lib.util.TestUtil;
import com.sun.ts.lib.util.TSNamingContext;
import com.sun.javatest.Status;
import javax.mail.Session;
import javax.mail.MailSessionDefinition;
import javax.ejb.EJB;
import javax.xml.ws.WebServiceRef;
import javax.annotation.sql.DataSourceDefinition;
import javax.jms.JMSConnectionFactoryDefinition;
import javax.jms.JMSDestinationDefinition;
import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import javax.persistence.PersistenceUnit;
import javax.persistence.EntityManagerFactory;


@MailSessionDefinition(name = "java:comp/myMailSession",
    host = "smtp.gmail.com",
    transportProtocol = "smtps",
    properties = {
        "mail.debug=true"
})
@DataSourceDefinition(name="java:global/MyApp/MyDataSource",
    className="org.apache.derby.jdbc.ClientDataSource",
    url="jdbc:derby://localhost:1527/derbyDB;create=true",
    user="cts1",
    password="cts1"
 )
@JMSConnectionFactoryDefinition(
	description="Define ConnectionFactory JSPMyTestConnectionFactory",
	interfaceName="javax.jms.ConnectionFactory",
    name="java:global/JSPMyTestConnectionFactory",
	user = "j2ee",
	password = "j2ee"
   )
@JMSDestinationDefinition(
    name = "java:app/jms/myappTopic",
    interfaceName = "javax.jms.Topic",
    destinationName = "MyPhysicalAppTopic"
)

public class TestAppClient extends EETest
{
  private InitialContext initialContext;
  private TSNamingContext nctx = null;
  private Properties props = null;
  @Resource(lookup="java:module/mybean")
  private static TestBean bean;
  @Resource(lookup="java:comp/myMailSession")
  private static Session session;
  @EJB
  static DataStoreRemote dataStore;
  @WebServiceRef(name="service/HelloService")
  static HelloService service;
  @Resource(lookup="java:app/jms/TestConnectionFactory")
  private static ConnectionFactory testFac;
  @Resource(lookup="java:app/jms/TestQ")
  private static Queue testQueue;
  @PersistenceUnit(unitName = "TEST-EM-APPCLIENT")
  static EntityManagerFactory emf;
  @Resource(lookup="java:global/MyApp/MyDataSource")
  private static Object dataSource;
  @Resource(lookup="java:global/JSPMyTestConnectionFactory")
  private static Object connFactory;
  @Resource(lookup="java:app/jms/myappTopic")
  private static Object destination;
  
  

  private Object lookup(String jndiName)
    throws NamingException
  {
    return this.initialContext.lookup(jndiName);
  }
  /*
     * @class.setup_props:  org.omg.CORBA.ORBClass;
     *                      java.naming.factory.initial;
     *                      generateSQL;
     *
     * @class.testArgs:     -ap tssql.stmt
     *
     */
  public void setup(String[] args, Properties props) throws Fault {
        this.props = props;
      
	try {
	    nctx = new TSNamingContext();
	    logMsg("[Client] Setup succeed (got naming context).");
        } catch (Exception e) {
            throw new Fault("Setup failed:", e);
        }
    } 
  
  public static void main(String[] args) {
        TestAppClient theTests = new TestAppClient();
        Status s = theTests.run(args, System.out, System.err);
        s.exit();
    }
	
	/**
     * @testName:  testResourceLookup
     *
     * @assertion_ids: JavaEE:SPEC:323
     *
     * @test_Strategy:
     *
     *    We check that:
     *
     *      - When the meta-data complete attribute is set to true,ManagedBean annotation
     *      - should work as metadata-complete attribute is not applicable to it.
     *      
     */
    public void testResourceLookup() throws Fault {
        try {
            
	    Object mybean = 
		        nctx.lookup("java:module/mybean");
	    logMsg("mybean"+mybean);
      	if(null == mybean){
			throw new Fault("lookup failed!");
		}   
	    }
         catch (Exception e) {
            throw new Fault("lookup failed: " + e, e);
	}
    }
	
	/**
     * @testName:  testResourceAnnotation
     *
     * @assertion_ids: JavaEE:SPEC:323
     *
     * @test_Strategy:
	 *
     *    We check that:
     *
     *      - When the meta-data complete attribute is set to true,Resource annotation should be ignored
	 *      - as it is one of the annotations to which metadat-complete is applicable.
     *      
     */
    public void testResourceAnnotation() throws Fault {    

        try {
        logMsg("bean"+bean);    
	    if(null != bean){
			throw new Fault("ResourceAnnotation test failed!");
		}    
        
            
	    }
         catch (Exception e) {
            throw new Fault("ResourceAnnotation test failed: " + e, e);
	}
    }
	
	/**
     * @testName:  testMailSession
     *
     * @assertion_ids: JavaEE:SPEC:323
     *
     * @test_Strategy:
     *
     *    We check that:
     *
     *      - When the meta-data complete attribute is set to true,Resource annotation should be ignored
	 *      - as it is one of the annotations to which metadat-complete is applicable.
     *      
     */
    public void testMailSession() throws Fault {    

        try {
            
	    Object sess = 
		        nctx.lookup("mail/Session");
        logMsg("sess"+sess);				
        if(null == sess){
			throw new Fault("lookup failed!");
		}
            
	    }
         catch (Exception e) {
            throw new Fault("MailSession test failed: " + e, e);
	}
    }
	
	/**
     * @testName:  testMailSessionDefinition
     *
     * @assertion_ids: JavaEE:SPEC:323
     *
     * @test_Strategy:
     *
     *    We check that:
     *
     *      - When the meta-data complete attribute is set to true,MailSessionDefinition annotation should be ignored
	 *      - as it is one of the annotations to which metadat-complete is applicable. 
     *      
     */
    public void testMailSessionDefinition() throws Fault {    

        try {
            
	    //Session sess = 
		        //(Session)nctx.lookup("java:comp/myMailSession");
        logMsg("session"+session);				
        //logMsg("mail.debug:"+session.getProperty("mail.debug"));
		if(null != session){
			throw new Fault("MailSessionDefinition test failed!");
		}
            
	    }
         catch (Exception e) {
            throw new Fault("MailSessionDefinition test failed: " + e, e);
	}
    }
	
	/**
     * @testName:  testEJBAnnotation
     *
     * @assertion_ids: JavaEE:SPEC:323
     *
     * @test_Strategy: 
     *
     *    We check that:
     *
     *      - When the meta-data complete attribute is set to true,EJB annotation should be ignored
	 *      - as it is one of the annotations to which metadat-complete is applicable.
     *      
     */
    public void testEJBAnnotation() throws Fault {    

        try {
            
	    logMsg("datastore"+dataStore);				
        if(null != dataStore){
			throw new Fault("EJBAnnotation test failed!");
		}
            
	    }
         catch (Exception e) {
            throw new Fault("EJBAnnotation test failed: " + e, e);
	}
    }
	
	/**
     * @testName:  testWebServiceRefAnnotation
     *
     * @assertion_ids: JavaEE:SPEC:323
     *
     * @test_Strategy: 
     *
     *    We check that:
     *
     *      - When the meta-data complete attribute is set to true,WebServiceRef annotation should be ignored
	 *      - as it is one of the annotations to which metadat-complete is applicable. 
     *      
     */
    public void testWebServiceRefAnnotation() throws Fault {    

        try {
            
	    
		//logMsg("datastore"+dataStore);
        logMsg("service"+service);		
        if(null != service){
			throw new Fault("WebServiceRefAnnotation test failed!");
		}
            
	    }
         catch (Exception e) {
            throw new Fault("WebServiceRefAnnotation test failed: " + e, e);
	}
    }
	
	/**
     * @testName:  testDataSourceDefinitionAnnotation
     *
     * @assertion_ids: JavaEE:SPEC:323
     *
     * @test_Strategy:    
     *
     *    We check that:
     *
     *      - When the meta-data complete attribute is set to true,DataSourceDefinition annotation should be ignored
	 *      - as it is one of the annotations to which metadat-complete is applicable. 
     *      
     */
    public void testDataSourceDefinitionAnnotation() throws Fault {    

        try {
            
	    
		//logMsg("datastore"+dataStore);
        //logMsg("service"+service);		
        //Object dataSource = 
		        //nctx.lookup("java:global/MyApp/MyDataSource");
        if(dataSource != null){
			throw new Fault("DataSourceDefinition test failed!");
		}    
	    }
         catch (Exception e) {
            throw new Fault("DataSourceDefinition test failed: " + e, e);
	}
    }
	
	/**
     * @testName:  testJMSConnectionFactoryDefinitionAnnotation
     *
     * @assertion_ids: JavaEE:SPEC:323
     *
     * @test_Strategy:    
     *
     *    We check that:
     *
     *      - When the meta-data complete attribute is set to true,JMSConnectionFactoryDefinition annotation should be ignored
	 *      - as it is one of the annotations to which metadat-complete is applicable.
     *      
     */
    public void testJMSConnectionFactoryDefinitionAnnotation() throws Fault {    

        try {
            
	    
		//logMsg("datastore"+dataStore);
        //logMsg("service"+service);		
        //Object connFactory = 
		        //nctx.lookup("java:global/JSPMyTestConnectionFactory");
	    logMsg("connFactory"+connFactory);
        if(connFactory != null){
			throw new Fault("JMSConnectionFactoryDefinition test failed!");
		}    
	    }
         catch (Exception e) {
            throw new Fault("JMSConnectionFactoryDefinition test failed: " + e, e);
	}
    }
	
	/**
     * @testName:  testJMSDestinationDefinitionAnnotation
     *
     * @assertion_ids: JavaEE:SPEC:323
     *
     * @test_Strategy:     
     *
     *    We check that:
     *
     *      - When the meta-data complete attribute is set to true,JMSDestinationDefinition annotation should be ignored
	 *      - as it is one of the annotations to which metadat-complete is applicable.
     *      
     */
    public void testJMSDestinationDefinitionAnnotation() throws Fault {    

        try {
            
	    
		//logMsg("datastore"+dataStore);
        //logMsg("service"+service);		
        //Object destination = 
		        //nctx.lookup("java:app/jms/myappTopic");
	    logMsg("destination"+destination);
        if(destination != null){
			throw new Fault("JMSDestinationDefinition test failed!");
		}    
	    }
         catch (Exception e) {
            throw new Fault("JMSDestinationDefinition test failed: " + e, e);
	}
    }
	
	/**
     * @testName:  testConnectionFactoryDefinitionAnnotation
     *
     * @assertion_ids: JavaEE:SPEC:323
     *
     * @test_Strategy:     
     *
     *    We check that:
     *
     *      - When the meta-data complete attribute is set to true,ConnectionFactoryDefinition annotation should be ignored
	 *      - as it is one of the annotations to which metadat-complete is applicable.
     *      
     */
    public void testConnectionFactoryDefinitionAnnotation() throws Fault {    

        try {
            
	    
		//logMsg("datastore"+dataStore);
        //logMsg("service"+service);
        logMsg("testFac"+testFac);		
        if(testFac != null){
			throw new Fault("ConnectionFactoryDefinition test failed!");
		}    
	    }
         catch (Exception e) {
            throw new Fault("ConnectionFactoryDefinition test failed: " + e, e);
	}
    }
	
	/**
     * @testName:  testAdministeredObjectDefinitionAnnotation
     *
     * @assertion_ids: JavaEE:SPEC:323
     *
     * @test_Strategy:    
     *
     *    We check that:
     *
     *      - When the meta-data complete attribute is set to true,AdministeredObjectDefinition annotation should be ignored
	 *      - as it is one of the annotations to which metadat-complete is applicable.
     *      
     */
    public void testAdministeredObjectDefinitionAnnotation() throws Fault {    

        try {
            
	    
		//logMsg("datastore"+dataStore);
        //logMsg("service"+service);
        logMsg("testQueue"+testQueue);		
        if(testFac != null){
			throw new Fault("AdministeredObjectDefinition test failed!");
		}    
	    }
         catch (Exception e) {
            throw new Fault("AdministeredObjectDefinition test failed: " + e, e);
	}
    }
	
	/**
     * @testName:  testPersistenceUnitDefinitionAnnotation
     *
     * @assertion_ids: JavaEE:SPEC:323
     *
     * @test_Strategy:     
     *
     *    We check that:
     *
     *      - When the meta-data complete attribute is set to true,PersistenceUnitDefinition annotation should be ignored
	 *      - as it is one of the annotations to which metadat-complete is applicable.
     *      
     */
    public void testPersistenceUnitDefinitionAnnotation() throws Fault {    

        try {
            
	    
		//logMsg("datastore"+dataStore);
        //logMsg("service"+service);
        logMsg("emf"+emf);		
        if(emf != null){
			throw new Fault("PersistenceUnitDefinition test failed!");
		}    
	    }
         catch (Exception e) {
            throw new Fault("PersistenceUnitDefinition test failed: " + e, e);
	}
    }
	
	
	public void cleanup()  throws Fault {
        logMsg("[Client] cleanup()");
    }
	
  
}
