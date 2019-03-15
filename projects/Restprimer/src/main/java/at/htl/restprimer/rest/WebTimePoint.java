package at.htl.restprimer.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Path("time")
public class WebTimePoint {

    @GET
    public String getTime() {
        return LocalDateTime.now().toString();
    }
}
