package com.design.adapter.test2;

public class VAdapter implements V{

    private int v;

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public VAdapter(int v){
        this.v = v;
    }



    @Override
    public int output() {
        if(getV() >= 5){
            return new V5().output();
        }
        return getV();
    }
}
