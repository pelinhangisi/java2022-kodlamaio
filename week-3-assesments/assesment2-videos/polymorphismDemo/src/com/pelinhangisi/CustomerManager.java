package com.pelinhangisi;

public class CustomerManager {

    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger) {
        this.baseLogger = baseLogger;
    }

    public void add(){
        System.out.println("Müşteri eklendi.");
        this.baseLogger.log("Log mesajı");
    }
}
