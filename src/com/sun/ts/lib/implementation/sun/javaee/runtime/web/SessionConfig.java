//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.14 at 10:40:54 PM UTC 
//


package com.sun.ts.lib.implementation.sun.javaee.runtime.web;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionManager",
    "sessionProperties",
    "cookieProperties"
})
@XmlRootElement(name = "session-config")
public class SessionConfig
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "session-manager")
    protected SessionManager sessionManager;
    @XmlElement(name = "session-properties")
    protected SessionProperties sessionProperties;
    @XmlElement(name = "cookie-properties")
    protected CookieProperties cookieProperties;

    /**
     * Gets the value of the sessionManager property.
     * 
     * @return
     *     possible object is
     *     {@link SessionManager }
     *     
     */
    public SessionManager getSessionManager() {
        return sessionManager;
    }

    /**
     * Sets the value of the sessionManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionManager }
     *     
     */
    public void setSessionManager(SessionManager value) {
        this.sessionManager = value;
    }

    /**
     * Gets the value of the sessionProperties property.
     * 
     * @return
     *     possible object is
     *     {@link SessionProperties }
     *     
     */
    public SessionProperties getSessionProperties() {
        return sessionProperties;
    }

    /**
     * Sets the value of the sessionProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionProperties }
     *     
     */
    public void setSessionProperties(SessionProperties value) {
        this.sessionProperties = value;
    }

    /**
     * Gets the value of the cookieProperties property.
     * 
     * @return
     *     possible object is
     *     {@link CookieProperties }
     *     
     */
    public CookieProperties getCookieProperties() {
        return cookieProperties;
    }

    /**
     * Sets the value of the cookieProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CookieProperties }
     *     
     */
    public void setCookieProperties(CookieProperties value) {
        this.cookieProperties = value;
    }

}