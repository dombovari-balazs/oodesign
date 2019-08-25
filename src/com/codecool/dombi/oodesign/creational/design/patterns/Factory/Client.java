package com.codecool.dombi.oodesign.creational.design.patterns.Factory;

public class Client {
    public static void main(String[] args) {
        System.out.println("I'm the Client, you can ask for Classes here!");
        Factory factory = new Factory();
        Product product = factory.createProduct();
        product.fly();
    }
}
