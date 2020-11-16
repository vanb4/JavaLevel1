package ru.GeekBrains.gb.Lesson_5;

import java.util.Random;

public class homework5 {

        private static final int EMPLOYEE_COUNT = 5;
        private static final int MIN_AGE = 40;
        private static Random ageRandomize = new Random();

        public static void main(String[] args) {
            Employee[] employees = new Employee[EMPLOYEE_COUNT];
            for (int i = 0; i < EMPLOYEE_COUNT; i++) {
                Employee employee = createEmployee(i);
                employees[i] = employee;
            }

            for (Employee employee : employees) {
                if (employee.getAge() > MIN_AGE) {
                    employee.printInfo();
                }
            }
        }

        private static Employee createEmployee(int i) {
            return new Employee(
                    "name" + i,
                    "surname" + i,
                    ageRandomize.nextInt(30) + 30,
                    "test" + i + "@test.com",
                    "+7920555778" + i,
                    "Software Engineer",
                    2000 + i * 100);
        }
    }

