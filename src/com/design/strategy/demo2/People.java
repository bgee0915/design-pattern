package com.design.strategy.demo2;

public class People {
    private Eat eat;
    private Travel travel;

    public Eat getEat() {
        return eat;
    }

    public void setEat(Eat eat) {
        this.eat = eat;
    }

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    public void performEat(){
        this.getEat().eat();
    }

    public void performTravel(){
        this.getTravel().travel();
    }
}
