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
    "ejbRefName",
    "jndiName"
})
@XmlRootElement(name = "ejb-ref")
public class EjbRef
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ejb-ref-name", required = true)
    protected String ejbRefName;
    @XmlElement(name = "jndi-name", required = true)
    protected String jndiName;

    /**
     * Gets the value of the ejbRefName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEjbRefName() {
        return ejbRefName;
    }

    /**
     * Sets the value of the ejbRefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEjbRefName(String value) {
        this.ejbRefName = value;
    }

    /**
     * Gets the value of the jndiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJndiName() {
        return jndiName;
    }

    /**
     * Sets the value of the jndiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJndiName(String value) {
        this.jndiName = value;
    }

}