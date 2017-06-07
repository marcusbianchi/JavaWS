
package com.spi.rest.commons.model.machine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Machine {

    private String machineID;
    private String machineName;
    private String companyID;
    private String status;
    private String description;
    private String model;
    private String brand;
    private List<Trigger> triggers = new ArrayList<Trigger>();
    private List<MachineAdditionalProperty> machineAdditionalProperties = new ArrayList<MachineAdditionalProperty>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The machineID
     */
    public String getMachineID() {
        return machineID;
    }

    /**
     * 
     * @param machineID
     *     The machineID
     */
    public void setMachineID(String machineID) {
        this.machineID = machineID;
    }

    /**
     * 
     * @return
     *     The machineName
     */
    public String getMachineName() {
        return machineName;
    }

    /**
     * 
     * @param machineName
     *     The machineName
     */
    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    /**
     * 
     * @return
     *     The companyID
     */
    public String getCompanyID() {
        return companyID;
    }

    /**
     * 
     * @param companyID
     *     The companyID
     */
    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The model
     */
    public String getModel() {
        return model;
    }

    /**
     * 
     * @param model
     *     The model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 
     * @return
     *     The brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 
     * @param brand
     *     The brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 
     * @return
     *     The triggers
     */
    public List<Trigger> getTriggers() {
        return triggers;
    }

    /**
     * 
     * @param triggers
     *     The triggers
     */
    public void setTriggers(List<Trigger> triggers) {
        this.triggers = triggers;
    }

    /**
     * 
     * @return
     *     The machineAdditionalProperties
     */
    public List<MachineAdditionalProperty> getMachineAdditionalProperties() {
        return machineAdditionalProperties;
    }

    /**
     * 
     * @param machineAdditionalProperties
     *     The machineAdditionalProperties
     */
    public void setMachineAdditionalProperties(List<MachineAdditionalProperty> machineAdditionalProperties) {
        this.machineAdditionalProperties = machineAdditionalProperties;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
