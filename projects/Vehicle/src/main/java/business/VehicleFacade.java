package business;

import entity.Vehicle;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class VehicleFacade {

    @PersistenceContext
    private EntityManager em;

    public Vehicle findById(long id) {
        return em.find(Vehicle.class, id);
    }

    public List<Vehicle> findAll() {
        return em.createNamedQuery("Vehicle.findAll").getResultList();
    }

    public void delete(long id) {
        System.out.println("deleted = " + id);
        Vehicle reference = em.getReference(Vehicle.class, id);
        em.remove(reference);
    }

    @POST
    public void save(Vehicle vehicle) {
        System.out.println("Saving " + vehicle);
        this.em.merge(vehicle);
    }
}
