package com.pelinhangisi;

public class BaseCreditManager implements ICreditManager{

    public  void calculate() {
    }

    @Override
    public void save() {
        System.out.println("Kaydedildi.");
    }
}
