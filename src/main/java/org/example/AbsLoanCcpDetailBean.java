package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AbsLoanCcpDetailBean {
    @JsonProperty("FILE_NO")
    protected long fileNo;
    @JsonProperty("TRANX_NO")
    protected long tranxNo;
    @JsonProperty("SEQ_NO")
    protected String seqNo;
    @JsonProperty("STATUS_MONTH")
    protected String statusMonth;
    @JsonProperty("PAYMENT_STATUS")
    protected String paymentStatus;
    @JsonProperty("OVERDUEAMOUNT")
    protected long overdueamount;

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

    public String getStatusMonth() {
        return statusMonth;
    }

    public void setStatusMonth(String statusMonth) {
        this.statusMonth = statusMonth;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public long getOverdueamount() {
        return overdueamount;
    }

    public void setOverdueamount(long overdueamount) {
        this.overdueamount = overdueamount;
    }
}
