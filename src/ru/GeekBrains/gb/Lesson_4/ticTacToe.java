package ru.GeekBrains.gb.Lesson_4;

import java.util.Random;
import java.util.Scanner;

public class ticTacToe
{
    static char[][] map;
    static final int SIZE = 5;
    static final int DOTS_TO_WIN= 3;
    static final char DOT_EMPTY = '.';
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';

    public static void main(String[] args) {
                initMap();
                printMap();
                 while(true){
                    humanTurn();
                    printMap();

                    if (isWinner(DOT_X)) {
                        System.out.println("Победил человек");

                        break;
                    }

                    if (isMapFull()) {
                        System.out.println("Ничья");

                        break;
                    }

                    aiTurn();
                    printMap();

                    if (isWinner(DOT_O)) {
                        System.out.println("Победил ИИ");

                        break;
                    }

                    if (isMapFull()) {
                        System.out.println("Ничья");

                        break;
                    }
                }
    }


    static void initMap() {
        map = new char[SIZE][SIZE];

        for (int row = 0; row < SIZE; row++) {
            for (int columns = 0; columns < SIZE; columns++) {
                map[row][columns] = DOT_EMPTY;
            }
        }
    }


    static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int row = 0; row < SIZE; row++) {
            System.out.print((row + 1) + " ");
            for (int column = 0; column < SIZE; column++) {
                System.out.print(map[row][column] + " ");
            }
            System.out.println();
        }
    }

    static void humanTurn() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    static void aiTurn() {
        Random random = new Random();
        int x;
        int y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + "," + (y + 1));
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


    static boolean checkWin(char symb) {
        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) {
            return true;
        }
        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) {
            return true;
        }
        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) {
            return true;
        }
        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) {
            return true;
        }
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) {
            return true;
        }
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) {
            return true;
        }
        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) {
            return true;
        }
        if (map[0][2] == symb && map[1][1] == symb && map[2][0] == symb) {
            return true;
        }
        return false;
    }

    static boolean isMapFull() {
        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column++) {
                if (map[row][column] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isWinner(char symb) {
        int endOfOffset = map.length - DOTS_TO_WIN;
        for (int rowOffset = 0; rowOffset <= endOfOffset; rowOffset++)
        {
            if (isDiagonalsFilledWith(symb, rowOffset))
            {
                return true;
            }

            for (int columnoffset = 0; columnoffset <= endOfOffset; columnoffset++)
            {
                boolean hasWin = isLinesFilledWith(symb, rowOffset, columnoffset);
                if (hasWin)
                {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isLinesFilledWith(char symb, int rowOffset, int columnOffset) {
        for (int row = rowOffset; row < (DOTS_TO_WIN + rowOffset); row++) {
            int horizontalWinCounter = 0;
            int verticalWinCounter = 0;

            for (int column = columnOffset; column < (DOTS_TO_WIN + columnOffset); column++) {
                if (map[row][column] == symb) {
                    horizontalWinCounter++;
                } else {
                    horizontalWinCounter = 0;
                }
                if (map[column][row] == symb) {
                    verticalWinCounter++;
                } else {
                    verticalWinCounter = 0;
                }
                if ((horizontalWinCounter == DOTS_TO_WIN) || (verticalWinCounter == DOTS_TO_WIN)) {
                    return true;
                }
            }
        }
        return false;
    }

        static boolean isDiagonalsFilledWith( char symb, int rowOffset)
        {
            int mainDiagonalCounter = 0;
            int sideDiaqonalCounter = 0;
            final int subSquareLength = (DOTS_TO_WIN + rowOffset);
            for (int row = rowOffset; row < subSquareLength; row++) {
                if (map[row][row] == symb) {
                    mainDiagonalCounter++;
                } else {
                    sideDiaqonalCounter = 0;
                }
                if (map[row][map.length - 1 - row] == symb) {
                    sideDiaqonalCounter++;
                } else {
                    sideDiaqonalCounter = 0;
                }
            }
            return (mainDiagonalCounter == DOTS_TO_WIN) || (sideDiaqonalCounter == DOTS_TO_WIN);
        }
    }

