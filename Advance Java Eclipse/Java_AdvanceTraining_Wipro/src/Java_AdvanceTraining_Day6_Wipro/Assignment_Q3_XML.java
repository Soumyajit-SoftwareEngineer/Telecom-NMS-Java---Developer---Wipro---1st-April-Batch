package Java_AdvanceTraining_Day6_Wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import org.json.JSONObject;
import org.json.XML;


 public class XmlToJsonConverter {
    public static JSONObject convertXmlToJson(String xmlData) {
        return XML.toJSONObject(xmlData);
    }
}
//Adapter Pattern Implementation
class XmlToJsonAdapter {
 private XmlToJsonConverter xmlToJsonConverter;

 public XmlToJsonAdapter(XmlToJsonConverter xmlToJsonConverter) {
     this.xmlToJsonConverter = xmlToJsonConverter;
 }

 public JSONObject adapt(String xmlData) {
     return xmlToJsonConverter.convertXmlToJson(xmlData);
 }
}


public class Assignment_Q3_XML {

    public static void main(String[] args) {
        // Step 1: XML to JSON Conversion
        String xmlData = "<name>Soumyajit</name>";
        JSONObject jsonData = XmlToJsonConverter.convertXmlToJson(xmlData);

        // Step 2: Adapter Pattern
        XmlToJsonAdapter adapter = new XmlToJsonAdapter(new XmlToJsonConverter());
        JSONObject adaptedData = adapter.adapt(xmlData);

        // Step 3: Print JSON Data
        System.out.println(adaptedData.toString());

        // Step 4: Write JSON Data to Database using JDBC (assuming JDBC setup is done)
        writeToDatabase(adaptedData);
    }

    public static void writeToDatabase(JSONObject jsonData) {
        // JDBC code to write JSON data to database column
        try {
            // Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?useSSL=false&allowPublicKeyRetrieval=true", "root", "admin");

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a statement to insert JSON data into a table
            String insertQuery = "INSERT INTO your_table (json_column) VALUES ('" + jsonData.toString() + "')";
            statement.executeUpdate(insertQuery);

            // Close the connection
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
