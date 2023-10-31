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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AbsLoanAssociationBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbsLoanAssociationBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://mobiliser.sybase365.com/custom/project/services/contract/v1_0/beans}BaseRequestBean">
 *       &lt;sequence>
 *         &lt;element name="fileNo" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}idLong"/>
 *         &lt;element name="tranxNo" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}idLong"/>
 *         &lt;element name="assoc" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="nicNo" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="cnicNo" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="firstName" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="middleName" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="lastName" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="guaranteeAmount" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}idLong"/>
 *         &lt;element name="guaranteeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="invocationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="section" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="acctSeqNo" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbsLoanAssociationBean", propOrder = {
    "fileNo",
    "tranxNo",
    "assoc",
    "nicNo",
    "cnicNo",
    "firstName",
    "middleName",
    "lastName",
    "guaranteeAmount",
    "guaranteeDate",
    "invocationDate",
    "section",
    "acctSeqNo"
})
public class AbsLoanAssociationBean
    extends BaseRequestBean
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long fileNo;
    protected long tranxNo;
    @XmlElement(required = true)
    protected String assoc;
    @XmlElement(required = true)
    protected String nicNo;
    @XmlElement(required = true)
    protected String cnicNo;
    @XmlElement(required = true)
    protected String firstName;
    @XmlElement(required = true)
    protected String middleName;
    @XmlElement(required = true)
    protected String lastName;
    protected long guaranteeAmount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar guaranteeDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invocationDate;
    @XmlElement(required = true)
    protected String section;
    @XmlElement(required = true)
    protected String acctSeqNo;

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
     * Gets the value of the assoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssoc() {
        return assoc;
    }

    /**
     * Sets the value of the assoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssoc(String value) {
        this.assoc = value;
    }

    /**
     * Gets the value of the nicNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNicNo() {
        return nicNo;
    }

    /**
     * Sets the value of the nicNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNicNo(String value) {
        this.nicNo = value;
    }

    /**
     * Gets the value of the cnicNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnicNo() {
        return cnicNo;
    }

    /**
     * Sets the value of the cnicNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnicNo(String value) {
        this.cnicNo = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the guaranteeAmount property.
     * 
     */
    public long getGuaranteeAmount() {
        return guaranteeAmount;
    }

    /**
     * Sets the value of the guaranteeAmount property.
     * 
     */
    public void setGuaranteeAmount(long value) {
        this.guaranteeAmount = value;
    }

    /**
     * Gets the value of the guaranteeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGuaranteeDate() {
        return guaranteeDate;
    }

    /**
     * Sets the value of the guaranteeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGuaranteeDate(XMLGregorianCalendar value) {
        this.guaranteeDate = value;
    }

    /**
     * Gets the value of the invocationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvocationDate() {
        return invocationDate;
    }

    /**
     * Sets the value of the invocationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvocationDate(XMLGregorianCalendar value) {
        this.invocationDate = value;
    }

    /**
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSection(String value) {
        this.section = value;
    }

    /**
     * Gets the value of the acctSeqNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSeqNo() {
        return acctSeqNo;
    }

    /**
     * Sets the value of the acctSeqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctSeqNo(String value) {
        this.acctSeqNo = value;
    }

}