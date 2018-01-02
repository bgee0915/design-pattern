package com.design.builder.demo2;

public class Test {
    public static void main(String[] args){
        Boss boss = new Boss();
        Builder builder1 = new Chef1();      // 指定具体的建造者
        boss.build(builder1);                // 由指挥者决定建造的需求 并由具体的建造者建造
        Food food = builder1.getFood();     // 由建造者返回产品
        food.show();


    }
}
