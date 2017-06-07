//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.02 at 10:08:09 AM BRT 
//


package br.org.usp.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EPCISEventListExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EPCISEventListExtensionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="TransformationEvent" type="{urn:epcglobal:epcis:xsd:1}TransformationEventType"/>
 *         &lt;element name="extension" type="{urn:epcglobal:epcis:xsd:1}EPCISEventListExtension2Type"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EPCISEventListExtensionType", propOrder = {
    "transformationEvent",
    "extension"
})
public class EPCISEventListExtensionType {

    @XmlElement(name = "TransformationEvent")
    protected TransformationEventType transformationEvent;
    protected EPCISEventListExtension2Type extension;

    /**
     * Gets the value of the transformationEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransformationEventType }
     *     
     */
    public TransformationEventType getTransformationEvent() {
        return transformationEvent;
    }

    /**
     * Sets the value of the transformationEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformationEventType }
     *     
     */
    public void setTransformationEvent(TransformationEventType value) {
        this.transformationEvent = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link EPCISEventListExtension2Type }
     *     
     */
    public EPCISEventListExtension2Type getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPCISEventListExtension2Type }
     *     
     */
    public void setExtension(EPCISEventListExtension2Type value) {
        this.extension = value;
    }

}
