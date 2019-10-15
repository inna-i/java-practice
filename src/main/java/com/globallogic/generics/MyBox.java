package com.globallogic.generics;

public class MyBox < T > {
//public class MyBox < T extends Number > { only instance of Number
    // T stands for "Type"
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
