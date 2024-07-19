package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tasks {
    public static void main(String[] args) {
//        List<Integer> list = List.of(0, 1, 5, 6, 8);
//        System.out.println(sortArray(list));

    }

    public static List<Integer> sortArray(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        int count = 0;
        for (Integer i : list) {
            if (i == 0) {
                count++;
            } else {
                newList.add(i);
            }
        }
        for (int i = 0; i < count; i++) {
            newList.add(0);
        }
        return newList;
    }
}
