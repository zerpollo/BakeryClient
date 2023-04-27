
package lt.viko.eif.ih.bakery.soap.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BakeriesPortService", targetNamespace = "http://spring.io/guides/gs-producing-web-service", wsdlLocation = "http://localhost:8080/ws/bakeries.wsdl")
public class BakeriesPortService
    extends Service
{

    private final static URL BAKERIESPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException BAKERIESPORTSERVICE_EXCEPTION;
    private final static QName BAKERIESPORTSERVICE_QNAME = new QName("http://spring.io/guides/gs-producing-web-service", "BakeriesPortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ws/bakeries.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BAKERIESPORTSERVICE_WSDL_LOCATION = url;
        BAKERIESPORTSERVICE_EXCEPTION = e;
    }

    public BakeriesPortService() {
        super(__getWsdlLocation(), BAKERIESPORTSERVICE_QNAME);
    }

    public BakeriesPortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BAKERIESPORTSERVICE_QNAME, features);
    }

    public BakeriesPortService(URL wsdlLocation) {
        super(wsdlLocation, BAKERIESPORTSERVICE_QNAME);
    }

    public BakeriesPortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BAKERIESPORTSERVICE_QNAME, features);
    }

    public BakeriesPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BakeriesPortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BakeriesPort
     */
    @WebEndpoint(name = "BakeriesPortSoap11")
    public BakeriesPort getBakeriesPortSoap11() {
        return super.getPort(new QName("http://spring.io/guides/gs-producing-web-service", "BakeriesPortSoap11"), BakeriesPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta .xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BakeriesPort
     */
    @WebEndpoint(name = "BakeriesPortSoap11")
    public BakeriesPort getBakeriesPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://spring.io/guides/gs-producing-web-service", "BakeriesPortSoap11"), BakeriesPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BAKERIESPORTSERVICE_EXCEPTION!= null) {
            throw BAKERIESPORTSERVICE_EXCEPTION;
        }
        return BAKERIESPORTSERVICE_WSDL_LOCATION;
    }

}
