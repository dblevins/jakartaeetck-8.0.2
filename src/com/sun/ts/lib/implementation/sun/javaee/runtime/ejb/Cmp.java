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
    "mappingProperties",
    "isOneOneCmp",
    "oneOneFinders",
    "prefetchDisabled"
})
@XmlRootElement(name = "cmp")
public class Cmp
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "mapping-properties")
    protected String mappingProperties;
    @XmlElement(name = "is-one-one-cmp")
    protected String isOneOneCmp;
    @XmlElement(name = "one-one-finders")
    protected OneOneFinders oneOneFinders;
    @XmlElement(name = "prefetch-disabled")
    protected PrefetchDisabled prefetchDisabled;

    /**
     * Gets the value of the mappingProperties property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappingProperties() {
        return mappingProperties;
    }

    /**
     * Sets the value of the mappingProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappingProperties(String value) {
        this.mappingProperties = value;
    }

    /**
     * Gets the value of the isOneOneCmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsOneOneCmp() {
        return isOneOneCmp;
    }

    /**
     * Sets the value of the isOneOneCmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsOneOneCmp(String value) {
        this.isOneOneCmp = value;
    }

    /**
     * Gets the value of the oneOneFinders property.
     * 
     * @return
     *     possible object is
     *     {@link OneOneFinders }
     *     
     */
    public OneOneFinders getOneOneFinders() {
        return oneOneFinders;
    }

    /**
     * Sets the value of the oneOneFinders property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneOneFinders }
     *     
     */
    public void setOneOneFinders(OneOneFinders value) {
        this.oneOneFinders = value;
    }

    /**
     * Gets the value of the prefetchDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link PrefetchDisabled }
     *     
     */
    public PrefetchDisabled getPrefetchDisabled() {
        return prefetchDisabled;
    }

    /**
     * Sets the value of the prefetchDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefetchDisabled }
     *     
     */
    public void setPrefetchDisabled(PrefetchDisabled value) {
        this.prefetchDisabled = value;
    }

}
