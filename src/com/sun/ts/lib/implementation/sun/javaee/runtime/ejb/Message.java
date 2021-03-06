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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "javaMethodOrOperationName"
})
@XmlRootElement(name = "message")
public class Message
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElements({
        @XmlElement(name = "java-method", type = JavaMethod.class),
        @XmlElement(name = "operation-name", type = OperationName.class)
    })
    protected List<Serializable> javaMethodOrOperationName;

    /**
     * Gets the value of the javaMethodOrOperationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the javaMethodOrOperationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJavaMethodOrOperationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JavaMethod }
     * {@link OperationName }
     * 
     * 
     */
    public List<Serializable> getJavaMethodOrOperationName() {
        if (javaMethodOrOperationName == null) {
            javaMethodOrOperationName = new ArrayList<Serializable>();
        }
        return this.javaMethodOrOperationName;
    }

}
