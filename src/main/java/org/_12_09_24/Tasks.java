package org._12_09_24;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 2};
        int[] codes = {2, 3, 4, 5};
        int[] numbers2 = {1, 9, 1, 9};
        int[] codes2 = {0, 0, 0, 0};
        System.out.println(countOborots(numbers, codes));
        System.out.println(countOborots(numbers2, codes2));
        int[] lock = {2,3,4,5};
        int[] activateCode = {5,4,3,2};

        int counter = 0; // количество оборотов

        for (int i = 0; i < lock.length; i++) {
            int temp = lock[i] - activateCode[i];

            int up = temp < 0 ? temp + 10 : temp;
            int down = -temp < 0 ? -temp + 10 : -temp;
            counter += Math.min(up, down);
        }
        System.out.println(counter);
    }

    private static int countOborots(int[] number, int[] code) {
        int counter = 0;
        int difference = 0;
        int difference1 = 0;
        int difference2 = 0;
        for (int i = 0; i < number.length; i++) {
            difference1 = Math.abs(number[i] - code[i]);
            difference2 = 10 - Math.abs(number[i] - code[i]);
            if (difference1 < difference2) {
                counter += difference1;
            } else {
                counter += difference2;
            }
        }
        return counter;
    }
}

//Вам дан замок, состоящий из n различных круглых колец, на каждом из которых последовательно напечатаны цифры от 0 до 9.
//
//Изначально все n-колец вместе показывают n-значное целое число, но существует только определенный код, который может открыть замок.
//
//Вы можете вращать каждое кольцо любое количество раз в любом направлении.
//
//Вы должны найти минимальное количество оборотов на кольцах замка, чтобы открыть замок.
//Ввод: Ввод = 2345, Код разблокировки = 5432
//Выход: требуется оборотов = 8
//Объяснение: 1-е кольцо вращается трижды, как 2->3->4->5         (2->1->0->9->8->7->6->5)
//        2-е кольцо вращается один раз как 3->4
//        3-е кольцо поворачивается один раз как 4->3
//        4-е кольцо вращается трижды как 5->4->3->2
//
//Ввод: Ввод = 1919, Код разблокировки = 0000
//Выход: требуется оборотов = 4
//Объяснение: 1-е кольцо вращается один раз как 1-> 0
//        2-е кольцо поворачивается один раз как 9-> 0
//        3-е кольцо вращается один раз как 1-> 0
//        4-е кольцо поворачивается один раз как 9->0