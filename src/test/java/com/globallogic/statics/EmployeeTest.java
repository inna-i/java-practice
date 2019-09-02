package com.globallogic.statics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class EmployeeTest {

    @Test
    void numberOfEmployeesEqualTwo() {
        new Employee("Tony", "Stark", "+390885766565");
        new Employee("Bruce", "Banner", "+9045886868");
        new Employee("Bruce", "Wayne", "+675845886868");
        int actual = Employee.getNumberOfEmployees();
        int expected = 3;
        assertEquals(expected, actual);;
    }
}
