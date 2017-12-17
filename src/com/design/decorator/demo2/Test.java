package com.design.decorator.demo2;

public class Test {
    public static void main(String[] args){
        Person l = new L();

        Finery finery = new T_shit(new Jeans(l));
        finery.show();
    }
}
