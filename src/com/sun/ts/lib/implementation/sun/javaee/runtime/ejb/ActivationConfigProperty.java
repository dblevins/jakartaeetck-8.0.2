//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.14 at 10:40:54 PM UTC 
//


package com.sun.ts.lib.implementation.sun.javaee.runtime.ejb;

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
    "activationConfigPropertyName",
    "activationConfigPropertyValue"
})
@XmlRootElement(name = "activation-config-property")
public class ActivationConfigProperty
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "activation-config-property-name", required = true)
    protected String activationConfigPropertyName;
    @XmlElement(name = "activation-config-property-value", required = true)
    protected String activationConfigPropertyValue;

    /**
     * Gets the value of the activationConfigPropertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationConfigPropertyName() {
        return activationConfigPropertyName;
    }

    /**
     * Sets the value of the activationConfigPropertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationConfigPropertyName(String value) {
        this.activationConfigPropertyName = value;
    }

    /**
     * Gets the value of the activationConfigPropertyValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationConfigPropertyValue() {
        return activationConfigPropertyValue;
    }

    /**
     * Sets the value of the activationConfigPropertyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationConfigPropertyValue(String value) {
        this.activationConfigPropertyValue = value;
    }

}
