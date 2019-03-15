package business;

import entity.Vehicle;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Startup
@Singleton
public class InitBean {

    @Inject
    private  VehicleFacade vehicleFacade;

    public InitBean() {

    }

    @PostConstruct
    private void init() {
        vehicleFacade.save(new Vehicle("Opel", "Käptn"));
    }
}
