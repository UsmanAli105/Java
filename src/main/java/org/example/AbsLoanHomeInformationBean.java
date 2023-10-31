package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AbsLoanHomeInformationBean {

    @JsonProperty("FILE_NO")
    protected long fileNo;
    @JsonProperty("TRANX_NO")
    protected long tranxNo;
    @JsonProperty("SEQ_NO   ")
    protected String seqNo;
    @JsonProperty("REPORTED_ON")
    protected String reportedOn;
    @JsonProperty("ADDRESS")
    protected Address address;
    @JsonProperty("CITY")
    protected String city;
    @JsonProperty("PERMANENT_ADDRESS")
    protected String permanentAddress;
    @JsonProperty("PERMANENT_CITY")
    protected String permanentCity;
    @JsonProperty("PHONE1")
    protected String phone1;
    @JsonProperty("PHONE2")
    protected String phone2;
}