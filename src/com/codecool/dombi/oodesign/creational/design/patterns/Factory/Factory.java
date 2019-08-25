package com.codecool.dombi.oodesign.creational.design.patterns.Factory;

public class Factory {

    public Product createProduct(){
        return new ConcreteProduct();
    }


}
