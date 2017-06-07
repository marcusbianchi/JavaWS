//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.02 at 10:08:09 AM BRT 
//


package br.org.usp.models;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for EventListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="ObjectEvent" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:epcglobal:epcis:xsd:1}ObjectEventType">
 *                 &lt;sequence>
 *                   &lt;element name="epcList" type="{urn:epcglobal:epcis:xsd:1}EPCListType"/>
 *                   &lt;element name="action" type="{urn:epcglobal:epcis:xsd:1}ActionType"/>
 *                   &lt;element name="bizStep" type="{urn:epcglobal:epcis:xsd:1}BusinessStepIDType" minOccurs="0"/>
 *                   &lt;element name="disposition" type="{urn:epcglobal:epcis:xsd:1}DispositionIDType" minOccurs="0"/>
 *                   &lt;element name="readPoint" type="{urn:epcglobal:epcis:xsd:1}ReadPointType" minOccurs="0"/>
 *                   &lt;element name="bizLocation" type="{urn:epcglobal:epcis:xsd:1}BusinessLocationType" minOccurs="0"/>
 *                   &lt;element name="bizTransactionList" type="{urn:epcglobal:epcis:xsd:1}BusinessTransactionListType" minOccurs="0"/>
 *                   &lt;element name="extension" type="{urn:epcglobal:epcis:xsd:1}ObjectEventExtensionType" minOccurs="0"/>
 *                   &lt;element ref="{http://epcis.gs1br.org/hc/ns}lotNumber" minOccurs="0"/>
 *                   &lt;element ref="{http://epcis.gs1br.org/hc/ns}eventID" minOccurs="0"/>
 *                   &lt;element ref="{http://epcis.gs1br.org/hc/ns}declaringParty" minOccurs="0"/>
 *                   &lt;element ref="{http://epcis.gs1br.org/hc/ns}carrierParty" minOccurs="0"/>
 *                   &lt;element ref="{http://epcis.gs1br.org/hc/ns}natureOfMovement" minOccurs="0"/>
 *                   &lt;element ref="{http://epcis.gs1br.org/hc/ns}expectedNumUnits" minOccurs="0"/>
 *                   &lt;element ref="{http://epcis.gs1br.org/hc/ns}expectedNumUnitUOM" minOccurs="0"/>
 *                   &lt;element ref="{http://epcis.gs1br.org/hc/ns}postRecoveryBatch" minOccurs="0"/>
 *                   &lt;element ref="{http://epcis.gs1br.org/hc/ns}reason" minOccurs="0"/>
 *                   &lt;element ref="{http://epcis.gs1br.org/hc/ns}retractionFlag" minOccurs="0"/>
 *                   &lt;element ref="{http://epcis.gs1br.org/hc/ns}replacementEventID" minOccurs="0"/>
 *                   &lt;element ref="{http://epcis.gs1br.org/hc/ns}retractionReason" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;anyAttribute processContents='lax'/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AggregationEvent" type="{urn:epcglobal:epcis:xsd:1}AggregationEventType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="QuantityEvent" type="{urn:epcglobal:epcis:xsd:1}QuantityEventType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TransactionEvent" type="{urn:epcglobal:epcis:xsd:1}TransactionEventType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extension" type="{urn:epcglobal:epcis:xsd:1}EPCISEventListExtensionType"/>
 *         &lt;any processContents='lax' namespace='##other'/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventListType", propOrder = {
    "objectEventOrAggregationEventOrQuantityEvent"
})
public class EventListType {

