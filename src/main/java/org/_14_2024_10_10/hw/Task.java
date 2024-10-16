package org._14_2024_10_10.hw;

import java.util.Arrays;
import java.util.HashMap;

public class Task {
    //    Проверьте, равны ли два массива или нет
//
//    Два массива называются равными, если:
//    оба они содержат один и тот же набор элементов,
//    расположение (или перестановки) элементов может/не может быть одинаковым.
//    Если есть повторения, то количество повторяющихся элементов также должно быть одинаковым, чтобы два массива были равны.
//
//    Ввод: arr1[] = {1, 2, 5, 4, 0}, arr2[] = {2, 4, 5, 0, 1}
//    Вывод: Да
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 4,1,5};
        int[] arr2 = {3, 1, 4, 7, 5,1,5};
        int[] arr3 = {3, 1, 4, 7, 5, 5};
        int[] arr4 = {1, 1, 4, 7, 5};

        System.out.println(checkEqualsArray(arr, arr2));
        System.out.println(checkEqualsArray(arr, arr3));
        System.out.println(checkEqualsArray(arr, arr4));
        System.out.println("----");
        System.out.println(checkEqualsArrayMap(arr, arr2));
        System.out.println(checkEqualsArrayMap(arr, arr3));
        System.out.println(checkEqualsArrayMap(arr, arr4));
    }

    public static boolean checkEqualsArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkEqualsArrayMap(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            int count = map.getOrDefault(arr1[i], 0) + 1;
            map.put(arr1[i], count);
        }
        for (int i = 0; i < arr2.length; i++) {
            int count = map2.getOrDefault(arr2[i], 0) + 1;
            map2.put(arr2[i], count);
        }
        if (map.size() != map2.size()) {
            return false;
        }
//        System.out.println(map2);
        return map.equals(map2);
    }
}
