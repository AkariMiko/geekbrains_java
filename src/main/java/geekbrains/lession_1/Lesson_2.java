package geekbrains.lession_1;

import java.awt.*;
import java.util.Arrays;

public class Lesson_2 {
    public static void main(String[] args) {
        HomeWork_1();
        HomeWork_2();
        HomeWork_3();
        HomeWork_4();
        HomeWork_5();
    }

    static void HomeWork_1() { //1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например:[ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] mass = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < mass.length; i++) {
            System.out.print(i + "-" + mass[i] + "  ");
        }
        System.out.println("");
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 1) {
                mass[i] = 0;
            } else mass[i] = 1;
                System.out.print(i + "-" + mass[i] + "  ");
        }
    }

    static void HomeWork_2() { //Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100
        int[] space = new int[100];
            System.out.println("");
        for (int i = 0; i < space.length; i++) {
            System.out.print(i + " ");
        }
    }

    static void HomeWork_3() { //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] massive = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println("");
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] < 6) {
                massive[i] = massive[i] * 2;
            }
            System.out.print(massive[i] + " ");
        }
    }

    static void HomeWork_4() { //Создать квадратный двумерный целочисленный массив. Определить элементы одной из диагоналей можно по следующему принципу
        int[][] matr = new int[3][3];
            System.out.println("");
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                if (i == j || matr.length - i - 1 == j) {
                    matr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < matr.length; i++) {
            System.out.println(Arrays.toString(matr[i]));
        }
    }

    static void HomeWork_5(){ //Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
        int[] values = {1, -22, 124124, 111, 0, -666};
        System.out.println("Min: " + min(values));
        System.out.println("Max: " + max(values));
    }
    static int min(int[] values){
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (min  >values[i]){
                min = values[i];
            }
        }
        return min;
    }

    static int max(int[] values) {
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (max < values[i]) {
                max = values[i];
            }
        }
        return max;
    }

}