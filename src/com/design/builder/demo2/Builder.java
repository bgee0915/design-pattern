package com.design.builder.demo2;

// 建造者接口
public interface Builder {
    public void cookRice();
    public void washDishes();
    public void cook();
    public Food getFood();
}
