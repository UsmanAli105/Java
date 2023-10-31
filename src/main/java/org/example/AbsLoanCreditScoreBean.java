package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AbsLoanCreditScoreBean {
    @JsonProperty("FILE_NO")
    protected long fileNo;
    @JsonProperty("TRANX_NO")
    protected long tranxNo;
    @JsonProperty("SCORE")
    protected long score;
    @JsonProperty("ODDS")
    protected String odds;
    @JsonProperty("PROB_OF_DEFALUT")
    protected String probOfDefault;
    @JsonProperty("PERCENTILE_RISK")
    protected String percentileRisk;
    @JsonProperty("SBP_RISK_LEVEL")
    protected String sbpRiskLevel;

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

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public String getOdds() {
        return odds;
    }

    public void setOdds(String odds) {
        this.odds = odds;
    }

    public String getProbOfDefault() {
        return probOfDefault;
    }

    public void setProbOfDefault(String probOfDefault) {
        this.probOfDefault = probOfDefault;
    }

    public String getPercentileRisk() {
        return percentileRisk;
    }

    public void setPercentileRisk(String percentileRisk) {
        this.percentileRisk = percentileRisk;
    }

    public String getSbpRiskLevel() {
        return sbpRiskLevel;
    }

    public void setSbpRiskLevel(String sbpRiskLevel) {
        this.sbpRiskLevel = sbpRiskLevel;
    }
}
