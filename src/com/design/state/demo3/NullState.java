package com.design.state.demo3;

public class NullState implements State {
//    @Override
//    public Dispenser dispenserState(Dispenser dispenser) {
//        return null;
//    }

    @Override
    public void press() {
        System.out.println("dispenser null");
    }
}
