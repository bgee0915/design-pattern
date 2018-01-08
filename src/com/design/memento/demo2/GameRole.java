package com.design.memento.demo2;

public class GameRole {
    private int vit;
    private int atk;
    private int def;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void stateDisplay(){
        System.out.println("角色的当前状态: ");
        System.out.println("生命值：" + getVit());
        System.out.println("攻击力: " + getAtk());
        System.out.println("防御力: " + getDef());
    }

    // 初始状态
    public void init(){
        setAtk(100);
        setVit(100);
        setDef(100);
    }

    // 战斗
    public void fight(){
        setAtk(0);
        setVit(0);
        setDef(0);
    }

    public RoleStateMemento saveState(){
        return new RoleStateMemento(vit,atk,def);
    }

    public void recoveryState(RoleStateMemento memento){
        setVit(memento.getVit());
        setAtk(memento.getAtk());
        setDef(memento.getDef());
    }
}
