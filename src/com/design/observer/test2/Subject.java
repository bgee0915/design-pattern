package com.design.observer.test2;

public interface Subject {
    public Subject add(Observer o);
    public Subject rm(Observer o);
    public Subject notify_a();
}
