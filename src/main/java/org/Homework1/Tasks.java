package org.Homework1;

public class Tasks {
    public static void main(String[] args) {
        System.out.println(sumOfThreeNumbers(0.5, 0.44, 0.57));
        System.out.println(isSquareOfNumber(2, 4));
        System.out.println(isSquareOfNumber(2, 5));
        sumOfCubes(10);
    }

    //    Найти сумму трёх чисел
    public static double sumOfThreeNumbers(double a, double b, double c) {
        return a + b + c;
    }

    // По двум заданным числам проверять является ли одно квадратом другого
    public static boolean isSquareOfNumber(double a, double b) {
        if (a == Math.pow(b, 2)) {
            return true;
        } else return b == Math.pow(a, 2);
    }

    // На промежутке от 1 до N, показать кубы чисел, заканчивающихся на четную цифру
    public static void sumOfCubes(int n) {
        System.out.println("Кубы чисел от 1 до N, заканчивающиеся на четную цифру:");
        for (int i = 1; i <= n; i++) {
            if (Math.pow(i, 3) % 2 == 0) {
                System.out.println(Math.pow(i, 3));
            }
        }
    }
}
