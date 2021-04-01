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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "portComponentName",
    "endpointAddressUri",
    "loginConfigOrMessageSecurityBinding",
    "transportGuarantee",
    "serviceQname",
    "tieClass",
    "servletImplClass",
    "debuggingEnabled"
})
@XmlRootElement(name = "webservice-endpoint")
public class WebserviceEndpoint
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "port-component-name", required = true)
    protected String portComponentName;
    @XmlElement(name = "endpoint-address-uri")
    protected String endpointAddressUri;
    @XmlElements({
        @XmlElement(name = "login-config", type = LoginConfig.class),
        @XmlElement(name = "message-security-binding", type = MessageSecurityBinding.class)
    })
    protected List<Serializable> loginConfigOrMessageSecurityBinding;
    @XmlElement(name = "transport-guarantee")
    protected String transportGuarantee;
    @XmlElement(name = "service-qname")
    protected ServiceQname serviceQname;
    @XmlElement(name = "tie-class")
    protected String tieClass;
    @XmlElement(name = "servlet-impl-class")
    protected String servletImplClass;
    @XmlElement(name = "debugging-enabled")
    protected String debuggingEnabled;

    /**
     * Gets the value of the portComponentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortComponentName() {
        return portComponentName;
    }

    /**
     * Sets the value of the portComponentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortComponentName(String value) {
        this.portComponentName = value;
    }

    /**
     * Gets the value of the endpointAddressUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndpointAddressUri() {
        return endpointAddressUri;
    }

    /**
     * Sets the value of the endpointAddressUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndpointAddressUri(String value) {
        this.endpointAddressUri = value;
    }

    /**
     * Gets the value of the loginConfigOrMessageSecurityBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loginConfigOrMessageSecurityBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoginConfigOrMessageSecurityBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoginConfig }
     * {@link MessageSecurityBinding }
     * 
     * 
     */
    public List<Serializable> getLoginConfigOrMessageSecurityBinding() {
        if (loginConfigOrMessageSecurityBinding == null) {
            loginConfigOrMessageSecurityBinding = new ArrayList<Serializable>();
        }
        return this.loginConfigOrMessageSecurityBinding;
    }

    /**
     * Gets the value of the transportGuarantee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportGuarantee() {
        return transportGuarantee;
    }

    /**
     * Sets the value of the transportGuarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportGuarantee(String value) {
        this.transportGuarantee = value;
    }

    /**
     * Gets the value of the serviceQname property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceQname }
     *     
     */
    public ServiceQname getServiceQname() {
        return serviceQname;
    }

    /**
     * Sets the value of the serviceQname property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceQname }
     *     
     */
    public void setServiceQname(ServiceQname value) {
        this.serviceQname = value;
    }

    /**
     * Gets the value of the tieClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTieClass() {
        return tieClass;
    }

    /**
     * Sets the value of the tieClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTieClass(String value) {
        this.tieClass = value;
    }

    /**
     * Gets the value of the servletImplClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServletImplClass() {
        return servletImplClass;
    }

    /**
     * Sets the value of the servletImplClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServletImplClass(String value) {
        this.servletImplClass = value;
    }

    /**
     * Gets the value of the debuggingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebuggingEnabled() {
        return debuggingEnabled;
    }

    /**
     * Sets the value of the debuggingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebuggingEnabled(String value) {
        this.debuggingEnabled = value;
    }

}
