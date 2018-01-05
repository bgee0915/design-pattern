package com.design.observer.test2;

public class Li implements  Observer {
    private String name;
    private String mzName ;
    private int cost;

    public Li() {
    }

    public Li(String name) {
        this.name = name;
    }

    public Li(String name, String mzName, int cost) {
        this.name = name;
        this.mzName = mzName;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
                "name='" + name + '\'' +
                ", mzName='" + mzName + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public void update(String name, int cost) {
        this.mzName = name;
        this.cost = cost;
        buy();
    }

    public void buy(){
        System.out.println(this.name + "  订阅了 " + this.mzName + ",  花费了" + cost + "￥");
    }
}
