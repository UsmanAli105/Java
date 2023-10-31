package org.example;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
    @JsonProperty("Status")
    private String status;
    @JsonProperty("Report")
    private Report report;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }
}

class Report{
    @JsonProperty("ROOT")
    private Root root;

    public Root getRoot() {
        return root;
    }

    public void setRoot(Root root) {
        this.root = root;
    }
}
class Root{
    @JsonProperty("INDIVIDUAL_DETAIL")
    private AbsLoanIndividualDetail individualDetail;
    @JsonProperty("HOME_INFORMATION")
    private AbsLoanHomeInformationBean homeInformation;
    @JsonProperty("EMPLOYER_INFORMATION")
    private AbsLoanEmployerInformationBean employerInformation;
    @JsonProperty("CREDIT_SCORE")
    private AbsLoanCreditScoreBean creditScore;
    @JsonProperty("DEFAULTS")
    private AbsLoanDefaultsBean defaults;
    @JsonProperty("FILE_NOTES")
    private AbsLoanFileNotesBean fileNotes;
    @JsonProperty("CCP_MASTER")
    private AbsLoanCcpMasterBean ccpMaster;
    @JsonProperty("CCP_DETAIL")
    private AbsLoanCcpDetailBean ccpDetail;
    @JsonProperty("CCP_SUMMARY")
    private AbsLoanCcpSummaryBean ccpSummary;
    @JsonProperty("CCP_SUMMARY_TOTAL")
    private AbsLoanCcpSummaryTotalBean ccpSummaryTotalBean;
    @JsonProperty("ENQUIRIES")
    private AbsLoanEnquiriesBean enquiries;
    @JsonProperty("COLLATERAL")
    private AbsLoanCollateralBean collateral;
    @JsonProperty("ASSOCIATION")
    private AbsLoanAssociationBean association;
    @JsonProperty("GUARANTEES_DETAILS")
    private AbsLoanGuaranteesDetailsBean guaranteesDetails;
    @JsonProperty("COBORROWER_DETAILS")
    private AbsLoanCoborrowerDetailsBean coborrowerDetails;
    @JsonProperty("BANKRUPTCY_DETAILS")
    private AbsLoanBankruptcyDetailsBean bankruptcyDetails;
    @JsonProperty("REVIEW")
    private AbsLoanReviewBean review;
    @JsonProperty("REPORT_MESSAGE")
    private AbsLoanReportMessageBean reportMessage;
    @JsonProperty("CREDIT_SUMMARY")
    private AbsLoanCreditSummaryBean creditSummary;

    public AbsLoanIndividualDetail getIndividualDetail() {
        return individualDetail;
    }

    public void setIndividualDetail(AbsLoanIndividualDetail individualDetail) {
        this.individualDetail = individualDetail;
    }

    public AbsLoanHomeInformationBean getHomeInformation() {
        return homeInformation;
    }

    public void setHomeInformation(AbsLoanHomeInformationBean homeInformation) {
        this.homeInformation = homeInformation;
    }

    public AbsLoanEmployerInformationBean getEmployerInformation() {
        return employerInformation;
    }

    public void setEmployerInformation(AbsLoanEmployerInformationBean employerInformation) {
        this.employerInformation = employerInformation;
    }

    public AbsLoanCreditScoreBean getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(AbsLoanCreditScoreBean creditScore) {
        this.creditScore = creditScore;
    }

    public AbsLoanDefaultsBean getDefaults() {
        return defaults;
    }

    public void setDefaults(AbsLoanDefaultsBean defaults) {
        this.defaults = defaults;
    }

    public AbsLoanFileNotesBean getFileNotes() {
        return fileNotes;
    }

    public void setFileNotes(AbsLoanFileNotesBean fileNotes) {
        this.fileNotes = fileNotes;
    }

    public AbsLoanCcpMasterBean getCcpMaster() {
        return ccpMaster;
    }

    public void setCcpMaster(AbsLoanCcpMasterBean ccpMaster) {
        this.ccpMaster = ccpMaster;
    }

    public AbsLoanCcpDetailBean getCcpDetail() {
        return ccpDetail;
    }

    public void setCcpDetail(AbsLoanCcpDetailBean ccpDetail) {
        this.ccpDetail = ccpDetail;
    }

    public AbsLoanCcpSummaryBean getCcpSummary() {
        return ccpSummary;
    }

    public void setCcpSummary(AbsLoanCcpSummaryBean ccpSummary) {
        this.ccpSummary = ccpSummary;
    }

    public AbsLoanCcpSummaryTotalBean getCcpSummaryTotalBean() {
        return ccpSummaryTotalBean;
    }

    public void setCcpSummaryTotalBean(AbsLoanCcpSummaryTotalBean ccpSummaryTotalBean) {
        this.ccpSummaryTotalBean = ccpSummaryTotalBean;
    }

    public AbsLoanEnquiriesBean getEnquiries() {
        return enquiries;
    }

    public void setEnquiries(AbsLoanEnquiriesBean enquiries) {
        this.enquiries = enquiries;
    }

    public AbsLoanCollateralBean getCollateral() {
        return collateral;
    }

    public void setCollateral(AbsLoanCollateralBean collateral) {
        this.collateral = collateral;
    }

    public AbsLoanAssociationBean getAssociation() {
        return association;
    }

    public void setAssociation(AbsLoanAssociationBean association) {
        this.association = association;
    }

    public AbsLoanGuaranteesDetailsBean getGuaranteesDetails() {
        return guaranteesDetails;
    }

    public void setGuaranteesDetails(AbsLoanGuaranteesDetailsBean guaranteesDetails) {
        this.guaranteesDetails = guaranteesDetails;
    }

    public AbsLoanCoborrowerDetailsBean getCoborrowerDetails() {
        return coborrowerDetails;
    }

    public void setCoborrowerDetails(AbsLoanCoborrowerDetailsBean coborrowerDetails) {
        this.coborrowerDetails = coborrowerDetails;
    }

    public AbsLoanBankruptcyDetailsBean getBankruptcyDetails() {
        return bankruptcyDetails;
    }

    public void setBankruptcyDetails(AbsLoanBankruptcyDetailsBean bankruptcyDetails) {
        this.bankruptcyDetails = bankruptcyDetails;
    }

    public AbsLoanReviewBean getReview() {
        return review;
    }

    public void setReview(AbsLoanReviewBean review) {
        this.review = review;
    }

    public AbsLoanReportMessageBean getReportMessage() {
        return reportMessage;
    }

    public void setReportMessage(AbsLoanReportMessageBean reportMessage) {
        this.reportMessage = reportMessage;
    }

    public AbsLoanCreditSummaryBean getCreditSummary() {
        return creditSummary;
    }

    public void setCreditSummary(AbsLoanCreditSummaryBean creditSummary) {
        this.creditSummary = creditSummary;
    }
}