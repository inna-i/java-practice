package com.globallogic.nestedClasses;

public class Ship {
    void doJob() {
        System.out.println("Ship");
    }
    protected class Engine {
        void doJob() {
            System.out.println("Engine");
        }
        public void test() {
            Ship.this.doJob(); //prints Ship
        }
    }
}
