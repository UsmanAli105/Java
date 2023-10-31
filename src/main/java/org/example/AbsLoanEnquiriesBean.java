//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.31 at 10:03:58 AM PKT 
//


package org.example;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbsLoanEnquiriesBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbsLoanEnquiriesBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://mobiliser.sybase365.com/custom/project/services/contract/v1_0/beans}BaseRequestBean">
 *       &lt;sequence>
 *         &lt;element name="fileNo" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}idLong"/>
 *         &lt;element name="tranxNo" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}idLong"/>
 *         &lt;element name="memName" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="subbrnName" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="referenceDate" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="separateDate" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="referenceNo" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="amount" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}idLong"/>
 *         &lt;element name="acctTy" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="mappedAcctTy" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="assocTy" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="enqSts" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="applicationDate" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="groupId" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}idLong"/>
 *         &lt;element name="currency" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="dispute" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbsLoanEnquiriesBean", propOrder = {
    "fileNo",
    "tranxNo",
    "memName",
    "subbrnName",
    "referenceDate",
    "separateDate",
    "referenceNo",
    "amount",
    "acctTy",
    "mappedAcctTy",
    "assocTy",
    "enqSts",
    "applicationDate",
    "groupId",
    "currency",
    "dispute"
})
public class AbsLoanEnquiriesBean
    extends BaseRequestBean
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long fileNo;
    protected long tranxNo;
    @XmlElement(required = true)
    protected String memName;
    @XmlElement(required = true)
    protected String subbrnName;
    @XmlElement(required = true)
    protected String referenceDate;
    @XmlElement(required = true)
    protected String separateDate;
    @XmlElement(required = true)
    protected String referenceNo;
    protected long amount;
    @XmlElement(required = true)
    protected String acctTy;
    @XmlElement(required = true)
    protected String mappedAcctTy;
    @XmlElement(required = true)
    protected String assocTy;
    @XmlElement(required = true)
    protected String enqSts;
    @XmlElement(required = true)
    protected String applicationDate;
    protected long groupId;
    @XmlElement(required = true)
    protected String currency;
    @XmlElement(required = true)
    protected String dispute;

    /**
     * Gets the value of the fileNo property.
     * 
     */
    public long getFileNo() {
        return fileNo;
    }

    /**
     * Sets the value of the fileNo property.
     * 
     */
    public void setFileNo(long value) {
        this.fileNo = value;
    }

    /**
     * Gets the value of the tranxNo property.
     * 
     */
    public long getTranxNo() {
        return tranxNo;
    }

    /**
     * Sets the value of the tranxNo property.
     * 
     */
    public void setTranxNo(long value) {
        this.tranxNo = value;
    }

    /**
     * Gets the value of the memName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemName() {
        return memName;
    }

    /**
     * Sets the value of the memName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemName(String value) {
        this.memName = value;
    }

    /**
     * Gets the value of the subbrnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubbrnName() {
        return subbrnName;
    }

    /**
     * Sets the value of the subbrnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubbrnName(String value) {
        this.subbrnName = value;
    }

    /**
     * Gets the value of the referenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDate() {
        return referenceDate;
    }

    /**
     * Sets the value of the referenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDate(String value) {
        this.referenceDate = value;
    }

    /**
     * Gets the value of the separateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeparateDate() {
        return separateDate;
    }

    /**
     * Sets the value of the separateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeparateDate(String value) {
        this.separateDate = value;
    }

    /**
     * Gets the value of the referenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNo() {
        return referenceNo;
    }

    /**
     * Sets the value of the referenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNo(String value) {
        this.referenceNo = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the acctTy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTy() {
        return acctTy;
    }

    /**
     * Sets the value of the acctTy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctTy(String value) {
        this.acctTy = value;
    }

    /**
     * Gets the value of the mappedAcctTy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappedAcctTy() {
        return mappedAcctTy;
    }

    /**
     * Sets the value of the mappedAcctTy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappedAcctTy(String value) {
        this.mappedAcctTy = value;
    }

    /**
     * Gets the value of the assocTy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssocTy() {
        return assocTy;
    }

    /**
     * Sets the value of the assocTy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssocTy(String value) {
        this.assocTy = value;
    }

    /**
     * Gets the value of the enqSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnqSts() {
        return enqSts;
    }

    /**
     * Sets the value of the enqSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnqSts(String value) {
        this.enqSts = value;
    }

    /**
     * Gets the value of the applicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationDate() {
        return applicationDate;
    }

    /**
     * Sets the value of the applicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationDate(String value) {
        this.applicationDate = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     */
    public long getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     */
    public void setGroupId(long value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the dispute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispute() {
        return dispute;
    }

    /**
     * Sets the value of the dispute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispute(String value) {
        this.dispute = value;
    }

}
