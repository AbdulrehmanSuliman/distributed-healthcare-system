package com.demo.Mongo.models;

import java.util.Date;

public class LabRecords {
    private Date DateRequested;
    private Date DateReleased;
    private String Results;
    public LabRecords(Date DateRequested, Date DateReleased, String Results ){
        this.DateRequested = DateRequested;
        this.DateReleased = DateReleased;
        this.Results = Results;

    }

    public Date getDateRequested(){return DateRequested; }
    public void setDateRequested(Date DateRequested){this.DateRequested = DateRequested;}
    public Date getDateReleased(){return DateReleased; }
    public void setDateReleased(Date DateReleased){this.DateReleased = DateReleased;}
    public String getResults(){return Results;}
    public void setResults(String Results){this.Results = Results;}

}
