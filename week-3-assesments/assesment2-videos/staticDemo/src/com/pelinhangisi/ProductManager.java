package com.pelinhangisi;

public class ProductManager {

    public void add(Product product){

        if(ProductValidator.isValid(product)){
            System.out.println("Eklendi.");
        }else{
            System.out.println("Ürün bilgileri geçersizdir.");
        }
    }
}
