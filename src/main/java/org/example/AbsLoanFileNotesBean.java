package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AbsLoanFileNotesBean {
    @JsonProperty("FILE_NO")
    protected long fileNo;
    @JsonProperty("TRANX_NO")
    protected long tranxNo;
    @JsonProperty("REF_DATE")
    protected String refDate;
    @JsonProperty("ACCT_NO")
    protected String acctNo;
    @JsonProperty("COMMENTS")
    protected String comments;

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

    public String getRefDate() {
        return refDate;
    }

    public void setRefDate(String refDate) {
        this.refDate = refDate;
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
