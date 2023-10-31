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
 * <p>Java class for AbsLoanReviewBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbsLoanReviewBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://mobiliser.sybase365.com/custom/project/services/contract/v1_0/beans}BaseRequestBean">
 *       &lt;sequence>
 *         &lt;element name="fileNo" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}idLong"/>
 *         &lt;element name="tranxNo" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}idLong"/>
 *         &lt;element name="member" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}strMedium"/>
 *         &lt;element name="reviews" type="{http://mobiliser.sybase365.com/framework/contract/v5_0/base}idLong"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbsLoanReviewBean", propOrder = {
    "fileNo",
    "tranxNo",
    "member",
    "reviews"
})
public class AbsLoanReviewBean
    extends BaseRequestBean
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected long fileNo;
    protected long tranxNo;
    @XmlElement(required = true)
    protected String member;
    protected long reviews;

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
     * Gets the value of the member property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMember() {
        return member;
    }

    /**
     * Sets the value of the member property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMember(String value) {
        this.member = value;
    }

    /**
     * Gets the value of the reviews property.
     * 
     */
    public long getReviews() {
        return reviews;
    }

    /**
     * Sets the value of the reviews property.
     * 
     */
    public void setReviews(long value) {
        this.reviews = value;
    }

}
