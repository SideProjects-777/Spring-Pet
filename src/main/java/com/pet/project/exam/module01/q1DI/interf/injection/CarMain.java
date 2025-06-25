package com.pet.project.exam.module01.q1DI.interf.injection;

public class CarMain {
    public static void main(String[] args) {
        Engine engine = new GasEngine();
        Car car = new Car();
        car.injectEngine(engine);  // interface injection
        car.drive();               // Output: Gas engine started.
    }
}

