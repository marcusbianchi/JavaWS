
package com.spi.rest.accesscontrol.model.user;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "permission"
})
public class Permission {

    @JsonProperty("permission")
    private String permission;
    @JsonIgnore

    /**
     * No args constructor for use in serialization
     * 
     */
    public Permission() {
    }

    /**
     * 
     * @param permission
     */
    public Permission(String permission) {
        this.permission = permission;
    }

    /**
     * 
     * @return
     *     The permission
     */
    @JsonProperty("permission")
    public String getPermission() {
        return permission;
    }

    /**
     * 
     * @param permission
     *     The permission
     */
    @JsonProperty("permission")
    public void setPermission(String permission) {
        this.permission = permission;
    }  

}
