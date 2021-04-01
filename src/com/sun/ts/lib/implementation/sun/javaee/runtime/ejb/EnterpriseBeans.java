//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.14 at 10:40:54 PM UTC 
//


package com.sun.ts.lib.implementation.sun.javaee.runtime.ejb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
    "name",
    "uniqueId",
    "ejb",
    "pmDescriptors",
    "cmpResource",
    "messageDestination",
    "webserviceDescription"
})
@XmlRootElement(name = "enterprise-beans")
public class EnterpriseBeans
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String name;
    @XmlElement(name = "unique-id")
    protected String uniqueId;
    protected List<Ejb> ejb;
    @XmlElement(name = "pm-descriptors")
    protected PmDescriptors pmDescriptors;
    @XmlElement(name = "cmp-resource")
    protected CmpResource cmpResource;
    @XmlElement(name = "message-destination")
    protected List<MessageDestination> messageDestination;
    @XmlElement(name = "webservice-description")
    protected List<WebserviceDescription> webserviceDescription;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the uniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueId(String value) {
        this.uniqueId = value;
    }

    /**
     * Gets the value of the ejb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ejb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEjb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ejb }
     * 
     * 
     */
    public List<Ejb> getEjb() {
        if (ejb == null) {
            ejb = new ArrayList<Ejb>();
        }
        return this.ejb;
    }

    /**
     * Gets the value of the pmDescriptors property.
     * 
     * @return
     *     possible object is
     *     {@link PmDescriptors }
     *     
     */
    public PmDescriptors getPmDescriptors() {
        return pmDescriptors;
    }

    /**
     * Sets the value of the pmDescriptors property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmDescriptors }
     *     
     */
    public void setPmDescriptors(PmDescriptors value) {
        this.pmDescriptors = value;
    }

    /**
     * Gets the value of the cmpResource property.
     * 
     * @return
     *     possible object is
     *     {@link CmpResource }
     *     
     */
    public CmpResource getCmpResource() {
        return cmpResource;
    }

    /**
     * Sets the value of the cmpResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmpResource }
     *     
     */
    public void setCmpResource(CmpResource value) {
        this.cmpResource = value;
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