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
    "roleName",
    "principalNameOrGroupName"
})
@XmlRootElement(name = "security-role-mapping")
public class SecurityRoleMapping
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "role-name", required = true)
    protected String roleName;
    @XmlElements({
        @XmlElement(name = "principal-name", required = true, type = PrincipalName.class),
        @XmlElement(name = "group-name", required = true, type = GroupName.class)
    })
    protected List<Serializable> principalNameOrGroupName;

    /**
     * Gets the value of the roleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets the value of the roleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleName(String value) {
        this.roleName = value;
    }

    /**
     * Gets the value of the principalNameOrGroupName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the principalNameOrGroupName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrincipalNameOrGroupName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrincipalName }
     * {@link GroupName }
     * 
     * 
     */
    public List<Serializable> getPrincipalNameOrGroupName() {
        if (principalNameOrGroupName == null) {
            principalNameOrGroupName = new ArrayList<Serializable>();
        }
        return this.principalNameOrGroupName;
    }

}
