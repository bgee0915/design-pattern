package com.design.observer.test2;

public class Li implements  Observer {
    private String mzName ;
    private int cost;

    public String getMzName() {
        return mzName;
    }

    public void setMzName(String mzName) {
        this.mzName = mzName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Li{" +
                "mzName='" + mzName + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public void update() {

    }
}
