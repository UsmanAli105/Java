package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AbsLoanEmployerInformationBean {

    @JsonProperty("FILE_NO")
    protected long fileNo;
    @JsonProperty("TRANX_NO")
    protected long tranxNo;
    @JsonProperty("SEQ_NO")
    protected String seqNo;
    @JsonProperty("REPORTED_ON")
    protected String reportedOn;
    @JsonProperty("EMPLOYER")
    protected DataSection employer;
    @JsonProperty("DESIGNATION")
    protected DataSection designation;
    @JsonProperty("SELF_EMPLOYED")
    protected DataSection selfEmployed;
    @JsonProperty("CITY")
    protected String city;
    @JsonProperty("PHONE1")
    protected String phone1;
    @JsonProperty("PHONE2")
    protected String phone2;
}