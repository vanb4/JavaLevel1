package ru.GeekBrains.gb.Lesson_1.Homework1;

import java.util.Scanner;

public class task3 {

        public static void main(String[] args) {

            System.out.println("Найти результат выражения  a * (b + (c / d)) по входным параметрам a,b,c,d.");

            Scanner scanner = new Scanner (System.in);

            System.out.println("Введите параметр a");
            double a = scanner.nextInt() ;

            System.out.println("Введите параметр b");
            double b = scanner.nextInt() ;

            System.out.println("Введите параметр c");
            double c = scanner.nextInt() ;

            System.out.println("Введите параметр d");
            double d = scanner.nextInt() ;

            double rezult = a * (b + (c/d));

            System.out.println("Результат выражения  a * (b + (c / d)) = " + rezult);



        }
    }

