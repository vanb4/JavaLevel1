package ru.GeekBrains.gb.Lesson_2.Homework2;

import java.util.Arrays;
import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {

//       toReplaceTheZeroOnTheUnit();
//        setAnEmptyIntegerArray();
//        ifLessThanSixMultiplyByTwo();
//        squareTwoDimensionalIntegerArray();


    }

//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//    С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static void  toReplaceTheZeroOnTheUnit(){
        Random rand = new Random();
        int[] theArrayToReplacingTheNumbers=new int[10];
        int[] theArrayAfterReplacingTheNumbers=new int[10];

        for (int i=0; i < theArrayToReplacingTheNumbers.length; i++)
            {
                theArrayToReplacingTheNumbers[i] = rand.nextInt(2);
            }
        for (int j=0; j < theArrayAfterReplacingTheNumbers.length; j++)
        {
            theArrayAfterReplacingTheNumbers[j] = (theArrayToReplacingTheNumbers[j] == 0) ? 1 : 0;

        }

        System.out.println (Arrays.toString(theArrayToReplacingTheNumbers));
        System.out.println (Arrays.toString(theArrayAfterReplacingTheNumbers));
    }


//    2. Задать пустой целочисленный массив размером 8.
//    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    private static void setAnEmptyIntegerArray()
    {
        int[] emptyIntegerArray = new int[8];
        for (int i = 0; i < emptyIntegerArray.length; i++)
        {
            emptyIntegerArray[i] = i * 3;
        }
        System.out.println ("setAnEmptyIntegerArray");
        System.out.println (Arrays.toString(emptyIntegerArray));
    }

//    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
//    пройти по нему циклом, и числа меньшие 6 умножить на 2;
    private static void ifLessThanSixMultiplyByTwo() {
        System.out.println ("ifLessThanSixMultiplyByTwo");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println (Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] *2;
            }
        }

        System.out.println (Arrays.toString(arr));
    }


//4. Создать квадратный двумерный целочисленный массив(количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    private static void squareTwoDimensionalIntegerArray()
    {
        System.out.println ("squareTwoDimensionalIntegerArray");
        int a = 5;
        int[][] arr = new int [a][a];
        for (int i = 0; i < arr.length; i++)

        {
            int lastIndex = arr.length - 1;

            arr[i][i] = arr[i][lastIndex - i] = 1;

            System.out.println(Arrays.toString(arr[i]));
        }
    }


//5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
//private static void  arrayMinAndMax(){
//    Random rand = new Random();
//    int lengthArray = 10;
//    int randomRange = 20;
//    int[] arrayRandom=new int[lengthArray ];
//    int[] theArrayAfterReplacingTheNumbers=new int[10];
//
//    for (int i=0; i < lengthArray ; i++)
//    {
//        arrayRandom[i] = rand.nextInt(randomRange);
//    }
//    for (int j=0; j < theArrayAfterReplacingTheNumbers.length; j++)
//    {
//
//
//    }
//
//    System.out.println (Arrays.toString(theArrayToReplacingTheNumbers));
//    System.out.println (Arrays.toString(theArrayAfterReplacingTheNumbers));
}

//6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
//        Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
//    7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
//    при этом метод должен сместить все элементымассива на n позиций.
//    Для усложнения задачи нельзя пользоваться вспомогательными массивами.

