package com.design.state.demo3;

// context 持有状态的上下文
// 饮水机
public class Dispenser {
    private State state;
    public static int capacity = 100;

    public Dispenser(){}

    public Dispenser(State state){
      this.state = state;
      this.state.press();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void press(){
        capacity--;
        if(capacity <= 0){
            setState(new NullState());
            getState().press();
        }
    }
}
