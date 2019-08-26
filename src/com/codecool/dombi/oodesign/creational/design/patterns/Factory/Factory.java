package com.codecool.dombi.oodesign.creational.design.patterns.Factory;


public class Factory {
    private static Factory instance = null;


    public Product createProduct(String productID){
        if(productID.equals("1")){
            return null;
        }else {
            return new ConcreteProduct();
        }
    }

    private Factory(){ }
    public static Factory getInstance(){
        if(instance == null){
            instance = new Factory();
        }
        return instance;
    }




}
