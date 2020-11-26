package ru.GeekBrains.gb.Lesson_6.hw6;
/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
В качестве параметра каждому методу передается величина,
означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
(Например, dog1.run(150); -> результат: run: true)
5. * Добавить животным разброс в ограничениях.
 То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.*/

import java.util.Arrays;
import java.util.Random;

public class homework6 {
    static  int rangeLengthReservoir = 10;
    static  int rangeLengthDistance = 100;
    static  float rangeHeightWall = 0.1f;

    public static void main(String[] args) {
        Random random = new Random();
        int lengthReservoir = 1 + random.nextInt(rangeLengthReservoir);
        int lengthDistance = 150 + random.nextInt(rangeLengthDistance);
        float heightWall = rangeHeightWall + random.nextFloat();
        System.out.println("lengthReservoir= "+ lengthReservoir);
        System.out.println("lengthDistance= "+ lengthDistance);
        System.out.println("heightWall= "+ heightWall);

        Cat cat = new Cat(200, 2);
        Dog dog = new Dog(500, 10, 0.5f);

        float maxRunLength;
        float maxSwimLength;
        float maxJumpHeight;




        if (cat.maxRunLength <= rangeHeightWall)
        {
            System.out.println("the cat ran the distance");
        }

        else
            {
            System.out.println("the cat couldn't run the distance");
            }


        if (dog.maxRunLength >= rangeHeightWall)
        {
            System.out.println("the dog ran the distance");
        }
        else
            {
            System.out.println("the dog couldn't run the distance");
            }

        if (cat.maxSwimLength >= rangeLengthReservoir)
        {
            System.out.println("cats can't swim");
        }

        else
            {
            System.out.println("cats can't swim");
            }

        if (dog.maxSwimLength >= rangeLengthReservoir)
        {
            System.out.println("the dog swam through reservoir");
        }

        else
        {
            System.out.println("the dog couldn't swam through reservoir");
        }

        if (cat.maxJumpHeight>=rangeHeightWall )
        {
            System.out.println("the cat jumped over the wall");
        }

        else
            {
            System.out.println("the couldn't cat jump over the wall");
            }

        if (dog.maxJumpHeight>=rangeHeightWall )
        {
            System.out.println("the dog jumped over the wall");
        }

        else
        {
            System.out.println("the couldn't dog jump over the wall");
        }

    }


}


