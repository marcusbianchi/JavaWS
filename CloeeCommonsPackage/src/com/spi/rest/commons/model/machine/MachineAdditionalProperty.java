
package com.spi.rest.commons.model.machine;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class MachineAdditionalProperty {

    private String propertyName;
    private String propertyValue;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The propertyName
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * 
     * @param propertyName
     *     The propertyName
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * 
     * @return
     *     The propertyValue
     */
    public String getPropertyValue() {
        return propertyValue;
    }

    /**
     * 
     * @param propertyValue
     *     The propertyValue
     */
    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
