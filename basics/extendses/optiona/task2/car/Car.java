package basics.extendses.optiona.task2.car;

import basics.extendses.optiona.task2.action.Action;
import basics.extendses.optiona.task2.engine.Engine;
import basics.extendses.optiona.task2.wheel.TypeWheel;
import basics.extendses.optiona.task2.wheel.Wheel;

import java.util.Arrays;
import java.util.Objects;



public class Car implements Action {
    private Engine engine;
    private Wheel[] wheels;
    private String brand;
    private static final int QUANTITY_WHEEL = 4;

    public Car(Engine engine,  String brand) {
        this.engine = engine;
        this.wheels = new Wheel[QUANTITY_WHEEL];
        this.brand = brand;
        makeTypeWheels();

    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    private void makeTypeWheels(){
        wheels[0] = new Wheel(TypeWheel.LEFT_FRONT);
        wheels[1] = new Wheel(TypeWheel.LEFT_REAR);
        wheels[2] = new Wheel(TypeWheel.RIGHT_FRONT);
        wheels[3] = new Wheel(TypeWheel.RIGHT_REAR);

    }

    public void choosingAReplacementWheel(TypeWheel typeWheel){
        switch (typeWheel){
            case LEFT_REAR -> System.out.println("Левое заднее колесо под заменено");
            case LEFT_FRONT -> System.out.println("Левое переднее колесо заменено");
            case RIGHT_REAR -> System.out.println("Правое заднее колесо заменено");
            case RIGHT_FRONT -> System.out.println("Правое переднее колесо заменено");
            default -> {
                System.out.println("Не выбрали верное колесо машина не может ехать");
                stop();
            }
        }

    }
    public void printBrand(){
        System.out.println("Брэнд " + this.brand);
    }

    @Override
    public void stop() {
        System.out.println(this.brand + " остановилась");
    }

    @Override
    public void start() {
        System.out.println(this.brand + " поехала");
    }

    @Override
    public void refueling() {
        System.out.println(this.brand + " заправилась");

    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Car)) return false;
        Car car = (Car) object;
        return Objects.equals(getEngine(), car.getEngine()) && Objects.deepEquals(getWheels(), car.getWheels()) && Objects.equals(getBrand(), car.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEngine(), Arrays.hashCode(getWheels()), getBrand());
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", wheels=" + Arrays.toString(wheels) +
                ", brand='" + brand + '\'' +
                '}';
    }
}
