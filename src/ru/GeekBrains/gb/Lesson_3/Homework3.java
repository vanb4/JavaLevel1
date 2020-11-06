package ru.GeekBrains.gb.Lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {
//1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
//    При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
//    После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
public static void main(String[] args)
{
    while (true)
    {
        guessTheNumber();

        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        Scanner enteredSymbol = new Scanner(System.in);
        int userNumb = enteredSymbol.nextInt();
        int result =userNumb;
        if (result == 0)
        {
            break;
        }
    }
}


    static void guessTheNumber()
    {
        Random randomNumb= new Random();
        int compNumb = randomNumb.nextInt(10);
        int attempts = 3;
        System.out.println("Угадайте число от 0 до 9");
        System.out.println("Введите число");
        boolean isWin= false;
        for (int i = 0; i < attempts; i++)
        {
            Scanner enteredSymbol = new Scanner(System.in);
            int userNumb = enteredSymbol.nextInt();
            System.out.printf("Попытка номер %d.%n", i + 1);
            if (userNumb == compNumb)
            {
                System.out.println("Все верно!");
                isWin = true;
            }
            else if (userNumb < compNumb)
            {
                System.out.println("Загаданное число больше " + userNumb);
            }
            else
                {
                System.out.println("Загаданное число меньше " + userNumb);
            }

        }
        String messageResult = isWin ? "Вы выиграли!" : "Вы проиграли";
        System.out.println(messageResult);
    }
}