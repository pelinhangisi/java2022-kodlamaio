package com.pelinhangisi.logger;

public class EmailLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Maile loglandı : "+ data);
    }
}
