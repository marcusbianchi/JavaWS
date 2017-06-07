
package com.spi.rest.commons.model.machine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Trigger {

    private String eventType;
    private List<Condition> conditions = new ArrayList<Condition>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The eventType
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * 
     * @param eventType
     *     The eventType
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * 
     * @return
     *     The conditions
     */
    public List<Condition> getConditions() {
        return conditions;
    }

    /**
     * 
     * @param conditions
     *     The conditions
     */
    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
