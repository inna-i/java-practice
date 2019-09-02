package com.globallogic.statics;

public class Employee {
    public static int numberOfEmployees = 0;
    private String firstName, lastName, telephone;

    public Employee(String firstName, String lastName, String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        numberOfEmployees++;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}
