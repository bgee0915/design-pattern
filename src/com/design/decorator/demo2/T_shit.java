package com.design.decorator.demo2;

public class T_shit implements Finery {
    Person person;

    T_shit(Person person){
        this.person = person;
    }

    @Override
    public void show() {
        person.show();
        System.out.print(" t-shit ");
    }
}
