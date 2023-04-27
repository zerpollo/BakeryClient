
import lt.viko.eif.ih.bakery.soap.client.*;
/**

 A JUnit test class to test the functionality of getting a bakery by customer and checking if the customer exists in the bakery object using SOAP client.
*/
import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class GetBakeryByCustomerTest {
    /**
     * A JUnit test method to test getting a bakery by customer.
     * It creates an instance of SOAP client and sends a request to get a bakery by customer.
     * It checks if the expected customer exists in the bakery's customer list and asserts the result.
     */
    @Test
    public void testGetBakeryByCustomer() {
        BakeriesPortService service = new BakeriesPortService();
        BakeriesPort port = service.getBakeriesPortSoap11();

        GetBakeryByCustomerRequest request = new GetBakeryByCustomerRequest();
        request.setFirstName("Joseph");
        request.setLastName("Joestar");

        GetBakeryByCustomerResponse response = port.getBakeryByCustomer(request);
        Bakery bakery = response.getBakery();
        boolean foundCustomer = false;
        for (Customer customer : bakery.getCustomerList()) {
            if (customer.getFirstName().equals("Joseph") && customer.getLastName().equals("Joestar")) {
                foundCustomer = true;
                break;
            }
        }

        assertTrue("Expected customer not found", foundCustomer);
    }
}






