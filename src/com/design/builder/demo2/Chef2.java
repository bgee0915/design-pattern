package com.design.builder.demo2;

public class Chef2 implements Builder {
    Food food = new Food();
    @Override
    public void cookRice() {
        food.add("煮一碗糯米饭");
    }

    @Override
    public void washDishes() {
        food.add("切好豆腐，卤好猪脚，做好辣椒酱");
    }

    @Override
    public void cook() {
        food.add("炒一碗麻婆豆腐，一碗香卤猪脚");
    }

    @Override
    public Food getFood() {
        return food;
    }
}
