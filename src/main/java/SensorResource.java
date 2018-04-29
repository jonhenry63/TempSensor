/**
 * Created by Jon on 25/11/2017.
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


// The Java class will be hosted at the URI path "/output"

@Path("/")
public class SensorResource {
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("application/json")
    public String get()  {
        SerialTest sensor = new SerialTest();
        return toJson(sensor.getTemp1(), sensor.getTemp2(), sensor.getTemp3());
    }

    private String toJson(String temp1, String temp2, String temp3) {
        String json;
        json = "{" +
                "\"temp1\": ${" + temp1 + "}," +
                "\"temp2\": ${" + temp2 + "}," +
                "\"temp3\": ${" + temp3 + "}" +
                "}";
        return json;
    }
}