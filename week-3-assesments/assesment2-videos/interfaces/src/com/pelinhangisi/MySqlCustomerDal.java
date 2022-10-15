package com.pelinhangisi;

public class MySqlCustomerDal implements ICustomerDal, IRepository{
    @Override
    public void Add() {
        System.out.println("My Sql eklendi");
    }
}
