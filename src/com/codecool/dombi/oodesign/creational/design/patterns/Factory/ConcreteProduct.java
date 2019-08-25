package com.codecool.dombi.oodesign.creational.design.patterns.Factory;

public class ConcreteProduct implements Product {

    @Override
    public void fly() {
        System.out.println("Yaayks! Me a flyING!");
    }

    @Override
    public int add(String numbers) {
        int finalNum = 0;
        String[]  num = numbers.split(",");
        for(String iter : num){
            finalNum += Integer.parseInt(iter);
        }
        return finalNum;
    }
}
