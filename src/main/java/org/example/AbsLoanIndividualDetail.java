package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
public class AbsLoanIndividualDetail {
    @JsonProperty("FILE_NO")
    protected long fileNo;
    @JsonProperty("TRANX_NO")
    protected long tranxNo;
    @JsonProperty("TRANX_DATE")
    protected String tranxDate;
    @JsonProperty("CREATION_DATE")
    protected String creationDate;
    @JsonProperty("TITLE")
    protected String title;
    @JsonProperty("FIRST_NAME")
    protected String firstName;
    @JsonProperty("MIDDLE_NAME")
    protected String middleName;
    @JsonProperty("LAST_NAME")
    protected String lastName;
    @JsonProperty("NIC")
    protected String nic;
    @JsonProperty("CNIC")
    protected String cnic;
    @JsonProperty("NTN")
    protected String ntn;
    @JsonProperty("GENDER")
    protected String gender;
    @JsonProperty("DOB")
    protected String dob;
    @JsonProperty("PROFESSION")
    protected DataSection profession;
    @JsonProperty("MARITIAL_STATUS")
    protected String maritalStatus;
    @JsonProperty("DEPENDANTS")
    protected long dependents;
    @JsonProperty("NATL_TYPE")
    protected String natlType;
    @JsonProperty("NATIONALITY")
    protected String nationality;
    @JsonProperty("QUALIFICATION")
    protected DataSection qualification;
    @JsonProperty("MAKER")
    protected String maker;
    @JsonProperty("CHECKER")
    protected String checker;
    @JsonProperty("FATHER_HUSBAND_FNAME")
    protected String fatherHusbandFName;
    @JsonProperty("FATHER_HUSBAND_MNAME")
    protected String fatherHusbandMName;
    @JsonProperty("FATHER_HUSBAND_LNAME")
    protected String fatherHusbandLName;
    @JsonProperty("IS_SELF")
    protected String isSelf;
    @JsonProperty("REFERENCE_NO")
    protected String refereceNo;
    @JsonProperty("TRNX_RESULT")
    protected String trnxResult;

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

    public String getTranxDate() {
        return tranxDate;
    }

    public void setTranxDate(String tranxDate) {
        this.tranxDate = tranxDate;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getNtn() {
        return ntn;
    }

    public void setNtn(String ntn) {
        this.ntn = ntn;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public DataSection getProfession() {
        return profession;
    }

    public void setProfession(DataSection profession) {
        this.profession = profession;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public long getDependents() {
        return dependents;
    }

    public void setDependents(long dependents) {
        this.dependents = dependents;
    }

    public String getNatlType() {
        return natlType;
    }

    public void setNatlType(String natlType) {
        this.natlType = natlType;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public DataSection getQualification() {
        return qualification;
    }

    public void setQualification(DataSection qualification) {
        this.qualification = qualification;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public String getFatherHusbandFName() {
        return fatherHusbandFName;
    }

    public void setFatherHusbandFName(String fatherHusbandFName) {
        this.fatherHusbandFName = fatherHusbandFName;
    }

    public String getFatherHusbandMName() {
        return fatherHusbandMName;
    }

    public void setFatherHusbandMName(String fatherHusbandMName) {
        this.fatherHusbandMName = fatherHusbandMName;
    }

    public String getFatherHusbandLName() {
        return fatherHusbandLName;
    }

    public void setFatherHusbandLName(String fatherHusbandLName) {
        this.fatherHusbandLName = fatherHusbandLName;
    }

    public String getIsSelf() {
        return isSelf;
    }

    public void setIsSelf(String isSelf) {
        this.isSelf = isSelf;
    }

    public String getRefereceNo() {
        return refereceNo;
    }

    public void setRefereceNo(String refereceNo) {
        this.refereceNo = refereceNo;
    }

    public String getTrnxResult() {
        return trnxResult;
    }

    public void setTrnxResult(String trnxResult) {
        this.trnxResult = trnxResult;
    }
}