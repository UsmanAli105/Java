package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AbsLoanDefaultsBean {

    @JsonProperty("DEFAULTS")
    protected long FILE_NO;
    @JsonProperty("TRANX_NO")
    protected long tranxNo;
    @JsonProperty("LOAN_NO")
    protected long loanNo;
    @JsonProperty("NOTE")
    protected String note;
    @JsonProperty("NOTE")
    protected String memName;
    @JsonProperty("SUBBRN_NAME")
    protected String subbrnName;
    @JsonProperty("REL_DT")
    protected String relDt;
    @JsonProperty("ORG_STATUS_DATE")
    protected String orgStatusDate;
    @JsonProperty("ORG_ACCT_NO")
    protected String orgAcctNo;
    @JsonProperty("ORG_AMOUNT")
    protected long orgAmount;
    @JsonProperty("ORG_ACCT_TY")
    protected String orgAcctTy;
    @JsonProperty("ORG_MAPPED_ACCT_TY")
    protected String orgMappedAcctTy;
    @JsonProperty("ORG_STATUS")
    protected String orgStatus;
    @JsonProperty("ORG_RTR")
    protected String orgRtr;
    @JsonProperty("ORG_CURRENCY")
    protected String orgCurrency;
    @JsonProperty("UPD_STATUS_DATE")
    protected String updStatusDate;
    @JsonProperty("UPD_ACCT_NO")
    protected long updAcctNo;
    @JsonProperty("UPD_AMOUNT")
    protected String updAcctNoStr;
    @JsonProperty("UPD_ACCT_TY")
    protected long updAmount;
    @JsonProperty("UPD_MAPPED_ACCT_TY")
    protected String updAcctTy;
    @JsonProperty("UPD_MAPPED_ACCT_TY")
    protected String updMappedAcctTy;
    @JsonProperty("UPD_STATUS")
    protected String updStatus;
    @JsonProperty("UPD_RTR")
    protected String updRtr;
    @JsonProperty("UPD_CURRENCY")
    protected String updCurrency;
    @JsonProperty("SECURE")
    protected String secure;
    @JsonProperty("CLASS_CATG")
    protected String classCatg;
    @JsonProperty("SUB_OBJ")
    protected String subObj;
    @JsonProperty("LOAN_CLASS_DESC")
    protected String loanClassDesc;
    @JsonProperty("ASSOC_TY")
    protected String assosTy;
    @JsonProperty("GROUP_ID")
    protected long groupId;
    @JsonProperty("RECOVERY_AMOUNT")
    protected long recoveryAmount;
    @JsonProperty("RECOVERY_DATE")
    protected String recoveryDate;
    @JsonProperty("DISPUTE")
    protected String dispute;

    public long getFILE_NO() {
        return FILE_NO;
    }

    public void setFILE_NO(long FILE_NO) {
        this.FILE_NO = FILE_NO;
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

    public String getRelDt() {
        return relDt;
    }

    public void setRelDt(String relDt) {
        this.relDt = relDt;
    }

    public String getOrgStatusDate() {
        return orgStatusDate;
    }

    public void setOrgStatusDate(String orgStatusDate) {
        this.orgStatusDate = orgStatusDate;
    }

    public String getOrgAcctNo() {
        return orgAcctNo;
    }

    public void setOrgAcctNo(String orgAcctNo) {
        this.orgAcctNo = orgAcctNo;
    }

    public long getOrgAmount() {
        return orgAmount;
    }

    public void setOrgAmount(long orgAmount) {
        this.orgAmount = orgAmount;
    }

    public String getOrgAcctTy() {
        return orgAcctTy;
    }

    public void setOrgAcctTy(String orgAcctTy) {
        this.orgAcctTy = orgAcctTy;
    }

    public String getOrgMappedAcctTy() {
        return orgMappedAcctTy;
    }

    public void setOrgMappedAcctTy(String orgMappedAcctTy) {
        this.orgMappedAcctTy = orgMappedAcctTy;
    }

    public String getOrgStatus() {
        return orgStatus;
    }

    public void setOrgStatus(String orgStatus) {
        this.orgStatus = orgStatus;
    }

    public String getOrgRtr() {
        return orgRtr;
    }

    public void setOrgRtr(String orgRtr) {
        this.orgRtr = orgRtr;
    }

    public String getOrgCurrency() {
        return orgCurrency;
    }

    public void setOrgCurrency(String orgCurrency) {
        this.orgCurrency = orgCurrency;
    }

    public String getUpdStatusDate() {
        return updStatusDate;
    }

    public void setUpdStatusDate(String updStatusDate) {
        this.updStatusDate = updStatusDate;
    }

    public long getUpdAcctNo() {
        return updAcctNo;
    }

    public void setUpdAcctNo(long updAcctNo) {
        this.updAcctNo = updAcctNo;
    }

    public String getUpdAcctNoStr() {
        return updAcctNoStr;
    }

    public void setUpdAcctNoStr(String updAcctNoStr) {
        this.updAcctNoStr = updAcctNoStr;
    }

    public long getUpdAmount() {
        return updAmount;
    }

    public void setUpdAmount(long updAmount) {
        this.updAmount = updAmount;
    }

    public String getUpdAcctTy() {
        return updAcctTy;
    }

    public void setUpdAcctTy(String updAcctTy) {
        this.updAcctTy = updAcctTy;
    }

    public String getUpdMappedAcctTy() {
        return updMappedAcctTy;
    }

    public void setUpdMappedAcctTy(String updMappedAcctTy) {
        this.updMappedAcctTy = updMappedAcctTy;
    }

    public String getUpdStatus() {
        return updStatus;
    }

    public void setUpdStatus(String updStatus) {
        this.updStatus = updStatus;
    }

    public String getUpdRtr() {
        return updRtr;
    }

    public void setUpdRtr(String updRtr) {
        this.updRtr = updRtr;
    }

    public String getUpdCurrency() {
        return updCurrency;
    }

    public void setUpdCurrency(String updCurrency) {
        this.updCurrency = updCurrency;
    }

    public String getSecure() {
        return secure;
    }

    public void setSecure(String secure) {
        this.secure = secure;
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

    public String getAssosTy() {
        return assosTy;
    }

    public void setAssosTy(String assosTy) {
        this.assosTy = assosTy;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public long getRecoveryAmount() {
        return recoveryAmount;
    }

    public void setRecoveryAmount(long recoveryAmount) {
        this.recoveryAmount = recoveryAmount;
    }

    public String getRecoveryDate() {
        return recoveryDate;
    }

    public void setRecoveryDate(String recoveryDate) {
        this.recoveryDate = recoveryDate;
    }

    public String getDispute() {
        return dispute;
    }

    public void setDispute(String dispute) {
        this.dispute = dispute;
    }
}
