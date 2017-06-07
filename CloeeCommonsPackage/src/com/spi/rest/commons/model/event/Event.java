package com.spi.rest.commons.model.event;

public class Event
{
    private String timestamp;

    private String eventID;

    private String companyID;

    private String type;

    private String machineID;

    public String getTimestamp ()
    {
        return timestamp;
    }

    public void setTimestamp (String timestamp)
    {
        this.timestamp = timestamp;
    }

    public String getEventID ()
    {
        return eventID;
    }

    public void setEventID (String eventID)
    {
        this.eventID = eventID;
    }

    public String getCompanyID ()
    {
        return companyID;
    }

    public void setCompanyID (String companyID)
    {
        this.companyID = companyID;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getMachineID ()
    {
        return machineID;
    }

    public void setMachineID (String machineID)
    {
        this.machineID = machineID;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [timestamp = "+timestamp+", eventID = "+eventID+", companyID = "+companyID+", type = "+type+", machineID = "+machineID+"]";
    }
}