package enterprise;

import behaviours.ITrade;
import vehicles.Vehicle;

import java.util.ArrayList;

public abstract class Enterprise implements ITrade {
    private String name;
    private ArrayList<Vehicle> vehicles;
    private double cash;

    public Enterprise(String name, ArrayList<Vehicle> vehicles, double cash) {
        this.name = name;
        this.vehicles = vehicles;
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public double getCash() {
        return cash;
    }
}
