
package lt.viko.eif.ih.bakery.soap.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bakery" type="{http://spring.io/guides/gs-producing-web-service}Bakery"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bakery"
})
@XmlRootElement(name = "getBakeryByCustomerResponse")
public class GetBakeryByCustomerResponse {

    @XmlElement(required = true)
    protected Bakery bakery;

    /**
     * Gets the value of the bakery property.
     * 
     * @return
     *     possible object is
     *     {@link Bakery }
     *     
     */
    public Bakery getBakery() {
        return bakery;
    }

    /**
     * Sets the value of the bakery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bakery }
     *     
     */
    public void setBakery(Bakery value) {
        this.bakery = value;
    }

}
