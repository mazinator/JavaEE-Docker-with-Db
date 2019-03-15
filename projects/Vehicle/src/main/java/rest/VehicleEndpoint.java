package rest;

import business.VehicleFacade;
import entity.Vehicle;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Stateless
@Path("vehicle")
public class VehicleEndpoint {

    @Inject
    VehicleFacade vehicleFacade;

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Vehicle find(@PathParam("id") long id) {
        return vehicleFacade.findById(id);
    }

    @GET
    public List<Vehicle> findAll() {
        return vehicleFacade.findAll();
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") long id) {
        vehicleFacade.delete(id);
    }

    @POST
    public void save(Vehicle vehicle) {
        vehicleFacade.save(vehicle);
    }
}
