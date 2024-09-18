package org._homework_18_09_24;

import java.util.Random;

public class Task {
//     1 уровень сложности: 1. Задача: вызов лифта
//    В доме два лифта.
//    Реализовать алгоритм отправки наиближайшего на вызывающий этаж.
//    Алгоритм будет применяться в домах разной этажности.
//    Пример:
//    в доме 19 этажей
//    работают лифт А и лифт В
//    лифт А находиться на 0 этаже
//    лифт В находиться на 8 этаже
//    на вход: 1
//    отправляем лифт А

    public static void main(String[] args) {

        Random random = new Random();
        int maxFloor = 25;
        int elevatorNumber1 = random.nextInt(maxFloor + 1);
        int elevatorNumber2 = random.nextInt(maxFloor + 1);

        System.out.println(getNumberOfElevator(18, elevatorNumber1,elevatorNumber2));
        System.out.println("-----");
    }

    public static int getNumberOfElevator(int floorNumber,int elevatorNumber1, int elevatorNumber2) {

        if (floorNumber < 0) {
            throw new RuntimeException("Такого этажа нет");
        }
        int distance1 = Math.abs(elevatorNumber1 - floorNumber);
        int distance2 = Math.abs(elevatorNumber2 - floorNumber);
        if (distance1 < distance2) {
            System.out.println("приедет лифт №1 c этажа:");
            return elevatorNumber1;
        } else {
            System.out.println("приедет лифт №2 c этажа:");
            return elevatorNumber2;
        }
    }
}
