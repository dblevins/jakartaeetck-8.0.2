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
    "resourceAdapterMid",
    "activationConfig"
})
@XmlRootElement(name = "mdb-resource-adapter")
public class MdbResourceAdapter
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "resource-adapter-mid", required = true)
    protected String resourceAdapterMid;
    @XmlElement(name = "activation-config")
    protected ActivationConfig activationConfig;

    /**
     * Gets the value of the resourceAdapterMid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceAdapterMid() {
        return resourceAdapterMid;
    }

    /**
     * Sets the value of the resourceAdapterMid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceAdapterMid(String value) {
        this.resourceAdapterMid = value;
    }

    /**
     * Gets the value of the activationConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationConfig }
     *     
     */
    public ActivationConfig getActivationConfig() {
        return activationConfig;
    }

    /**
     * Sets the value of the activationConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationConfig }
     *     
     */
    public void setActivationConfig(ActivationConfig value) {
        this.activationConfig = value;
    }

}