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
 * <p>Java class for AbsLoanGuaranteesDetailsBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbsLoanGuaranteesDetailsBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://mobiliser.sybase365.com/custom/project/services/contract/v1_0/beans}BaseRequestBean">
 *       &lt;sequence>
 *         &lt;element name="fileNo" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}idLong"/>
 *         &lt;element name="tranxNo" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}idLong"/>
 *         &lt;element name="grnInFavr" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="cnic" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="amount" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}idLong"/>
 *         &lt;element name="grnFileNo" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}idLong"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbsLoanGuaranteesDetailsBean", propOrder = {
    "fileNo",
    "tranxNo",
    "grnInFavr",
    "cnic",
    "amount",
    "grnFileNo"
})
public class AbsLoanGuaranteesDetailsBean
    extends BaseRequestBean
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long fileNo;
    protected long tranxNo;
    @XmlElement(required = true)
    protected String grnInFavr;
    @XmlElement(required = true)
    protected String cnic;
    protected long amount;
    protected long grnFileNo;

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
     * Gets the value of the grnInFavr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrnInFavr() {
        return grnInFavr;
    }

    /**
     * Sets the value of the grnInFavr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrnInFavr(String value) {
        this.grnInFavr = value;
    }

    /**
     * Gets the value of the cnic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnic() {
        return cnic;
    }

    /**
     * Sets the value of the cnic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnic(String value) {
        this.cnic = value;
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
     * Gets the value of the grnFileNo property.
     * 
     */
    public long getGrnFileNo() {
        return grnFileNo;
    }

    /**
     * Sets the value of the grnFileNo property.
     * 
     */
    public void setGrnFileNo(long value) {
        this.grnFileNo = value;
    }

}
