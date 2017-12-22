package com.design.strategy.demo2;

public class Test {
    public static void main(String[] args){
        People people = new People();
        people.setEat(new EatMilk());
        people.setTravel(new Car());
        people.performEat();
        people.performTravel();

        System.out.println(" ----- ");

        people.setEat(new EatHamburger());
        people.setTravel(new Subway());
        people.performEat();
        people.performTravel();

        System.out.println("------------");
    }
}
