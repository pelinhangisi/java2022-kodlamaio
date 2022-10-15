package com.pelinhangisi;

public class Main {

    public static void main(String[] args) {

//        BaseLogger[] loggers = new BaseLogger[] {new DatabaseLogger(), new FileLogger(), new EmailLogger(), new ConsoleLogger()};
//
//        for(BaseLogger logger : loggers){
//            logger.Log("Log mesajı");
//        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
