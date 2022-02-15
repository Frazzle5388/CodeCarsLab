package enterprise;

import org.junit.Before;
import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.HybridCar;
import vehicles.Vehicle;

public class DealershipTest {

    Dealership dealership;
    Car car;
    ElectricCar electricCar;
    HybridCar hybridCar;

    @Before
    public void setUp() {
        dealership = new Dealership();
        car = new Car("Toyota", "Good Car", "Petrol", "Navy Black", 15000.00);
        electricCar = new ElectricCar("Mercedes", "Bad Car", "Electric", "Black", 75000.00);
        hybridCar = new HybridCar("Lada", "Okay Car", "Petrol", "Navy", 1500.00);
    }

}
