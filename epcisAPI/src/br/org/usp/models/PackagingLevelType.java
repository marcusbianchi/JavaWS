//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.02 at 10:08:09 AM BRT 
//


package br.org.usp.models;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackagingLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PackagingLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PALLET"/>
 *     &lt;enumeration value="CASE"/>
 *     &lt;enumeration value="BUNDLE"/>
 *     &lt;enumeration value="ITEM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PackagingLevelType", namespace = "http://epcis.gs1br.org/hc/ns")
@XmlEnum
public enum PackagingLevelType {

    PALLET,
    CASE,
    BUNDLE,
    ITEM;

    public String value() {
        return name();
    }

    public static PackagingLevelType fromValue(String v) {
        return valueOf(v);
    }

}
