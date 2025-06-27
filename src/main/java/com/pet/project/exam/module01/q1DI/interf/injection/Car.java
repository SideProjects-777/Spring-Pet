package com.pet.project.exam.module01.q1DI.interf.injection;

public class Car implements EngineInjectable {
    private Engine engine;

    @Override
    public void injectEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        if (engine == null) {
            System.out.println("No engine injected.");
        } else {
            engine.start();
        }
    }
}

