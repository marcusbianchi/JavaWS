
package com.spi.rest.commons.model.machine;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Condition {

    private String tag;
    private String operator;
    private String value;
    private String multiplier;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * 
     * @param tag
     *     The tag
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * 
     * @return
     *     The operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 
     * @param operator
     *     The operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * 
     * @return
     *     The value
     */
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 
     * @return
     *     The multiplier
     */
    public String getMultiplier() {
        return multiplier;
    }

    /**
     * 
     * @param multiplier
     *     The multiplier
     */
    public void setMultiplier(String multiplier) {
        this.multiplier = multiplier;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
