package com.design.builder.demo2;

// Director  导演类
public class Boss {
    public void build(Builder buider){
        buider.cookRice();
        buider.washDishes();
        buider.cook();
    }
}
