package com.pet.project.exam.module01.q4application.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    private Battery battery;
    @Autowired
    private Engine engine;
    @Autowired
    private Wheels wheels;
    @Autowired
    private Gearbox gearbox;

    public void drive() {
        battery.supplyPower();
        engine.start();
        gearbox.putIntoDrivePosition();
        wheels.roll();
    }
}
