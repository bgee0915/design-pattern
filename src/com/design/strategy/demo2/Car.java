package com.design.strategy.demo2;

public class Car implements Travel {
    @Override
    public void travel() {
        System.out.println("driver car");
    }
}
