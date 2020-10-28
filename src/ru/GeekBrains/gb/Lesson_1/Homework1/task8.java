package ru.GeekBrains.gb.Lesson_1.Homework1;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        System.out.println(" Определить является ли год високостным.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите желаемый год");
        int year = scanner.nextInt();
//        if ( year%400 == 0){
//            System.out.println( year + " год високостный. 1");
//        }else if (year%100 == 0){
//            System.out.println( year + " год  не високостный. 2");
//        }else if (year%4 == 0) {
//            System.out.println( year + " год  високостный. 3 ");
//        }else {
//            System.out.println(year + " год не  високостный. 4");
//        }
        String leapYear = (year%400 == 0 && year%100 != 0 && year%4 == 0)? " год  високостный": " год не високостный";
        System.out.println(year + leapYear);
    }





}
