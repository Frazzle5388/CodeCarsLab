package vehicles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before

    public void setUp() {
        car = new Car("Toyota", "Good Car", "Petrol", "Navy Black", 15000.00);
    }

    @Test
    public void getMake() {
        assertEquals("Toyota", car.getMake());
    }

    @Test
    public void getModel() {
        assertEquals("Good Car", car.getModel());
    }

    @Test
    public void getEngine() {
        assertEquals("Petrol", car.getEngine());
    }

    @Test
    public void getColour() {
        assertEquals("Navy Black", car.getColour());
    }

   
}
