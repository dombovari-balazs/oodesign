package com.codecool.dombi.oodesign.creational.design.patterns;

/**
 * When to use:
 *     Singleton pattern should be used when we must ensure that only
 *      one instance of a class is created
 *      and when the instance must be available through all the code.
 *     A special care should be taken in multi-threading environments when multiple threads must access
 *      the same resources through the same singleton object.
 */


/**
 * Common Usage:
 * There are many common situations when singleton pattern is used:
 * - Logger Classes
 * - Configuration Classes
 * - Accesing resources in shared mode
 * - Other design patterns implemented as Singletons: Factories and Abstract Factories,
 *   Builder, Prototype
 */

public class Singleton {
    private static Singleton instance = null;
    private Singleton(){
            instance = new Singleton();
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
