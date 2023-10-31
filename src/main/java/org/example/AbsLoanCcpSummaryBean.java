package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AbsLoanCcpSummaryBean {
    @JsonProperty("FILE_NO")
    protected long fileNo;
    @JsonProperty("TRANX_NO")
    protected long tranxNo;
    @JsonProperty("LOAN_NO")
    protected long loanNo;
    @JsonProperty("SEQ_NO")
    protected long seqNo;
    @JsonProperty("OK")
    protected String ok;
    @JsonProperty("X")
    protected String x;
    @JsonProperty("P30")
    protected String p30;
    @JsonProperty("P60")
    protected String p60;
    @JsonProperty("P90")
    protected String p90;
    @JsonProperty("P120")
    protected String p120;
    @JsonProperty("P150")
    protected String p150;
    @JsonProperty("P180")
    protected String p180;
    @JsonProperty("LOSS")
    protected String loss;

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

    public long getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(long loanNo) {
        this.loanNo = loanNo;
    }

    public long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(long seqNo) {
        this.seqNo = seqNo;
    }

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getP30() {
        return p30;
    }

    public void setP30(String p30) {
        this.p30 = p30;
    }

    public String getP60() {
        return p60;
    }

    public void setP60(String p60) {
        this.p60 = p60;
    }

    public String getP90() {
        return p90;
    }

    public void setP90(String p90) {
        this.p90 = p90;
    }

    public String getP120() {
        return p120;
    }

    public void setP120(String p120) {
        this.p120 = p120;
    }

    public String getP150() {
        return p150;
    }

    public void setP150(String p150) {
        this.p150 = p150;
    }

    public String getP180() {
        return p180;
    }

    public void setP180(String p180) {
        this.p180 = p180;
    }

    public String getLoss() {
        return loss;
    }

    public void setLoss(String loss) {
        this.loss = loss;
    }
}
