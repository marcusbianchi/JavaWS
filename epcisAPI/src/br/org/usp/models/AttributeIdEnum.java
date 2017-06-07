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
 * <p>Java class for AttributeIdEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttributeIdEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="http://epcis.gs1br.org/hc/mda/identifierType"/>
 *     &lt;enumeration value="http://epcis.gs1br.org/hc/mda/companyName"/>
 *     &lt;enumeration value="http://epcis.gs1br.org/hc/mda/street1"/>
 *     &lt;enumeration value="http://epcis.gs1br.org/hc/mda/street2"/>
 *     &lt;enumeration value="http://epcis.gs1br.org/hc/mda/city"/>
 *     &lt;enumeration value="http://epcis.gs1br.org/hc/mda/stateOrRegion"/>
 *     &lt;enumeration value="http://epcis.gs1br.org/hc/mda/postalCode"/>
 *     &lt;enumeration value="http://epcis.gs1br.org/hc/mda/country"/>
 *     &lt;enumeration value="http://epcis.gs1br.org/hc/mda/latitude"/>
 *     &lt;enumeration value="http://epcis.gs1br.org/hc/mda/longitude"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/IdentificadorEmpresa"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/TipoIdentificador"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/Nome"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/PrefixoGTIN"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/tipo"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/Estado"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/Cep"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/Endereco"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/Numero"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/Bairro"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/Complemento"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/Status"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/Unidade"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/identifierContato"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/TipoIdContato"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/Contato"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/E-Mail"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/Cep"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/Fone"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/TipoContato"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/IdentificadorEmpresa"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/TipoIdentificador"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/Registro"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/Nome"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/Apresentacao"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/Doses"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/VidaUtil_De"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/VidaUtil_Ate"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/Codigo"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/Grupo"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/GTIN"/>
 *     &lt;enumeration value="http://epcis.usp.org.br/hc/mda/Status"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttributeIdEnum", namespace = "urn:epcglobal:epcis-masterdata:xsd:1")
@XmlEnum
public enum AttributeIdEnum {

