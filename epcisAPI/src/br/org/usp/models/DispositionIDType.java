//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.02 at 10:08:09 AM BRT 
//


package br.org.usp.models;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DispositionIDType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DispositionIDType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="urn:epcglobal:cbv:disp:active"/>
 *     &lt;enumeration value="urn:epcglobal:cbv:disp:in_progress"/>
 *     &lt;enumeration value="urn:epcglobal:cbv:disp:in_transit"/>
 *     &lt;enumeration value="urn:epcglobal:cbv:disp:destroyed"/>
 *     &lt;enumeration value="urn:epcglobal:cbv:disp:damaged"/>
 *     &lt;enumeration value="urn:epcglobal:cbv:disp:expired"/>
 *     &lt;enumeration value="urn:epcglobal:cbv:disp:stolen"/>
 *     &lt;enumeration value="http://epcis.gs1br.org/hc/disp/misplaced"/>
 *     &lt;enumeration value="http://epcis.gs1br.org/hc/disp/dispensed"/>
 *     &lt;enumeration value="http://epcis.gs1br.org/hc/disp/partial"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DispositionIDType")
@XmlEnum
public enum DispositionIDType {

    @XmlEnumValue("urn:epcglobal:cbv:disp:active")
    URN_EPCGLOBAL_CBV_DISP_ACTIVE("urn:epcglobal:cbv:disp:active"),
    @XmlEnumValue("urn:epcglobal:cbv:disp:in_progress")
    URN_EPCGLOBAL_CBV_DISP_IN_PROGRESS("urn:epcglobal:cbv:disp:in_progress"),
    @XmlEnumValue("urn:epcglobal:cbv:disp:in_transit")
    URN_EPCGLOBAL_CBV_DISP_IN_TRANSIT("urn:epcglobal:cbv:disp:in_transit"),
    @XmlEnumValue("urn:epcglobal:cbv:disp:destroyed")
    URN_EPCGLOBAL_CBV_DISP_DESTROYED("urn:epcglobal:cbv:disp:destroyed"),
    @XmlEnumValue("urn:epcglobal:cbv:disp:damaged")
    URN_EPCGLOBAL_CBV_DISP_DAMAGED("urn:epcglobal:cbv:disp:damaged"),
    @XmlEnumValue("urn:epcglobal:cbv:disp:expired")
    URN_EPCGLOBAL_CBV_DISP_EXPIRED("urn:epcglobal:cbv:disp:expired"),
    @XmlEnumValue("urn:epcglobal:cbv:disp:stolen")
    URN_EPCGLOBAL_CBV_DISP_STOLEN("urn:epcglobal:cbv:disp:stolen"),
    @XmlEnumValue("http://epcis.gs1br.org/hc/disp/misplaced")
    HTTP_EPCIS_GS_1_BR_ORG_HC_DISP_MISPLACED("http://epcis.gs1br.org/hc/disp/misplaced"),
    @XmlEnumValue("http://epcis.gs1br.org/hc/disp/dispensed")
    HTTP_EPCIS_GS_1_BR_ORG_HC_DISP_DISPENSED("http://epcis.gs1br.org/hc/disp/dispensed"),
    @XmlEnumValue("http://epcis.gs1br.org/hc/disp/partial")
    HTTP_EPCIS_GS_1_BR_ORG_HC_DISP_PARTIAL("http://epcis.gs1br.org/hc/disp/partial");
    private final String value;

    DispositionIDType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DispositionIDType fromValue(String v) {
        for (DispositionIDType c: DispositionIDType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}