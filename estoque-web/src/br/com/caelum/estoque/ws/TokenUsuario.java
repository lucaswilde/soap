
package br.com.caelum.estoque.ws;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for tokenUsuario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tokenUsuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataValidade" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tokenUsuario", propOrder = {
    "dataValidade",
    "token"
})
public class TokenUsuario {

    @XmlSchemaType(name = "dateTime")
    @XmlJavaTypeAdapter(value=DateAdapter.class)
    protected Date dataValidade;
    protected String token;

    /**
     * Gets the value of the dataValidade property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDataValidade() {
        return dataValidade;
    }

    /**
     * Sets the value of the dataValidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDataValidade(Date value) {
        this.dataValidade = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}
