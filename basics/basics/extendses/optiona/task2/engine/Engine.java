package basics.extendses.optiona.task2.engine;

import java.util.Objects;

public class Engine {
    private int numberOfCylinders;
    private String brand;

    public Engine(int numberOfCylinders, String brand) {
        this.numberOfCylinders = numberOfCylinders;
        this.brand = brand;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Engine)) return false;
        Engine engine = (Engine) object;
        return getNumberOfCylinders() == engine.getNumberOfCylinders() && Objects.equals(getBrand(), engine.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumberOfCylinders(), getBrand());
    }

    @Override
    public String toString() {
        return "Engine{" +
                "numberOfCylinders=" + numberOfCylinders +
                ", brand='" + brand + '\'' +
                '}';
    }
}
