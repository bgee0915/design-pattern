package com.design.adapter.test2;

public class Test {
    public static void main(String[] args){
        V v220 = new V220();
        System.out.println("当前输入电压是：" + v220.output());
        V vadapter = new VAdapter(v220.output());
        System.out.println("当前输出电压是：" + vadapter.output());
    }
}
