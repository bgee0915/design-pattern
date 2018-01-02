package com.design.builder.demo2;

public class Chef1 implements Builder{
    Food food = new Food();

    @Override
    public void cookRice() {
        food.add("煮泰国香米饭");
    }

    @Override
    public void washDishes() {
        food.add("洗白菜，切肉，切辣椒");
    }

    @Override
    public void cook() {
        food.add("炒一碗小白菜  一碗肉炒辣椒");
    }

    public Food getFood(){
        return food;
    }
}
