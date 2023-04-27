
package lt.viko.eif.ih.bakery.soap.client;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lt.viko.eif.ih.bakery.soap.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Bakery_QNAME = new QName("http://spring.io/guides/gs-producing-web-service", "bakery");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lt.viko.eif.ih.bakery.soap.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBakeryByCustomerResponse }
     * 
     */
    public GetBakeryByCustomerResponse createGetBakeryByCustomerResponse() {
        return new GetBakeryByCustomerResponse();
    }

    /**
     * Create an instance of {@link Bakery }
     * 
     */
    public Bakery createBakery() {
        return new Bakery();
    }

    /**
     * Create an instance of {@link GetBakeryByCustomerRequest }
     * 
     */
    public GetBakeryByCustomerRequest createGetBakeryByCustomerRequest() {
        return new GetBakeryByCustomerRequest();
    }

    /**
     * Create an instance of {@link GetCartByCustomerRequest }
     * 
     */
    public GetCartByCustomerRequest createGetCartByCustomerRequest() {
        return new GetCartByCustomerRequest();
    }

    /**
     * Create an instance of {@link GetBakeryResponse }
     * 
     */
    public GetBakeryResponse createGetBakeryResponse() {
        return new GetBakeryResponse();
    }

    /**
     * Create an instance of {@link GetCartByCustomerResponse }
     * 
     */
    public GetCartByCustomerResponse createGetCartByCustomerResponse() {
        return new GetCartByCustomerResponse();
    }

    /**
     * Create an instance of {@link Cart }
     * 
     */
    public Cart createCart() {
        return new Cart();
    }

    /**
     * Create an instance of {@link GetBakeryRequest }
     * 
     */
    public GetBakeryRequest createGetBakeryRequest() {
        return new GetBakeryRequest();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bakery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://spring.io/guides/gs-producing-web-service", name = "bakery")
    public JAXBElement<Bakery> createBakery(Bakery value) {
        return new JAXBElement<Bakery>(_Bakery_QNAME, Bakery.class, null, value);
    }

}
