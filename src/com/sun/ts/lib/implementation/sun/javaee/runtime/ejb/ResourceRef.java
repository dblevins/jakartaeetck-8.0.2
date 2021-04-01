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
    "resRefName",
    "jndiName",
    "defaultResourcePrincipal"
})
@XmlRootElement(name = "resource-ref")
public class ResourceRef
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "res-ref-name", required = true)
    protected String resRefName;
    @XmlElement(name = "jndi-name", required = true)
    protected String jndiName;
    @XmlElement(name = "default-resource-principal")
    protected DefaultResourcePrincipal defaultResourcePrincipal;

    /**
     * Gets the value of the resRefName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResRefName() {
        return resRefName;
    }

    /**
     * Sets the value of the resRefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResRefName(String value) {
        this.resRefName = value;
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

    /**
     * Gets the value of the defaultResourcePrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultResourcePrincipal }
     *     
     */
    public DefaultResourcePrincipal getDefaultResourcePrincipal() {
        return defaultResourcePrincipal;
    }

    /**
     * Sets the value of the defaultResourcePrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultResourcePrincipal }
     *     
     */
    public void setDefaultResourcePrincipal(DefaultResourcePrincipal value) {
        this.defaultResourcePrincipal = value;
    }

}
