package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AbsLoanCcpMasterBean {

    @JsonProperty("FILE_NO")
    protected long fileNo;
    @JsonProperty("TRANX_NO")
    protected long tranxNo;
    @JsonProperty("LOAN_NO")
    protected long loanNo;
    @JsonProperty("NOTE")
    protected String note;
    @JsonProperty("SEQ_NO")
    protected long seqNo;
    @JsonProperty("MEM_NAME")
    protected String memName;
    @JsonProperty("SUBBRN_NAME")
    protected String subbrnName;
    @JsonProperty("ACCT_NO")
    protected String acctNo;
    @JsonProperty("ACCT_TY")
    protected String acctTy;
    @JsonProperty("MAPPED_ACCT_TY")
    protected String mappedAcctTy;
    @JsonProperty("TERM")
    protected String term;
    @JsonProperty("ACCT_STATUS")
    protected String acctStatus;
    @JsonProperty("LIMIT")
    protected long limit;
    @JsonProperty("OPEN_DATE")
    protected String openDate;
    @JsonProperty("MATURITY_DATE")
    protected String maturityDate;
    @JsonProperty("ASSOC_TY")
    protected String assocTy;
    @JsonProperty("GROUP_ID")
    protected long groupId;
    @JsonProperty("STATUS_DATE")
    protected long statusDate;
    @JsonProperty("MIN_AMT_DUE")
    protected long minAmtDue;
    @JsonProperty("BNC_CHQ")
    protected long bncChq;
    @JsonProperty("LAST_PAYMENT")
    protected long lastPayment;
    @JsonProperty("HIGH_CREDIT")
    protected long highCredit;
    @JsonProperty("OVERDUEAMOUNT")
    protected long overDueAmount;
    @JsonProperty("BALANCE")
    protected long balance;
    @JsonProperty("PAYMENT_STATUS")
    protected String paymentStatus;
    @JsonProperty("CURRENCY")
    protected String currency;
    @JsonProperty("RELATION_DT")
    protected String relationDt;
    @JsonProperty("SECURE")
    protected String secure;
    @JsonProperty("REPAYMENT_FREQ")
    protected String paymentFreq;
    @JsonProperty("CLASS_CATG")
    protected String classCatg;
    @JsonProperty("SUB_OBJ")
    protected String subObj;
    @JsonProperty("LOAN_CLASS_DESC")
    protected String loanClassDesc;
    @JsonProperty("RESCHEDULE_FLAG")
    protected String rescheduleFlag;
    @JsonProperty("RESCHEDULE_DT")
    protected String rescheduleDt;
    @JsonProperty("DISPUTE")
    protected String dispute;

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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(long seqNo) {
        this.seqNo = seqNo;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public String getSubbrnName() {
        return subbrnName;
    }

    public void setSubbrnName(String subbrnName) {
        this.subbrnName = subbrnName;
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    public String getAcctTy() {
        return acctTy;
    }

    public void setAcctTy(String acctTy) {
        this.acctTy = acctTy;
    }

    public String getMappedAcctTy() {
        return mappedAcctTy;
    }

    public void setMappedAcctTy(String mappedAcctTy) {
        this.mappedAcctTy = mappedAcctTy;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getAcctStatus() {
        return acctStatus;
    }

    public void setAcctStatus(String acctStatus) {
        this.acctStatus = acctStatus;
    }

    public long getLimit() {
        return limit;
    }

    public void setLimit(long limit) {
        this.limit = limit;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
    }

    public String getAssocTy() {
        return assocTy;
    }

    public void setAssocTy(String assocTy) {
        this.assocTy = assocTy;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public long getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(long statusDate) {
        this.statusDate = statusDate;
    }

    public long getMinAmtDue() {
        return minAmtDue;
    }

    public void setMinAmtDue(long minAmtDue) {
        this.minAmtDue = minAmtDue;
    }

    public long getBncChq() {
        return bncChq;
    }

    public void setBncChq(long bncChq) {
        this.bncChq = bncChq;
    }

    public long getLastPayment() {
        return lastPayment;
    }

    public void setLastPayment(long lastPayment) {
        this.lastPayment = lastPayment;
    }

    public long getHighCredit() {
        return highCredit;
    }

    public void setHighCredit(long highCredit) {
        this.highCredit = highCredit;
    }

    public long getOverDueAmount() {
        return overDueAmount;
    }

    public void setOverDueAmount(long overDueAmount) {
        this.overDueAmount = overDueAmount;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getRelationDt() {
        return relationDt;
    }

    public void setRelationDt(String relationDt) {
        this.relationDt = relationDt;
    }

    public String getSecure() {
        return secure;
    }

    public void setSecure(String secure) {
        this.secure = secure;
    }

    public String getPaymentFreq() {
        return paymentFreq;
    }

    public void setPaymentFreq(String paymentFreq) {
        this.paymentFreq = paymentFreq;
    }

    public String getClassCatg() {
        return classCatg;
    }

    public void setClassCatg(String classCatg) {
        this.classCatg = classCatg;
    }

    public String getSubObj() {
        return subObj;
    }

    public void setSubObj(String subObj) {
        this.subObj = subObj;
    }

    public String getLoanClassDesc() {
        return loanClassDesc;
    }

    public void setLoanClassDesc(String loanClassDesc) {
        this.loanClassDesc = loanClassDesc;
    }

    public String getRescheduleFlag() {
        return rescheduleFlag;
    }

    public void setRescheduleFlag(String rescheduleFlag) {
        this.rescheduleFlag = rescheduleFlag;
    }

    public String getRescheduleDt() {
        return rescheduleDt;
    }

    public void setRescheduleDt(String rescheduleDt) {
        this.rescheduleDt = rescheduleDt;
    }

    public String getDispute() {
        return dispute;
    }

    public void setDispute(String dispute) {
        this.dispute = dispute;
    }
}
