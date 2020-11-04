package ru.GeekBrains.gb.Lesson_1.Homework1;

import java.util.Scanner;

public class task4 {


        public static void main(String[] args) {
            System.out.println("Проверить лежит ли сумма двух чисел в диапазоне от 10 до 20 включительно");

            Scanner scanner = new Scanner (System.in);

            System.out.println("Введите первое число");
            int a = scanner.nextInt() ;

            System.out.println("Введите второе число");
            int b = scanner.nextInt() ;

            int c = b + a;

            if ( 10 <= c && c <= 20) {
                System.out.println("Сумма чисел "+a+" и " +b+ " входит в диапазон от 10 до 20 включительно.");
            }else {
                System.out.println("Сумма чисел "+a+" и " +b+ " не входит в диапазон от 10 до 20.");
            }

        }
    }



