import lt.viko.eif.ih.bakery.soap.client.*;
/**

 A class that tests the functionality of the GetCartByCustomer request of a bakery SOAP service.
 */

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class GetCartByCustomer {
    /**
     * Tests the GetCartByCustomer request by sending a request to the bakery SOAP service and checking
     * if the cart with the name 'Bread' and price '12' is found.
     */
    @Test
    public void testGetCartByCustomer() {
        BakeriesPortService service = new BakeriesPortService();
        BakeriesPort port = service.getBakeriesPortSoap11();

        GetCartByCustomerRequest request = new GetCartByCustomerRequest();
        request.setFirstName("Joseph");
        request.setLastName("Joestar");

        GetCartByCustomerResponse response = port.getCartByCustomer(request);

        boolean foundCart = false;

        for (Cart cart : response.getCart()) {
            if (cart.getName().equals("Bread") && cart.getPrice() == 12) {
                foundCart = true;
                break;
            }
        }
        assertTrue("Could not find cart with name 'Bread' and price '12'", foundCart);
    }
}
