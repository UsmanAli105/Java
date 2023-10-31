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
 * <p>Java class for AbsLoanBankruptcyDetailsBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbsLoanBankruptcyDetailsBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://mobiliser.sybase365.com/custom/project/services/contract/v1_0/beans}BaseRequestBean">
 *       &lt;sequence>
 *         &lt;element name="fileNo" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}idLong"/>
 *         &lt;element name="tranxNo" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}idLong"/>
 *         &lt;element name="coutName" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="declDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbsLoanBankruptcyDetailsBean", propOrder = {
    "fileNo",
    "tranxNo",
    "coutName",
    "declDt"
})
public class AbsLoanBankruptcyDetailsBean
    extends BaseRequestBean
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long fileNo;
    protected long tranxNo;
    @XmlElement(required = true)
    protected String coutName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar declDt;

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
     * Gets the value of the coutName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoutName() {
        return coutName;
    }

    /**
     * Sets the value of the coutName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoutName(String value) {
        this.coutName = value;
    }

    /**
     * Gets the value of the declDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeclDt() {
        return declDt;
    }

    /**
     * Sets the value of the declDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeclDt(XMLGregorianCalendar value) {
        this.declDt = value;
    }

}
