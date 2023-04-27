package lt.viko.eif.ih.bakery.soap.client.pages;

/**

 The GetCartByCustomerPage class is responsible for retrieving and displaying
 the client's cart information for a specific client first name and last name. It creates an instance of the
 SOAP client and sends a GetCartByCustomerRequest to retrieve the cart
 information. It then generates an HTML output to display the customer first name,
 last name, and a list of carts associated with the customer.
 */

import lt.viko.eif.ih.bakery.soap.client.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GetCartByCustomerPage {
    public static void main(String[] args) {
        // Create an instance of the SOAP client
        BakeriesPortService service = new BakeriesPortService();
        BakeriesPort port = service.getBakeriesPortSoap11();

        GetCartByCustomerRequest request = new GetCartByCustomerRequest();
        request.setFirstName("Joseph");
        request.setLastName("Joestar");

        GetCartByCustomerResponse response = port.getCartByCustomer(request);
        String html = "<html>" +
                "<head>" +
                "<title>Customer's Carts</title>" +
                "<link rel=\"stylesheet\" href=\"pictures/index.css\">" +
                "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">" +
                "</head>" +
                "<body class=\"d-flex\" style=\"min-height: 100vh; background-color: #808080; color: white;\">" +
                "<div class=\"container\">" +
                "<h1 class=\"text-center\">" + request.getFirstName() + " " + request.getLastName() + "'s Cart</h1>\n" +
                "<br></br>" +
                "<ul class=\"list-group\">";
        for (Cart cart : response.getCart()) {
            html += "<li>" + cart.getName() + " - " + cart.getPrice() + " <button class=\"btn btn-danger float-right\" onclick=\"toggleVisibility(this)\"><img id=\"updateicon\" src=\"pictures/trash-fill.svg\" alt=\"updateicon\"/> Hide</button></li>";
        }
        html += "</ul>\n" +
                "</div>" +
                "<script>" +
                "function toggleVisibility(button) {" +
                "var li = button.parentNode;" +
                "if (li.style.display === 'none') {" +
                "li.style.display = 'list-item';" +
                "button.innerHTML = 'Hide';" +
                "} else {" +
                "li.style.display = 'none';" +
                "button.innerHTML = 'Show';" +
                "}" +
                "}" +
                "</script>" +
                "<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>" +
                "<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>" +
                "<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>" +
                "</body>" +
                "</html>";

        // Write the HTML output to a file
        try (PrintWriter writer = new PrintWriter(new FileWriter("cartbycustomer.html"))) {
            writer.println(html);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
