//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.06 at 05:46:53 PM EET 
//


package db.pcci.ita.msa.cards.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for CardOrderManagementHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardOrderManagementHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestID" type="{http://www.equens.com/cards/issuing/types/v1.0}Max36Text"/&gt;
 *         &lt;element name="IssuerID" type="{http://www.equens.com/cards/issuing/types/v1.0}Max5Text" minOccurs="0"/&gt;
 *         &lt;element name="RequestTimestamp" type="{http://www.equens.com/cards/issuing/types/v1.0}Max40Text"/&gt;
 *         &lt;element name="LoginID" type="{http://www.equens.com/cards/issuing/types/v1.0}Max8Text"/&gt;
 *         &lt;element name="OperatorID" type="{http://www.equens.com/cards/issuing/types/v1.0}Max8Text" minOccurs="0"/&gt;
 *         &lt;element name="OriginatingChannel" type="{http://www.equens.com/cards/issuing/types/v1.0}Max12Text" minOccurs="0"/&gt;
 *         &lt;element name="ResponseMode" type="{http://www.equens.com/cards/issuing/types/v1.0}Max1Text" minOccurs="0"/&gt;
 *         &lt;element name="OrderMode" type="{http://www.equens.com/cards/issuing/types/v1.0}Max1Text" minOccurs="0"/&gt;
 *         &lt;element name="FunctionVersion" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardOrderManagementHeader", propOrder = {
    "requestID",
    "issuerID",
    "requestTimestamp",
    "loginID",
    "operatorID",
    "originatingChannel",
    "responseMode",
    "orderMode",
    "functionVersion"
})
public class CardOrderManagementHeader implements ToString2
{

    @XmlElement(name = "RequestID", required = true)
    protected String requestID;
    @XmlElement(name = "IssuerID")
    protected String issuerID;
    @XmlElement(name = "RequestTimestamp", required = true)
    protected String requestTimestamp;
    @XmlElement(name = "LoginID", required = true)
    protected String loginID;
    @XmlElement(name = "OperatorID")
    protected String operatorID;
    @XmlElement(name = "OriginatingChannel")
    protected String originatingChannel;
    @XmlElement(name = "ResponseMode")
    protected String responseMode;
    @XmlElement(name = "OrderMode")
    protected String orderMode;
    @XmlElement(name = "FunctionVersion")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar functionVersion;

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the issuerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerID() {
        return issuerID;
    }

    /**
     * Sets the value of the issuerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerID(String value) {
        this.issuerID = value;
    }

    /**
     * Gets the value of the requestTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestTimestamp() {
        return requestTimestamp;
    }

    /**
     * Sets the value of the requestTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTimestamp(String value) {
        this.requestTimestamp = value;
    }

    /**
     * Gets the value of the loginID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginID() {
        return loginID;
    }

    /**
     * Sets the value of the loginID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginID(String value) {
        this.loginID = value;
    }

    /**
     * Gets the value of the operatorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorID() {
        return operatorID;
    }

    /**
     * Sets the value of the operatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorID(String value) {
        this.operatorID = value;
    }

    /**
     * Gets the value of the originatingChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingChannel() {
        return originatingChannel;
    }

    /**
     * Sets the value of the originatingChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingChannel(String value) {
        this.originatingChannel = value;
    }

    /**
     * Gets the value of the responseMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseMode() {
        return responseMode;
    }

    /**
     * Sets the value of the responseMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseMode(String value) {
        this.responseMode = value;
    }

    /**
     * Gets the value of the orderMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderMode() {
        return orderMode;
    }

    /**
     * Sets the value of the orderMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderMode(String value) {
        this.orderMode = value;
    }

    /**
     * Gets the value of the functionVersion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFunctionVersion() {
        return functionVersion;
    }

    /**
     * Sets the value of the functionVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFunctionVersion(XMLGregorianCalendar value) {
        this.functionVersion = value;
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
            String theRequestID;
            theRequestID = this.getRequestID();
            strategy.appendField(locator, this, "requestID", buffer, theRequestID, (this.requestID!= null));
        }
        {
            String theIssuerID;
            theIssuerID = this.getIssuerID();
            strategy.appendField(locator, this, "issuerID", buffer, theIssuerID, (this.issuerID!= null));
        }
        {
            String theRequestTimestamp;
            theRequestTimestamp = this.getRequestTimestamp();
            strategy.appendField(locator, this, "requestTimestamp", buffer, theRequestTimestamp, (this.requestTimestamp!= null));
        }
        {
            String theLoginID;
            theLoginID = this.getLoginID();
            strategy.appendField(locator, this, "loginID", buffer, theLoginID, (this.loginID!= null));
        }
        {
            String theOperatorID;
            theOperatorID = this.getOperatorID();
            strategy.appendField(locator, this, "operatorID", buffer, theOperatorID, (this.operatorID!= null));
        }
        {
            String theOriginatingChannel;
            theOriginatingChannel = this.getOriginatingChannel();
            strategy.appendField(locator, this, "originatingChannel", buffer, theOriginatingChannel, (this.originatingChannel!= null));
        }
        {
            String theResponseMode;
            theResponseMode = this.getResponseMode();
            strategy.appendField(locator, this, "responseMode", buffer, theResponseMode, (this.responseMode!= null));
        }
        {
            String theOrderMode;
            theOrderMode = this.getOrderMode();
            strategy.appendField(locator, this, "orderMode", buffer, theOrderMode, (this.orderMode!= null));
        }
        {
            XMLGregorianCalendar theFunctionVersion;
            theFunctionVersion = this.getFunctionVersion();
            strategy.appendField(locator, this, "functionVersion", buffer, theFunctionVersion, (this.functionVersion!= null));
        }
        return buffer;
    }

}