    @XmlElementRefs({
        @XmlElementRef(name = "AggregationEvent", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TransactionEvent", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QuantityEvent", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ObjectEvent", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extension", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> objectEventOrAggregationEventOrQuantityEvent;

    /**
     * Gets the value of the objectEventOrAggregationEventOrQuantityEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectEventOrAggregationEventOrQuantityEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectEventOrAggregationEventOrQuantityEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link QuantityEventType }{@code >}
     * {@link Element }
     * {@link JAXBElement }{@code <}{@link EventListType.ObjectEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link EPCISEventListExtensionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AggregationEventType }{@code >}
     * {@link JAXBElement }{@code <}{@link TransactionEventType }{@code >}
     * 
     * 
     */
    public List<Object> getObjectEventOrAggregationEventOrQuantityEvent() {
        if (objectEventOrAggregationEventOrQuantityEvent == null) {
            objectEventOrAggregationEventOrQuantityEvent = new ArrayList<Object>();
        }
        return this.objectEventOrAggregationEventOrQuantityEvent;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:epcglobal:epcis:xsd:1}ObjectEventType">
     *       &lt;sequence>
     *         &lt;element name="epcList" type="{urn:epcglobal:epcis:xsd:1}EPCListType"/>
     *         &lt;element name="action" type="{urn:epcglobal:epcis:xsd:1}ActionType"/>
     *         &lt;element name="bizStep" type="{urn:epcglobal:epcis:xsd:1}BusinessStepIDType" minOccurs="0"/>
     *         &lt;element name="disposition" type="{urn:epcglobal:epcis:xsd:1}DispositionIDType" minOccurs="0"/>
     *         &lt;element name="readPoint" type="{urn:epcglobal:epcis:xsd:1}ReadPointType" minOccurs="0"/>
     *         &lt;element name="bizLocation" type="{urn:epcglobal:epcis:xsd:1}BusinessLocationType" minOccurs="0"/>
     *         &lt;element name="bizTransactionList" type="{urn:epcglobal:epcis:xsd:1}BusinessTransactionListType" minOccurs="0"/>
     *         &lt;element name="extension" type="{urn:epcglobal:epcis:xsd:1}ObjectEventExtensionType" minOccurs="0"/>
     *         &lt;element ref="{http://epcis.gs1br.org/hc/ns}lotNumber" minOccurs="0"/>
     *         &lt;element ref="{http://epcis.gs1br.org/hc/ns}eventID" minOccurs="0"/>
     *         &lt;element ref="{http://epcis.gs1br.org/hc/ns}declaringParty" minOccurs="0"/>
     *         &lt;element ref="{http://epcis.gs1br.org/hc/ns}carrierParty" minOccurs="0"/>
     *         &lt;element ref="{http://epcis.gs1br.org/hc/ns}natureOfMovement" minOccurs="0"/>
     *         &lt;element ref="{http://epcis.gs1br.org/hc/ns}expectedNumUnits" minOccurs="0"/>
     *         &lt;element ref="{http://epcis.gs1br.org/hc/ns}expectedNumUnitUOM" minOccurs="0"/>
     *         &lt;element ref="{http://epcis.gs1br.org/hc/ns}postRecoveryBatch" minOccurs="0"/>
     *         &lt;element ref="{http://epcis.gs1br.org/hc/ns}reason" minOccurs="0"/>
     *         &lt;element ref="{http://epcis.gs1br.org/hc/ns}retractionFlag" minOccurs="0"/>
     *         &lt;element ref="{http://epcis.gs1br.org/hc/ns}replacementEventID" minOccurs="0"/>
     *         &lt;element ref="{http://epcis.gs1br.org/hc/ns}retractionReason" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;anyAttribute processContents='lax'/>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "epcList",
        "action",
        "bizStep",
        "disposition",
        "readPoint",
        "bizLocation",
        "bizTransactionList",
        "extension",
        "lotNumber",
        "eventID",
        "declaringParty",
        "carrierParty",
        "natureOfMovement",
        "expectedNumUnits",
        "expectedNumUnitUOM",
        "postRecoveryBatch",
        "reason",
        "retractionFlag",
        "replacementEventID",
        "retractionReason"
    })
    public static class ObjectEvent
        extends ObjectEventType
    {

        @XmlElement(required = true)
        protected EPCListType epcList;
        @XmlElement(required = true)
        protected ActionType action;
        protected BusinessStepIDType bizStep;
        protected DispositionIDType disposition;
        protected ReadPointType readPoint;
        protected BusinessLocationType bizLocation;
        protected BusinessTransactionListType bizTransactionList;
        protected ObjectEventExtensionType extension;
        @XmlElement(namespace = "http://epcis.gs1br.org/hc/ns")
        protected String lotNumber;
        @XmlElement(namespace = "http://epcis.gs1br.org/hc/ns")
        protected String eventID;
        @XmlElement(namespace = "http://epcis.gs1br.org/hc/ns")
        protected String declaringParty;
        @XmlElement(namespace = "http://epcis.gs1br.org/hc/ns")
        protected String carrierParty;
        @XmlElement(namespace = "http://epcis.gs1br.org/hc/ns")
        protected MovementType natureOfMovement;
        @XmlElement(namespace = "http://epcis.gs1br.org/hc/ns")
        protected BigInteger expectedNumUnits;
        @XmlElement(namespace = "http://epcis.gs1br.org/hc/ns")
        protected PackagingLevelType expectedNumUnitUOM;
        @XmlElement(namespace = "http://epcis.gs1br.org/hc/ns")
        protected String postRecoveryBatch;
        @XmlElement(namespace = "http://epcis.gs1br.org/hc/ns")
        protected String reason;
        @XmlElement(namespace = "http://epcis.gs1br.org/hc/ns")
        protected Boolean retractionFlag;
        @XmlElement(namespace = "http://epcis.gs1br.org/hc/ns")
        protected String replacementEventID;
        @XmlElement(namespace = "http://epcis.gs1br.org/hc/ns")
        protected String retractionReason;

        /**
         * Gets the value of the epcList property.
         * 
         * @return
         *     possible object is
         *     {@link EPCListType }
         *     
         */
        public EPCListType getEpcList() {
            return epcList;
        }

        /**
         * Sets the value of the epcList property.
         * 
         * @param value
         *     allowed object is
         *     {@link EPCListType }
         *     
         */
        public void setEpcList(EPCListType value) {
            this.epcList = value;
        }

        /**
         * Gets the value of the action property.
         * 
         * @return
         *     possible object is
         *     {@link ActionType }
         *     
         */
        public ActionType getAction() {
            return action;
        }

        /**
         * Sets the value of the action property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActionType }
         *     
         */
        public void setAction(ActionType value) {
            this.action = value;
        }

        /**
         * Gets the value of the bizStep property.
         * 
         * @return
         *     possible object is
         *     {@link BusinessStepIDType }
         *     
         */
        public BusinessStepIDType getBizStep() {
            return bizStep;
        }

        /**
         * Sets the value of the bizStep property.
         * 
         * @param value
         *     allowed object is
         *     {@link BusinessStepIDType }
         *     
         */
        public void setBizStep(BusinessStepIDType value) {
            this.bizStep = value;
        }

        /**
         * Gets the value of the disposition property.
         * 
         * @return
         *     possible object is
         *     {@link DispositionIDType }
         *     
         */
        public DispositionIDType getDisposition() {
            return disposition;
        }

        /**
         * Sets the value of the disposition property.
         * 
         * @param value
         *     allowed object is
         *     {@link DispositionIDType }
         *     
         */
        public void setDisposition(DispositionIDType value) {
            this.disposition = value;
        }

        /**
         * Gets the value of the readPoint property.
         * 
         * @return
         *     possible object is
         *     {@link ReadPointType }
         *     
         */
        public ReadPointType getReadPoint() {
            return readPoint;
        }

        /**
         * Sets the value of the readPoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReadPointType }
         *     
         */
        public void setReadPoint(ReadPointType value) {
            this.readPoint = value;
        }

        /**
         * Gets the value of the bizLocation property.
         * 
         * @return
         *     possible object is
         *     {@link BusinessLocationType }
         *     
         */
        public BusinessLocationType getBizLocation() {
            return bizLocation;
        }

        /**
         * Sets the value of the bizLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link BusinessLocationType }
         *     
         */
        public void setBizLocation(BusinessLocationType value) {
            this.bizLocation = value;
        }

        /**
         * Gets the value of the bizTransactionList property.
         * 
         * @return
         *     possible object is
         *     {@link BusinessTransactionListType }
         *     
         */
        public BusinessTransactionListType getBizTransactionList() {
            return bizTransactionList;
        }

        /**
         * Sets the value of the bizTransactionList property.
         * 
         * @param value
         *     allowed object is
         *     {@link BusinessTransactionListType }
         *     
         */
        public void setBizTransactionList(BusinessTransactionListType value) {
            this.bizTransactionList = value;
        }

        /**
         * Gets the value of the extension property.
         * 
         * @return
         *     possible object is
         *     {@link ObjectEventExtensionType }
         *     
         */
        public ObjectEventExtensionType getExtension() {
            return extension;
        }

        /**
         * Sets the value of the extension property.
         * 
         * @param value
         *     allowed object is
         *     {@link ObjectEventExtensionType }
         *     
         */
        public void setExtension(ObjectEventExtensionType value) {
            this.extension = value;
        }

        /**
         * Gets the value of the lotNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLotNumber() {
            return lotNumber;
        }

        /**
         * Sets the value of the lotNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLotNumber(String value) {
            this.lotNumber = value;
        }

        /**
         * Gets the value of the eventID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEventID() {
            return eventID;
        }

        /**
         * Sets the value of the eventID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEventID(String value) {
            this.eventID = value;
        }

        /**
         * Gets the value of the declaringParty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeclaringParty() {
            return declaringParty;
        }

        /**
         * Sets the value of the declaringParty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeclaringParty(String value) {
            this.declaringParty = value;
        }

        /**
         * Gets the value of the carrierParty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCarrierParty() {
            return carrierParty;
        }

        /**
         * Sets the value of the carrierParty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCarrierParty(String value) {
            this.carrierParty = value;
        }

        /**
         * Gets the value of the natureOfMovement property.
         * 
         * @return
         *     possible object is
         *     {@link MovementType }
         *     
         */
        public MovementType getNatureOfMovement() {
            return natureOfMovement;
        }

        /**
         * Sets the value of the natureOfMovement property.
         * 
         * @param value
         *     allowed object is
         *     {@link MovementType }
         *     
         */
        public void setNatureOfMovement(MovementType value) {
            this.natureOfMovement = value;
        }

        /**
         * Gets the value of the expectedNumUnits property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getExpectedNumUnits() {
            return expectedNumUnits;
        }

        /**
         * Sets the value of the expectedNumUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setExpectedNumUnits(BigInteger value) {
            this.expectedNumUnits = value;
        }

        /**
         * Gets the value of the expectedNumUnitUOM property.
         * 
         * @return
         *     possible object is
         *     {@link PackagingLevelType }
         *     
         */
        public PackagingLevelType getExpectedNumUnitUOM() {
            return expectedNumUnitUOM;
        }

        /**
         * Sets the value of the expectedNumUnitUOM property.
         * 
         * @param value
         *     allowed object is
         *     {@link PackagingLevelType }
         *     
         */
        public void setExpectedNumUnitUOM(PackagingLevelType value) {
            this.expectedNumUnitUOM = value;
        }

        /**
         * Gets the value of the postRecoveryBatch property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostRecoveryBatch() {
            return postRecoveryBatch;
        }

        /**
         * Sets the value of the postRecoveryBatch property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostRecoveryBatch(String value) {
            this.postRecoveryBatch = value;
        }

        /**
         * Gets the value of the reason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReason() {
            return reason;
        }

        /**
         * Sets the value of the reason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReason(String value) {
            this.reason = value;
        }

        /**
         * Gets the value of the retractionFlag property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRetractionFlag() {
            return retractionFlag;
        }

        /**
         * Sets the value of the retractionFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRetractionFlag(Boolean value) {
            this.retractionFlag = value;
        }

        /**
         * Gets the value of the replacementEventID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReplacementEventID() {
            return replacementEventID;
        }

        /**
         * Sets the value of the replacementEventID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReplacementEventID(String value) {
            this.replacementEventID = value;
        }

        /**
         * Gets the value of the retractionReason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRetractionReason() {
            return retractionReason;
        }

        /**
         * Sets the value of the retractionReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRetractionReason(String value) {
            this.retractionReason = value;
        }

    }

}
