/**
 * Created by Jon on 25/11/2017.
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

// The Java class will be hosted at the URI path "/output"
@Path("/output")
public class OutputPage {
    private SerialTest sensor;
    public OutputPage(){
        sensor = new SerialTest();
        sensor.initialize();
    }
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/html")
    public String getClichedMessage() {
        // Return some cliched textual content
        String html = "";
        html = html + "<html> \n <head> \n<title>Data Page</title> \n" +
                "<style>\n" +
                "table {\n" +
                "    font-family: arial, sans-serif;\n" +
                "    border-collapse: collapse;\n" +
                "    width: 100%;\n" +
                "}\n" +
                "\n" +
                "td, th {\n" +
                "    border: 1px solid #dddddd;\n" +
                "    text-align: left;\n" +
                "    padding: 8px;\n" +
                "}\n" +
                "\n" +
                "tr:nth-child(even) {\n" +
                "    background-color: #dddddd;\n" +
                "}\n" +
                "</style>" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<table>\n" +
                "  <tr>\n" +
                "    <th>Sensor</th>\n" +
                "    <th>Temperature</th>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td>1</td>\n" +
                "    <td>" + sensor.getTemp1() + "</td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td>2</td>\n" +
                "    <td>" + sensor.getTemp2() + "</td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td>3</td>\n" +
                "    <td>" + sensor.getTemp3() + "</td>\n" +
                "  </tr>\n" +
                "</table>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
        return html;
    }
}