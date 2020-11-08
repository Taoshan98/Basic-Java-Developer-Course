package com.StaticFinalClass;

public class StaticClass {

    private static int counter = 0;

    public StaticClass(){
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
