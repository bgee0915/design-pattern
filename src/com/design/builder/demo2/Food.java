package com.design.builder.demo2;

import java.util.ArrayList;
import java.util.List;

// product
public class Food {
    List<String> foodList = new ArrayList<>();

    public void add(String food){
        foodList.add(food);
    }

    public void show(){
        for(String s : foodList){
            System.out.print(s + "  \n");
        }
    }

}
