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
    "webserviceDescriptionName",
    "wsdlPublishLocation"
})
@XmlRootElement(name = "webservice-description")
public class WebserviceDescription
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "webservice-description-name", required = true)
    protected String webserviceDescriptionName;
    @XmlElement(name = "wsdl-publish-location")
    protected String wsdlPublishLocation;

    /**
     * Gets the value of the webserviceDescriptionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebserviceDescriptionName() {
        return webserviceDescriptionName;
    }

    /**
     * Sets the value of the webserviceDescriptionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebserviceDescriptionName(String value) {
        this.webserviceDescriptionName = value;
    }

    /**
     * Gets the value of the wsdlPublishLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsdlPublishLocation() {
        return wsdlPublishLocation;
    }

    /**
     * Sets the value of the wsdlPublishLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsdlPublishLocation(String value) {
        this.wsdlPublishLocation = value;
    }

}