//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.14 at 10:40:53 PM UTC 
//


package com.sun.ts.lib.implementation.sun.javaee.runtime.appclient;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "request-protection")
public class RequestProtection
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "auth-source")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String authSource;
    @XmlAttribute(name = "auth-recipient")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String authRecipient;

    /**
     * Gets the value of the authSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthSource() {
        return authSource;
    }

    /**
     * Sets the value of the authSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthSource(String value) {
        this.authSource = value;
    }

    /**
     * Gets the value of the authRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthRecipient() {
        return authRecipient;
    }

    /**
     * Sets the value of the authRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthRecipient(String value) {
        this.authRecipient = value;
    }

}
