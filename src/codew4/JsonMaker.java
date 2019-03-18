package codew4;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonMaker {
    public static void main(String[] args) throws IOException {

        JSONObject obj = new JSONObject();
        obj.put("Name", "crunchify.com");
        obj.put("Author", "App Shah");

        JSONArray company = new JSONArray();
        company.add("Company: eBay");
        company.add("Company: Paypal");
        company.add("Company: Google");
        obj.put("Company List", company);

        // try-with-resources statement based on post comment below :)
        try (FileWriter file = new FileWriter("book.json")) {
            file.write(obj.toJSONString());
            System.out.println("Successfully Copied JSON Object to File...");
            System.out.println("\nJSON Object: " + obj);
        }
    }
}
