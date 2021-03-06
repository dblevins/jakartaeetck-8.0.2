//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.14 at 10:40:54 PM UTC 
//


package com.sun.ts.lib.implementation.sun.javaee.runtime.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contextRoot",
    "securityRoleMapping",
    "servlet",
    "idempotentUrlPattern",
    "sessionConfig",
    "ejbRef",
    "resourceRef",
    "resourceEnvRef",
    "serviceRef",
    "messageDestinationRef",
    "cache",
    "classLoader",
    "jspConfig",
    "localeCharsetInfo",
    "parameterEncoding",
    "property",
    "valve",
    "messageDestination",
    "webserviceDescription"
})
@XmlRootElement(name = "sun-web-app")
public class SunWebApp
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "error-url")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String errorUrl;
    @XmlAttribute(name = "httpservlet-security-provider")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String httpservletSecurityProvider;
    @XmlElement(name = "context-root")
    protected String contextRoot;
    @XmlElement(name = "security-role-mapping")
    protected List<SecurityRoleMapping> securityRoleMapping;
    protected List<Servlet> servlet;
    @XmlElement(name = "idempotent-url-pattern")
    protected List<IdempotentUrlPattern> idempotentUrlPattern;
    @XmlElement(name = "session-config")
    protected SessionConfig sessionConfig;
    @XmlElement(name = "ejb-ref")
    protected List<EjbRef> ejbRef;
    @XmlElement(name = "resource-ref")
    protected List<ResourceRef> resourceRef;
    @XmlElement(name = "resource-env-ref")
    protected List<ResourceEnvRef> resourceEnvRef;
    @XmlElement(name = "service-ref")
    protected List<ServiceRef> serviceRef;
    @XmlElement(name = "message-destination-ref")
    protected List<MessageDestinationRef> messageDestinationRef;
    protected Cache cache;
    @XmlElement(name = "class-loader")
    protected ClassLoader classLoader;
    @XmlElement(name = "jsp-config")
    protected JspConfig jspConfig;
    @XmlElement(name = "locale-charset-info")
    protected LocaleCharsetInfo localeCharsetInfo;
    @XmlElement(name = "parameter-encoding")
    protected ParameterEncoding parameterEncoding;
    protected List<Property> property;
    protected List<Valve> valve;
    @XmlElement(name = "message-destination")
    protected List<MessageDestination> messageDestination;
    @XmlElement(name = "webservice-description")
    protected List<WebserviceDescription> webserviceDescription;

    /**
     * Gets the value of the errorUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorUrl() {
        if (errorUrl == null) {
            return "";
        } else {
            return errorUrl;
        }
    }

    /**
     * Sets the value of the errorUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorUrl(String value) {
        this.errorUrl = value;
    }

    /**
     * Gets the value of the httpservletSecurityProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpservletSecurityProvider() {
        return httpservletSecurityProvider;
    }

    /**
     * Sets the value of the httpservletSecurityProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpservletSecurityProvider(String value) {
        this.httpservletSecurityProvider = value;
    }

    /**
     * Gets the value of the contextRoot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextRoot() {
        return contextRoot;
    }

    /**
     * Sets the value of the contextRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextRoot(String value) {
        this.contextRoot = value;
    }

    /**
     * Gets the value of the securityRoleMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityRoleMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityRoleMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityRoleMapping }
     * 
     * 
     */
    public List<SecurityRoleMapping> getSecurityRoleMapping() {
        if (securityRoleMapping == null) {
            securityRoleMapping = new ArrayList<SecurityRoleMapping>();
        }
        return this.securityRoleMapping;
    }

    /**
     * Gets the value of the servlet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servlet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServlet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Servlet }
     * 
     * 
     */
    public List<Servlet> getServlet() {
        if (servlet == null) {
            servlet = new ArrayList<Servlet>();
        }
        return this.servlet;
    }

    /**
     * Gets the value of the idempotentUrlPattern property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idempotentUrlPattern property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdempotentUrlPattern().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdempotentUrlPattern }
     * 
     * 
     */
    public List<IdempotentUrlPattern> getIdempotentUrlPattern() {
        if (idempotentUrlPattern == null) {
            idempotentUrlPattern = new ArrayList<IdempotentUrlPattern>();
        }
        return this.idempotentUrlPattern;
    }

    /**
     * Gets the value of the sessionConfig property.
     * 
     * @return
     *     possible object is
     *     {@link SessionConfig }
     *     
     */
    public SessionConfig getSessionConfig() {
        return sessionConfig;
    }

    /**
     * Sets the value of the sessionConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionConfig }
     *     
     */
    public void setSessionConfig(SessionConfig value) {
        this.sessionConfig = value;
    }

    /**
     * Gets the value of the ejbRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ejbRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEjbRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EjbRef }
     * 
     * 
     */
    public List<EjbRef> getEjbRef() {
        if (ejbRef == null) {
            ejbRef = new ArrayList<EjbRef>();
        }
        return this.ejbRef;
    }

    /**
     * Gets the value of the resourceRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceRef }
     * 
     * 
     */
    public List<ResourceRef> getResourceRef() {
        if (resourceRef == null) {
            resourceRef = new ArrayList<ResourceRef>();
        }
        return this.resourceRef;
    }

    /**
     * Gets the value of the resourceEnvRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceEnvRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceEnvRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceEnvRef }
     * 
     * 
     */
    public List<ResourceEnvRef> getResourceEnvRef() {
        if (resourceEnvRef == null) {
            resourceEnvRef = new ArrayList<ResourceEnvRef>();
        }
        return this.resourceEnvRef;
    }

    /**
     * Gets the value of the serviceRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceRef }
     * 
     * 
     */
    public List<ServiceRef> getServiceRef() {
        if (serviceRef == null) {
            serviceRef = new ArrayList<ServiceRef>();
        }
        return this.serviceRef;
    }

    /**
     * Gets the value of the messageDestinationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageDestinationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageDestinationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageDestinationRef }
     * 
     * 
     */
    public List<MessageDestinationRef> getMessageDestinationRef() {
        if (messageDestinationRef == null) {
            messageDestinationRef = new ArrayList<MessageDestinationRef>();
        }
        return this.messageDestinationRef;
    }

    /**
     * Gets the value of the cache property.
     * 
     * @return
     *     possible object is
     *     {@link Cache }
     *     
     */
    public Cache getCache() {
        return cache;
    }

    /**
     * Sets the value of the cache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cache }
     *     
     */
    public void setCache(Cache value) {
        this.cache = value;
    }

    /**
     * Gets the value of the classLoader property.
     * 
     * @return
     *     possible object is
     *     {@link ClassLoader }
     *     
     */
    public ClassLoader getClassLoader() {
        return classLoader;
    }

    /**
     * Sets the value of the classLoader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassLoader }
     *     
     */
    public void setClassLoader(ClassLoader value) {
        this.classLoader = value;
    }

    /**
     * Gets the value of the jspConfig property.
     * 
     * @return
     *     possible object is
     *     {@link JspConfig }
     *     
     */
    public JspConfig getJspConfig() {
        return jspConfig;
    }

    /**
     * Sets the value of the jspConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JspConfig }
     *     
     */
    public void setJspConfig(JspConfig value) {
        this.jspConfig = value;
    }

    /**
     * Gets the value of the localeCharsetInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LocaleCharsetInfo }
     *     
     */
    public LocaleCharsetInfo getLocaleCharsetInfo() {
        return localeCharsetInfo;
    }

    /**
     * Sets the value of the localeCharsetInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocaleCharsetInfo }
     *     
     */
    public void setLocaleCharsetInfo(LocaleCharsetInfo value) {
        this.localeCharsetInfo = value;
    }

    /**
     * Gets the value of the parameterEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterEncoding }
     *     
     */
    public ParameterEncoding getParameterEncoding() {
        return parameterEncoding;
    }

    /**
     * Sets the value of the parameterEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterEncoding }
     *     
     */
    public void setParameterEncoding(ParameterEncoding value) {
        this.parameterEncoding = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Property }
     * 
     * 
     */
    public List<Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Property>();
        }
        return this.property;
    }

    /**
     * Gets the value of the valve property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valve property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValve().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Valve }
     * 
     * 
     */
    public List<Valve> getValve() {
        if (valve == null) {
            valve = new ArrayList<Valve>();
        }
        return this.valve;
    }

    /**
     * Gets the value of the messageDestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageDestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageDestination }
     * 
     * 
     */
    public List<MessageDestination> getMessageDestination() {
        if (messageDestination == null) {
            messageDestination = new ArrayList<MessageDestination>();
        }
        return this.messageDestination;
    }

    /**
     * Gets the value of the webserviceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webserviceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebserviceDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebserviceDescription }
     * 
     * 
     */
    public List<WebserviceDescription> getWebserviceDescription() {
        if (webserviceDescription == null) {
            webserviceDescription = new ArrayList<WebserviceDescription>();
        }
        return this.webserviceDescription;
    }

}
