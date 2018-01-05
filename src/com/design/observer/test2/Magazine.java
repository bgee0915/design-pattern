package com.design.observer.test2;

import java.util.ArrayList;
import java.util.List;

public class Magazine implements Subject{
    private String mzName;
    private int cost;
    List<Observer> list = new ArrayList<>();

    public Magazine() {
    }

    public Magazine(String mzName, int cost) {
        this.mzName = mzName;
        this.cost = cost;
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
    public Subject add(Observer o) {
        list.add(o);
        return this;
    }

    @Override
    public Subject rm(Observer o) {
        list.remove(o);
        return this;
    }

    @Override
    public Subject notify_a() {
        for(Observer os : list){
            os.update(this.mzName,this.cost);
        }
        return this;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "mzName='" + mzName + '\'' +
                ", cost=" + cost +
                ", list=" + list +
                '}';
    }

    // 出版
    public void publish(String name, int cost){
        this.mzName = name;
        this.cost = cost;
        notify_a();
    }
}
