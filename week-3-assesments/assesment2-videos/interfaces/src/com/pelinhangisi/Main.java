package com.pelinhangisi;

public class Main {

    public static void main(String[] args) {

//        ICustomerDal customerDal = new OracleCustomerDal();

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}
