package vehicles;

public abstract class Vehicle {

    private String make;
    private String model;
    private String engine;
    private String colour;
    private double price;

    public Vehicle(String make, String model, String engine, String colour, double price) {
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.colour = colour;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }
}
