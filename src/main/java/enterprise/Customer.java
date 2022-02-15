package enterprise;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer extends Enterprise{
    public Customer(String name, ArrayList<Vehicle> vehicles, double cash) {
        super(name, vehicles, cash);
    }
}
