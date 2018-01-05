package com.design.observer.test2;

public class Test {

    public static void main(String[] args){
        String mzName = "青年文摘";
        int cost = 5;
        Observer o1 = new Li("li",mzName,cost);
        Magazine magzine = new Magazine();
        magzine.add(o1);
        magzine.publish(mzName,cost);
    }
}
