package ru.GeekBrains.gb.Lesson_4;

import java.util.Random;
import java.util.Scanner;

public class ticTacToe
{
    static char[][] map;
    static final int SIZE = 3;
    static final char DOT_EMPTY = '.';
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';

    public static void main(String[] args) {
        initMap();
        printMap();

    }


    static void initMap() {
        map = new char[SIZE][SIZE];

        for (int row = 0; row <SIZE; row++)
        {
            for (int columns = 0; columns < SIZE; columns++)
            {
                map[row][columns] = DOT_EMPTY;
            }
        }
    }


    static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int row = 0; row < SIZE; row++)
        {
            System.out.print((row + 1) + " ");
            for (int column = 0; column < SIZE; column++)
            {
                System.out.print(map[row][column] + " ");
            }
            System.out.println();
        }
    }

    static void humanTurn()
    {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do
            {
            System.out.println("Введите координаты в формате X Y");
            x= scanner.nextInt()-1;
            y= scanner.nextInt()-1;
            } while (!isCellValid(x,y));
             map[y][x] = DOT_X;
    }

    static void aiTurn()
    {
        Random random = new Random();
        int x;
        int y;
        do
        {
            System.out.println("Введите координаты в формате X Y");
            x= random.nextInt(SIZE);
            y= random.nextInt(SIZE);
        } while (!isCellValid(x,y));
        System.out.println("Компьютер походил в точку " +(x+1)+ ","+(y+1));
        map[y][x] = DOT_O;
    }

    static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }


}