package com.globallogic.nestedClasses;

public class Ship {
    void doJob() {
        System.out.println("Ship");
    }
    protected class Engine {
        String doJob() {
            return "Engine";
        }
        public void test() {
            Ship.this.doJob(); //prints Ship
        }
    }
}
