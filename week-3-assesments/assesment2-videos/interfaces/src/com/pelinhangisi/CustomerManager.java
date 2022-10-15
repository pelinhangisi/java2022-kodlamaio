package com.pelinhangisi;

public class CustomerManager {

    private ICustomerDal customerDal;
    public CustomerManager (ICustomerDal customerDal){
        this.customerDal = customerDal;
    }

    public void add(){
        //Business codes
        customerDal.Add();
    }
}
