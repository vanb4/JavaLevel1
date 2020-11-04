package ru.GeekBrains.gb.Lesson_1.Homework1;

/*6. Написать метод, которому в качестве параметра передается целое число,
  метод должен вернуть true, если число отрицательное; */

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int a = scanner.nextInt();

        if (a < 0) {
            System.out.println(" true ");
        } else {
            System.out.println(" false ");
        }

    }
}
