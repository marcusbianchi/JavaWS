
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
    "companyID",
    "userID",
    "pass",
    "endPoints"
})
public class User {

    @JsonProperty("companyID")
    private String companyID;
    @JsonProperty("userID")
    private String userID;
    @JsonProperty("status")
    private String status;
    @JsonProperty("pass")
    private String pass;
    @JsonProperty("endPoints")
    private List<EndPoint> endPoints = new ArrayList<EndPoint>();
   
    /**
     * No args constructor for use in serialization
     * 
     */
    public User() {
    }

    /**
     * 
     * @param userID
     * @param companyID
     * @param endPoints
     * @param pass
     */
    public User(String companyID, String userID, String status, String pass, List<EndPoint> endPoints) {
        this.companyID = companyID;
        this.userID = userID;
        this.status = status;
        this.pass = pass;
        this.endPoints = endPoints;
    }

    
	/**
     * 
     * @return
     *     The companyID
     */
    @JsonProperty("companyID")
    public String getCompanyID() {
        return companyID;
    }

    /**
     * 
     * @param companyID
     *     The companyID
     */
    @JsonProperty("companyID")
    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    /**
     * 
     * @return
     *     The userID
     */
    @JsonProperty("userID")
    public String getUserID() {
        return userID;
    }

    /**
     * 
     * @param userID
     *     The userID
     */
    @JsonProperty("userID")
    public void setUserID(String userID) {
        this.userID = userID;
    }

   
    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
		return status;
	}

    @JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}
    
    /**
     * 
     * @return
     *     The pass
     */
    @JsonProperty("pass")
    public String getPass() {
        return pass;
    }

    /**
     * 
     * @param pass
     *     The pass
     */
    @JsonProperty("pass")
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * 
     * @return
     *     The endPoints
     */
    @JsonProperty("endPoints")
    public List<EndPoint> getEndPoints() {
        return endPoints;
    }

    /**
     * 
     * @param endPoints
     *     The endPoints
     */
    @JsonProperty("endPoints")
    public void setEndPoints(List<EndPoint> endPoints) {
        this.endPoints = endPoints;
    }
}
