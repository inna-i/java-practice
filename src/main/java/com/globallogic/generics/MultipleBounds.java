package com.globallogic.generics;

class A {}
interface B {}
interface C {}

public class MultipleBounds <T extends A & B & C> { // super class should be first
    public T t;

    public T getT() {
        return t;
    }
}
