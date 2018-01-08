package com.design.memento.demo2;

public class Test {
    public static void main(String[] args){
        GameRole lixiaolong = new GameRole();
        lixiaolong.init();
        lixiaolong.stateDisplay();

        System.out.println("开始存档 ·······");
        RoleStateMemento memento = lixiaolong.saveState();
        System.out.println("战斗开始：打boss");
        lixiaolong.fight();
        lixiaolong.stateDisplay();

        System.out.println("获取存档 ·······");
        lixiaolong.recoveryState(memento);
        lixiaolong.recoveryState(memento);
        lixiaolong.stateDisplay();
    }
}
