//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.07 at 04:16:53 PM EET 
//


package db.pcci.ita.msa.cards.soap.client;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for CAMSCobolError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CAMSCobolError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrApplNo" type="{http://www.equens.com/cards/issuing/types/v1.0}Max5Digit"/&gt;
 *         &lt;element name="ErrCode" type="{http://www.equens.com/cards/issuing/types/v1.0}Max5Digit"/&gt;
 *         &lt;element name="ErrDesc" type="{http://www.equens.com/cards/issuing/types/v1.0}Max40Text"/&gt;
 *         &lt;element name="ErrSurrogate" type="{http://www.equens.com/cards/issuing/types/v1.0}Max23Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAMSCobolError", namespace = "http://www.equens.com/cards/issuing/types/v1.0", propOrder = {
    "errApplNo",
    "errCode",
    "errDesc",
    "errSurrogate"
})
public class CAMSCobolError implements ToString2
{

    @XmlElement(name = "ErrApplNo", required = true)
    protected BigInteger errApplNo;
    @XmlElement(name = "ErrCode", required = true)
    protected BigInteger errCode;
    @XmlElement(name = "ErrDesc", required = true)
    protected String errDesc;
    @XmlElement(name = "ErrSurrogate")
    protected String errSurrogate;

    /**
     * Gets the value of the errApplNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getErrApplNo() {
        return errApplNo;
    }

    /**
     * Sets the value of the errApplNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setErrApplNo(BigInteger value) {
        this.errApplNo = value;
    }

    /**
     * Gets the value of the errCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getErrCode() {
        return errCode;
    }

    /**
     * Sets the value of the errCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setErrCode(BigInteger value) {
        this.errCode = value;
    }

    /**
     * Gets the value of the errDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrDesc() {
        return errDesc;
    }

    /**
     * Sets the value of the errDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrDesc(String value) {
        this.errDesc = value;
    }

    /**
     * Gets the value of the errSurrogate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrSurrogate() {
        return errSurrogate;
    }

    /**
     * Sets the value of the errSurrogate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrSurrogate(String value) {
        this.errSurrogate = value;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            BigInteger theErrApplNo;
            theErrApplNo = this.getErrApplNo();
            strategy.appendField(locator, this, "errApplNo", buffer, theErrApplNo, (this.errApplNo!= null));
        }
        {
            BigInteger theErrCode;
            theErrCode = this.getErrCode();
            strategy.appendField(locator, this, "errCode", buffer, theErrCode, (this.errCode!= null));
        }
        {
            String theErrDesc;
            theErrDesc = this.getErrDesc();
            strategy.appendField(locator, this, "errDesc", buffer, theErrDesc, (this.errDesc!= null));
        }
        {
            String theErrSurrogate;
            theErrSurrogate = this.getErrSurrogate();
            strategy.appendField(locator, this, "errSurrogate", buffer, theErrSurrogate, (this.errSurrogate!= null));
        }
        return buffer;
    }

}
