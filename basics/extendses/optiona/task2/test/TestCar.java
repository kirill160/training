package basics.extendses.optiona.task2.test;

import basics.extendses.optiona.task2.car.Car;
import basics.extendses.optiona.task2.engine.Engine;
import basics.extendses.optiona.task2.wheel.TypeWheel;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car(new Engine(8, "V8"), "Jeep");
        car.printBrand();
        car.refueling();
        car.choosingAReplacementWheel(TypeWheel.LEFT_FRONT);
        car.start();
        System.out.println(car);


    }
}
