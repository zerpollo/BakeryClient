package lt.viko.eif.ih.bakery.soap.client.pages;

/**

 The GetBakeryByCustomerPage class is responsible for retrieving and displaying
 the bakery information for a specific customer. It creates an instance of the
 SOAP client and sends a GetBakeryByCustomerRequest to retrieve the bakery
 information. It then generates an HTML output to display the bakery name,
 address, and a list of customers associated with the bakery.
 */


import lt.viko.eif.ih.bakery.soap.client.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GetBakeryByCustomerPage {
    /**
     The main method creates an instance of the SOAP client and sends a GetBakeryByCustomerRequest
     to retrieve the bakery information. It then generates an HTML output to display
     the bakery name, address, and a list of customers associated with the bakery.
     */
    public static void main(String[] args) {
        // Create an instance of the SOAP client
        BakeriesPortService service = new BakeriesPortService();
        BakeriesPort port = service.getBakeriesPortSoap11();

        GetBakeryByCustomerRequest request = new GetBakeryByCustomerRequest();
        request.setFirstName("Joseph");
        request.setLastName("Joestar");

        GetBakeryByCustomerResponse response = port.getBakeryByCustomer(request);
        Bakery bakery = response.getBakery();

        String html = "<html>" +
                "<head>" +
                "<title>Pagrindinis</title>" +
                "<link rel=\"stylesheet\" href=\"pictures/index.css\">" +
                "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">" +
                "</head>" +
                "<body class=\"d-flex\" style=\"min-height: 100vh; background-color: #808080; color: white;\">" +
                "<div class=\"container\">" +
                "<h1 class=\"text-center\">" + bakery.getName() + "</h1>\n" +
                "<p>" + bakery.getAddress() + "</p>\n" +
                "<br></br>" +
                "<p class=\"text-center\">List of customers</p>" +
                "<br></br>" +
                "<ul class=\"list-group\">";
        for (Customer customer : bakery.getCustomerList()) {
            html += "<li>" + customer.getFirstName() + " " + customer.getLastName() + " - " + customer.getPhoneNumber() + " <button class=\"btn btn-danger float-right\" onclick=\"toggleVisibility(this)\"><img id=\"updateicon\" src=\"pictures/trash-fill.svg\" alt=\"updateicon\"/> Hide</button></li>";
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
        try (PrintWriter writer = new PrintWriter(new FileWriter("bakerybycustomer.html"))) {
            writer.println(html);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
