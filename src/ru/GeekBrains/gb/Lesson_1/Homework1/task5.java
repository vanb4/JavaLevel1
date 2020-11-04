package ru.GeekBrains.gb.Lesson_1.Homework1;

import java.util.Scanner;

public class task5 {

        public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите число");
            int a = scanner.nextInt();

            if (a >= 0) {
                System.out.println(" Число " + a +" положительное.");
            } else {
                System.out.println("Число " + a +" отрицательное.");
            }

        }

    }


