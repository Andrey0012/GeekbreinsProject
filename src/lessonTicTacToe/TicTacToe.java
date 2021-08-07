package lessonTicTacToe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static char [][] map;
    private static int SIZE = 3;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_0 = '0';
    private static final boolean SILLY_MODE = false;
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        InitMap();
        PrintMap();
        while (true) {
            humanTurn ();
            if (IsEndCame(DOT_X)) {
                break;
            }
            computerTurn ();
            if (IsEndCame(DOT_0)) {
                break;
            }
        }
        System.out.println("Игра закончилась");
    }
    // иницилизация игрового поля
    private static void InitMap () {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    //задание игрового поля
    private static void PrintMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map [i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    //ход человека
    private static void humanTurn () {
        int x,y;
        do {
            System.out.println("введите координаты ячейки через пробел");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x,y));
        map [y][x] = DOT_X;
    }
    //ход компьютера
    private static void computerTurn () {
        int x = -1;
        int y = -1;
        if (SILLY_MODE) {
        do {
          x = random.nextInt(SIZE);
          y = random.nextInt(SIZE);
        } while (!isCellValid(x,y)); }
        else {
            int priority = 0;
            int maxPriority = 4;
            int arrayMark = 0;
            int[][] priorArray = new int[9][3];
            for(int i = 0; i < SIZE; i++){
                for(int j = 0; j < SIZE; j++){
                    if (i > 0) {
                        if (map[i - 1][j] == DOT_0) priority++;
                    } else if (i < (SIZE - 1)) {
                        if (map[i + 1][j] == DOT_0) priority++;
                    } else if (j > 0) {
                        if (map[i + 1][j] == DOT_0) priority++;
                    } else if (j < (SIZE - 1)) {
                        if (map[i + 1][j] == DOT_0) priority++;
                    } else if ((i > 0) && (j > 0)) {
                        if (map[i + 1][j] == DOT_0) priority++;
                    } else if ((i < (SIZE - 1)) && (j < (SIZE - 1))) {
                        if (map[i + 1][j] == DOT_0) priority++;
                    } else if ((i > 0) && (j < (SIZE - 1))) {
                        if (map[i + 1][j] == DOT_0) priority++;
                    } else if ((j > 0) && (i < (SIZE - 1))) {
                        if (map[i + 1][j] == DOT_0) priority++;
                    }
                    priorArray[arrayMark][0] = i;
                    priorArray[arrayMark][1] = j;
                    priorArray[arrayMark][2] = priority;
                    arrayMark++;
                }
            }
            for(int i = 0; i < priorArray.length; i++){
                if((priorArray[i][2] == maxPriority) && (isCellValid(priorArray[i][0], priorArray[i][1]))){
                    x = priorArray[i][0];
                    y = priorArray[i][1];
                    for(int j = 0; j  < priorArray.length; j++) priorArray[j][2] = 0;
                    break;
                }
                else{
                    maxPriority--;
                    if(maxPriority == -1) break;
                    do{
                        x = random.nextInt(SIZE);
                        y = random.nextInt(SIZE);
                    }while (!isCellValid(x, y));
                }
            }
            for(int i =0; i < priorArray.length; i++){
                for(int j = 0; j < priorArray[0].length; j++){
                    System.out.print(priorArray[i][j] + " ");
                }
                System.out.print(" | ");
            }
        }
        System.out.println("Компьютер выбрал ячейку " + (y+1) +" " + (x+1));
        map [y][x] = DOT_0;
    }
    // проверка на валидность
    private static boolean isCellValid (int x, int y) {
        boolean result = true;
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            result = false;
        }
        if (map [y][x] != DOT_EMPTY) {
            result = false;
        }
        return result;
    }
    //создаем условия выйгрыша
    private static boolean IsEndCame (char playerSimbol) {
        boolean result = false;
        PrintMap();
        if (checkWin(playerSimbol)) {
            System.out.println("Победили " + playerSimbol);
            result = true;
        }
        if (isMapFull()) {
            System.out.println("Ничья");
            result = true;
        }
        return result;
    }
    // если все ячейки заняты
    private static boolean isMapFull (){
        boolean result = true;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY)
                    result = false;
            }
        }
        return result;
    }
    //условия выйгрыша
    private static boolean checkWin (char playerSimbol) {
        boolean result = false;
        if (
                        (map[0][0] == playerSimbol && map[0][1] == playerSimbol && map[0][2] == playerSimbol) ||
                        (map[1][0] == playerSimbol && map[1][1] == playerSimbol && map[1][2] == playerSimbol) ||
                        (map[2][0] == playerSimbol && map[2][1] == playerSimbol && map[2][2] == playerSimbol) ||
                        (map[0][0] == playerSimbol && map[1][0] == playerSimbol && map[2][0] == playerSimbol) ||
                        (map[0][1] == playerSimbol && map[1][1] == playerSimbol && map[2][1] == playerSimbol) ||
                        (map[0][2] == playerSimbol && map[1][2] == playerSimbol && map[2][2] == playerSimbol) ||
                        (map[0][0] == playerSimbol && map[1][1] == playerSimbol && map[2][2] == playerSimbol) ||
                        (map[0][2] == playerSimbol && map[1][1] == playerSimbol && map[2][0] == playerSimbol)) {
            result = true;
        }
        return result;
    }
}