    @XmlEnumValue("http://epcis.gs1br.org/hc/mda/identifierType")
    HTTP_EPCIS_GS_1_BR_ORG_HC_MDA_IDENTIFIER_TYPE("http://epcis.gs1br.org/hc/mda/identifierType"),
    @XmlEnumValue("http://epcis.gs1br.org/hc/mda/companyName")
    HTTP_EPCIS_GS_1_BR_ORG_HC_MDA_COMPANY_NAME("http://epcis.gs1br.org/hc/mda/companyName"),
    @XmlEnumValue("http://epcis.gs1br.org/hc/mda/street1")
    HTTP_EPCIS_GS_1_BR_ORG_HC_MDA_STREET_1("http://epcis.gs1br.org/hc/mda/street1"),
    @XmlEnumValue("http://epcis.gs1br.org/hc/mda/street2")
    HTTP_EPCIS_GS_1_BR_ORG_HC_MDA_STREET_2("http://epcis.gs1br.org/hc/mda/street2"),
    @XmlEnumValue("http://epcis.gs1br.org/hc/mda/city")
    HTTP_EPCIS_GS_1_BR_ORG_HC_MDA_CITY("http://epcis.gs1br.org/hc/mda/city"),
    @XmlEnumValue("http://epcis.gs1br.org/hc/mda/stateOrRegion")
    HTTP_EPCIS_GS_1_BR_ORG_HC_MDA_STATE_OR_REGION("http://epcis.gs1br.org/hc/mda/stateOrRegion"),
    @XmlEnumValue("http://epcis.gs1br.org/hc/mda/postalCode")
    HTTP_EPCIS_GS_1_BR_ORG_HC_MDA_POSTAL_CODE("http://epcis.gs1br.org/hc/mda/postalCode"),
    @XmlEnumValue("http://epcis.gs1br.org/hc/mda/country")
    HTTP_EPCIS_GS_1_BR_ORG_HC_MDA_COUNTRY("http://epcis.gs1br.org/hc/mda/country"),
    @XmlEnumValue("http://epcis.gs1br.org/hc/mda/latitude")
    HTTP_EPCIS_GS_1_BR_ORG_HC_MDA_LATITUDE("http://epcis.gs1br.org/hc/mda/latitude"),
    @XmlEnumValue("http://epcis.gs1br.org/hc/mda/longitude")
    HTTP_EPCIS_GS_1_BR_ORG_HC_MDA_LONGITUDE("http://epcis.gs1br.org/hc/mda/longitude"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/IdentificadorEmpresa")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_IDENTIFICADOR_EMPRESA("http://epcis.usp.org.br/hc/mda/IdentificadorEmpresa"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/TipoIdentificador")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_TIPO_IDENTIFICADOR("http://epcis.usp.org.br/hc/mda/TipoIdentificador"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/Nome")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_NOME("http://epcis.usp.org.br/hc/mda/Nome"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/PrefixoGTIN")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_PREFIXO_GTIN("http://epcis.usp.org.br/hc/mda/PrefixoGTIN"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/tipo")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_TIPO("http://epcis.usp.org.br/hc/mda/tipo"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/Estado")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_ESTADO("http://epcis.usp.org.br/hc/mda/Estado"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/Cep")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_CEP("http://epcis.usp.org.br/hc/mda/Cep"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/Endereco")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_ENDERECO("http://epcis.usp.org.br/hc/mda/Endereco"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/Numero")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_NUMERO("http://epcis.usp.org.br/hc/mda/Numero"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/Bairro")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_BAIRRO("http://epcis.usp.org.br/hc/mda/Bairro"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/Complemento")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_COMPLEMENTO("http://epcis.usp.org.br/hc/mda/Complemento"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/Status")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_STATUS("http://epcis.usp.org.br/hc/mda/Status"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/Unidade")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_UNIDADE("http://epcis.usp.org.br/hc/mda/Unidade"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/identifierContato")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_IDENTIFIER_CONTATO("http://epcis.usp.org.br/hc/mda/identifierContato"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/TipoIdContato")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_TIPO_ID_CONTATO("http://epcis.usp.org.br/hc/mda/TipoIdContato"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/Contato")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_CONTATO("http://epcis.usp.org.br/hc/mda/Contato"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/E-Mail")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_E_MAIL("http://epcis.usp.org.br/hc/mda/E-Mail"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/Fone")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_FONE("http://epcis.usp.org.br/hc/mda/Fone"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/TipoContato")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_TIPO_CONTATO("http://epcis.usp.org.br/hc/mda/TipoContato"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/Registro")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_REGISTRO("http://epcis.usp.org.br/hc/mda/Registro"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/Apresentacao")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_APRESENTACAO("http://epcis.usp.org.br/hc/mda/Apresentacao"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/Doses")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_DOSES("http://epcis.usp.org.br/hc/mda/Doses"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/VidaUtil_De")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_VIDA_UTIL_DE("http://epcis.usp.org.br/hc/mda/VidaUtil_De"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/VidaUtil_Ate")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_VIDA_UTIL_ATE("http://epcis.usp.org.br/hc/mda/VidaUtil_Ate"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/Codigo")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_CODIGO("http://epcis.usp.org.br/hc/mda/Codigo"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/Grupo")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_GRUPO("http://epcis.usp.org.br/hc/mda/Grupo"),
    @XmlEnumValue("http://epcis.usp.org.br/hc/mda/GTIN")
    HTTP_EPCIS_USP_ORG_BR_HC_MDA_GTIN("http://epcis.usp.org.br/hc/mda/GTIN");
    private final String value;

    AttributeIdEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttributeIdEnum fromValue(String v) {
        for (AttributeIdEnum c: AttributeIdEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
