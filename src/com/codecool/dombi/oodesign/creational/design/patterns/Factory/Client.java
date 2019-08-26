package com.codecool.dombi.oodesign.creational.design.patterns.Factory;

import java.lang.reflect.InvocationTargetException;

public class Client {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        System.out.println("I'm the Client, you can ask for Classes here!");
        Product product = Factory.getInstance().createProduct("3");
        product.fly();
    }
}
