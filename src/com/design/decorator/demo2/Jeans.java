package com.design.decorator.demo2;

public class Jeans implements Finery{
    Person person;
    Jeans(Person person){
        this.person = person;
    }

    @Override
    public void show() {
        person.show();
        System.out.print(" jeans ");
    }
}
