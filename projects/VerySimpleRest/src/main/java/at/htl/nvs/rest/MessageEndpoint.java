package at.htl.nvs.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/message")
public class MessageEndpoint {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getSimpleMessage(){
        return Response.ok("Hello!").build();
    }
}
