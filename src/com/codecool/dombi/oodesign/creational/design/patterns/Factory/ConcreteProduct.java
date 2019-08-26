package com.codecool.dombi.oodesign.creational.design.patterns.Factory;

public class ConcreteProduct implements Product {

    @Override
    public void fly() {
        System.out.println("Yaayks! Me a flyING!");
    }

    public ConcreteProduct(){}

}
