package enterprise;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership extends Enterprise {
    public Dealership(String name, ArrayList<Vehicle> vehicles, double cash) {
        super(name, vehicles, cash);
    }
}
