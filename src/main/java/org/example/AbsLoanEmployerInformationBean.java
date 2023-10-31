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

    public long getFileNo() {
        return fileNo;
    }

    public void setFileNo(long fileNo) {
        this.fileNo = fileNo;
    }

    public long getTranxNo() {
        return tranxNo;
    }

    public void setTranxNo(long tranxNo) {
        this.tranxNo = tranxNo;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getReportedOn() {
        return reportedOn;
    }

    public void setReportedOn(String reportedOn) {
        this.reportedOn = reportedOn;
    }

    public DataSection getEmployer() {
        return employer;
    }

    public void setEmployer(DataSection employer) {
        this.employer = employer;
    }

    public DataSection getDesignation() {
        return designation;
    }

    public void setDesignation(DataSection designation) {
        this.designation = designation;
    }

    public DataSection getSelfEmployed() {
        return selfEmployed;
    }

    public void setSelfEmployed(DataSection selfEmployed) {
        this.selfEmployed = selfEmployed;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }
}