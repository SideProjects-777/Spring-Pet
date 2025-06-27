package com.pet.project.exam.module01.q4application;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pet.project.exam.module01.q4application.beans.Car;

public class Runner {
    public static void main(String... args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)) {
            Car car = context.getBean(Car.class);

            car.drive();
        }
    }
}
