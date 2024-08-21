package org._01_08_24;

public class Task {
    //Count Inversions in an array
//
//Счетчик инверсии для массива указывает, насколько далек (или близок) массив от сортировки. Если массив уже отсортирован, то счетчик инверсии равен 0, а если массив отсортирован в обратном порядке, то счетчик инверсии будет максимальным.
//
//        Пример:
//Ввод: arr[] = {8, 4, 2, 1}
//Вывод: 6
//Объяснение: Данный массив имеет шесть инверсий:
//        (8, 4), (4, 2), (8, 2), (8, 1), (4, 1), (2, 1).
//
//Ввод: arr[] = {3, 1, 2}
//Вывод: 2
//Объяснение: Данный массив имеет две инверсии:
//        (3, 1), (3, 2)
    public static void main(String[] args) {
        int arr[] = {8,4,2,1};
        System.out.println(getInvCount(arr));
    }
    private static int getInvCount(int[]arr){
        int length = arr.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (arr[i] > arr[j]){
                    System.out.println(arr[i] +", " + arr[j]);
                    count++;
                }
            }
        }
        return count;
    }
}
