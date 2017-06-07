
package com.spi.rest.accesscontrol.model.user;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "url",
    "environment",
    "permissions"
})
public class EndPoint {

    @JsonProperty("url")
    private String url;
    @JsonProperty("environment")
    private String environment;
    @JsonProperty("permissions")
    private List<Permission> permissions = new ArrayList<Permission>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public EndPoint() {
    }

    /**
     * 
     * @param environment
     * @param permissions
     * @param url
     */
    public EndPoint(String url, String environment, List<Permission> permissions) {
        this.url = url;
        this.environment = environment;
        this.permissions = permissions;
    }

    /**
     * 
     * @return
     *     The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The environment
     */
    @JsonProperty("environment")
    public String getEnvironment() {
        return environment;
    }

    /**
     * 
     * @param environment
     *     The environment
     */
    @JsonProperty("environment")
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * 
     * @return
     *     The permissions
     */
    @JsonProperty("permissions")
    public List<Permission> getPermissions() {
        return permissions;
    }

    /**
     * 
     * @param permissions
     *     The permissions
     */
    @JsonProperty("permissions")
    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
