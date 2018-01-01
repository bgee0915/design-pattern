package com.design.facade.demo2;

// 厨师
public class Chef {
    private Chilli chilli;
    private Ege ege;
    private Meat meat;
    private Rice rice;
    private Spareribs spareribs;
    private Vegetable vegetable;

    public Chef(){
        chilli = new Chilli();
        ege = new Ege();
        meat = new Meat();
        rice = new Rice();
        spareribs = new Spareribs();
        vegetable = new Vegetable();
    }

    // 套餐1
    public void package1(){
        ege.ege();
        chilli.chilli();
        rice.rice();
    }

    // 套餐2
    public void package2(){
        chilli.chilli();
        meat.meat();
        rice.rice();
    }

    // 套餐3
    public void package3(){
        meat.meat();
        vegetable.vegetable();
        rice.rice();
    }

    // 套餐4
    public void package4(){
        ege.ege();
        spareribs.spareribs();
        rice.rice();
    }

}
