package entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQuery(name = "Vehicle.findAll", query = "select v from Vehicle v")
@XmlRootElement
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String type;

    public Vehicle() { }

    public Vehicle(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", getBrand(), getType());
    }

    public Long getId() {
        return id;
    }
}
