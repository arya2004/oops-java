package org.Tutorial.two;

public class MainClass {
    public static void main(String[] args) {

        Car myCar = new Car("Sedan");
        Driver john = new Driver("John");

        // instance methods
        myCar.start();
        john.driveCar(myCar);

        // static methods
        Car.honk();
        Driver.greet();

        // Using a method from another class
        TrafficPolice.checkSpeed(myCar);
    }
}
