package com.design.state.demo3;

public class Test {
    public static void main(String[] args){
        State state = new FullState();
        Dispenser dispenser = new Dispenser(state);

        for(int i=0; i<100; i++){
            System.out.println(i);
            dispenser.press();
        }
    }
}
