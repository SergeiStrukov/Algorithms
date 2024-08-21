package org.lesson_7_homework;

import java.util.Arrays;

public class DynamicIntArray {
    private int[] array;
    private int count; //количество добавленных элементов в массиве
    private int size; //размер нашего массива

    private float increment; // коэф. приращения размера массива

    public DynamicIntArray() {
        size = 5;
        increment = 2;
        array = new int[size];
    }

    public DynamicIntArray(int size, float increment) {
        this.size = size;
        this.increment = increment;
        array = new int[size];
    }

    // добавляет в конец массива
    public void add(int data) {
        if (count == size) {
            growSize();
        }
        array[count] = data;
        count++;
    }

    // добавление элемента в массив по индексу
    public void addAt(int index, int data) {

        if (index > size)
            System.out.println("Индекс не должен быть больше размера массива");
        if (count == size) {
            growSize();
        }

        for (int i = count - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = data;
        count++;

    }

    // удаляем последний элемент массива
    public void remove() {
        if (count > 0) {
            array[count - 1] = 0;
            count--;
        }
    }

    // удаление по индексу
    public void removeAt(int index) {
        if (count > 0) {
            for (int i = index; i < count - 1; i++) {
                array[i] = array[i + 1]; // shift all element of right side from given index in left
            }
            array[count - 1] = 0;
            count--;
        }
    }


    //измененние элемента массива
    public void set(int index, int data) {
        if (index < size) {
            array[index] = data;
        }
    }


    // расширяем массив
    public void growSize() {
        int nSize = (int) (size * increment);

        int[] temp = new int[nSize];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
        size = nSize;

    }

    // удаляет все элементы
    public void deleteAllElements() {
        if (size > 0) {
            size = 0;
            count = 0;
            array = new int[]{};
        }
    }

    //    - contains(data) - проверяет существует ли элемент
//    public boolean contains(int data) {
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == data) {
//                return true;
//            }
//        }
//        return false;
//    }

    public boolean contains(int data) {
        return Arrays.stream(array)
                .anyMatch(el -> el == data);
    }

//    isEmpty() - вернет false, если в структуре есть элемент

    public boolean isEmpty() {
        return array.length == 0;
    }

//- создать метод добавления массива данных в конец нашего Динамического массива - addArray(int[] arrAdd)

    public void addArray(DynamicIntArray arrAdd) {


        int nSize = count + arrAdd.count;
        int[] temp = new int[nSize];

        // Копируем существующий массив в temp
        for (int i = 0; i < count; i++) {
            temp[i] = array[i];
        }

        // Копируем элементы из arrAdd в temp начиная с позиции count
        for (int i = 0; i < arrAdd.count; i++) {
            temp[count + i] = arrAdd.array[i];
        }

        array = temp;
        size = nSize;
        count = nSize;
    }

//    создать метод удаления элемента по его значению в нашем Динамическом массиве boolean removeValue(int value),
//    который возвращает true, если объект найден и удален, иначе false.

    public boolean removeValue(int value) {
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                if (array[i] == value) {
                    // Если найден, сдвигаем все элементы справа от него на одну позицию влево
                    for (int j = i; j < count - 1; j++) {
                        array[j] = array[j + 1];
                    }
                    // Последний элемент после сдвига устанавливаем в значение по умолчанию (например, 0)
                    array[count - 1] = 0;
                    count--;
                    // Возвращаем true, так как элемент найден и удален
                    return true;
                }
            }
        }
        return false;
    }

    //печатать массив
    public void printArray() {
        System.out.println(Arrays.toString(array));
    }

    public int getCount() {
        return count;
    }

    public int getSize() {
        return size;
    }
}