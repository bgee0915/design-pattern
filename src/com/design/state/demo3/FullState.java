package com.design.state.demo3;

public class FullState implements  State {
//    @Override
//    public Dispenser dispenserState(Dispenser dispenser) {
//        return null;
//    }

    @Override
    public void press() {
        System.out.println("dispenser full");
    }
}
