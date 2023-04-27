import lt.viko.eif.ih.bakery.soap.client.*;

/**

 A JUnit test class for testing the GetBakeryRequest SOAP request.
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GetBakeryTest {
    /**
     * A method that tests the GetBakeryRequest SOAP request.
     * Sends a request to the server to get information about the bakery called "BestBakery".
     * The test then checks if a Bakery object was returned and if its name is "BestBakery".
     */
    @Test
    public void testGetBakery() {

    GetBakeryRequest bakeryRequest = new GetBakeryRequest();
    bakeryRequest.setName("BestBakery");

    BakeriesPortService bakeryService = new BakeriesPortService();
    BakeriesPort bakeryPort = bakeryService.getBakeriesPortSoap11();
    GetBakeryResponse bakeryResponse = bakeryPort.getBakery(bakeryRequest);

    Bakery bakery = bakeryResponse.getBakery();
    assertNotNull(bakery);
    assertEquals("BestBakery", bakery.getName());
    }
}
