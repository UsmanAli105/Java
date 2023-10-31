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
 * <p>Java class for AbsLoanCcpSummaryTotalBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbsLoanCcpSummaryTotalBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://mobiliser.sybase365.com/custom/project/services/contract/v1_0/beans}BaseRequestBean">
 *       &lt;sequence>
 *         &lt;element name="fileNo" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}idLong"/>
 *         &lt;element name="tranxNo" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}idLong"/>
 *         &lt;element name="loanNo" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}idLong"/>
 *         &lt;element name="ok" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="x" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="p30" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="p60" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="p90" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="p120" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="p150" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="p180" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="loss" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbsLoanCcpSummaryTotalBean", propOrder = {
    "fileNo",
    "tranxNo",
    "loanNo",
    "ok",
    "x",
    "p30",
    "p60",
    "p90",
    "p120",
    "p150",
    "p180",
    "loss"
})
public class AbsLoanCcpSummaryTotalBean
    extends BaseRequestBean
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long fileNo;
    protected long tranxNo;
    protected long loanNo;
    @XmlElement(required = true)
    protected String ok;
    @XmlElement(required = true)
    protected String x;
    @XmlElement(required = true)
    protected String p30;
    @XmlElement(required = true)
    protected String p60;
    @XmlElement(required = true)
    protected String p90;
    @XmlElement(required = true)
    protected String p120;
    @XmlElement(required = true)
    protected String p150;
    @XmlElement(required = true)
    protected String p180;
    @XmlElement(required = true)
    protected String loss;

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
     * Gets the value of the loanNo property.
     * 
     */
    public long getLoanNo() {
        return loanNo;
    }

    /**
     * Sets the value of the loanNo property.
     * 
     */
    public void setLoanNo(long value) {
        this.loanNo = value;
    }

    /**
     * Gets the value of the ok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOk() {
        return ok;
    }

    /**
     * Sets the value of the ok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOk(String value) {
        this.ok = value;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX(String value) {
        this.x = value;
    }

    /**
     * Gets the value of the p30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP30() {
        return p30;
    }

    /**
     * Sets the value of the p30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP30(String value) {
        this.p30 = value;
    }

    /**
     * Gets the value of the p60 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP60() {
        return p60;
    }

    /**
     * Sets the value of the p60 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP60(String value) {
        this.p60 = value;
    }

    /**
     * Gets the value of the p90 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP90() {
        return p90;
    }

    /**
     * Sets the value of the p90 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP90(String value) {
        this.p90 = value;
    }

    /**
     * Gets the value of the p120 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP120() {
        return p120;
    }

    /**
     * Sets the value of the p120 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP120(String value) {
        this.p120 = value;
    }

    /**
     * Gets the value of the p150 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP150() {
        return p150;
    }

    /**
     * Sets the value of the p150 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP150(String value) {
        this.p150 = value;
    }

    /**
     * Gets the value of the p180 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP180() {
        return p180;
    }

    /**
     * Sets the value of the p180 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP180(String value) {
        this.p180 = value;
    }

    /**
     * Gets the value of the loss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoss() {
        return loss;
    }

    /**
     * Sets the value of the loss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoss(String value) {
        this.loss = value;
    }

}
