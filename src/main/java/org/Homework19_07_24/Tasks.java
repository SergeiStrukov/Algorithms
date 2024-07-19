package org.Homework19_07_24;

import java.util.Arrays;

public class Tasks {
    //    Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент,
//    который будет находиться на k-й позиции в конечном отсортированном массиве.
//            (При объединении массива пытайтесь соединить их так, чтобы результирущий общий массив
//    был бы уже осортирован и его не нужно было повторно сортировать. )
//    Массив 1 - 100 112 256 349 770
//    Массив 2 - 72 86 113 119 265 445 892
//    к = 7
//    Вывод : 256
//    Окончательный отсортированный массив -
//            72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
//            7-й элемент этого массива равен 256.
    public static void main(String[] args) {
        int[] array1 = {100, 112, 256, 349, 770};
        int[] array2 = {72, 86, 113, 119, 265, 445, 892};
        int m = 12; // Какой элемент необходимо найти с нового массива.
        int k = 44; // Какой элемент необходимо найти с нового массива.

        System.out.println("------");
        System.out.println(sortArray(array1, array2, m));
        System.out.println("------");
        System.out.println(sortArray(array1, array2, k));
    }

    public static int sortArray(int[] array1, int[] array2, int m) {
        int[] array = new int[array1.length + array2.length];
        if (m > array.length) {
            return -1;
        }
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                array[k++] = array1[i++];
            } else {
                array[k++] = array2[j++];
            }
        }
        while (i < array1.length) {
            array[k++] = array1[i++];
        }
        while (j < array2.length) {
            array[k++] = array2[j++];
        }
        return array[m - 1];
    }
}
