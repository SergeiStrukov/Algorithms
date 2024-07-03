package org._03_07_2024;

public class Tasks {
    public static void main(String[] args) {
        int n = 5;
        int a = 1;
//        int e = -1;
        String s = "dsaaasedete";
        System.out.println(countFactorialRec(n));
        System.out.println(countFactorialRec(a));
        System.out.println("-----");
        System.out.println(countFactorialIteration(n));
//        System.out.println(countFactorialIteration(e));
        System.out.println("-----");
        System.out.println(countConsonantIteration(s));
        System.out.println(countConsonantRecursion(s));
    }

    //        Рекусивный способ:
    public static int countFactorialRec(int n) {
        if (n == 0) {
            return 1;
        } else if (n <= 1) return n;
        else return n * countFactorialRec(n - 1);
    }

    //    итеративный способ:
    public static int countFactorialIteration(int n) {
        try {
            if (n < 0) {
                throw new IllegalArgumentException("n must non-negative");
            }
            int fact = 1;
            if (n == 0) {
                return 1;
            }
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        } catch (IllegalArgumentException e) {
            System.err.println("n must be non-negative");
            return -1;
        }
    }

    //    3.* Есть итеративная реализация метода подсчета количества согласных букв в слове:
    public static int countConsonantIteration(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isConsonant(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    private static boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        return ch >= 'a' && ch <= 'z' && "aeiou".indexOf(ch) == -1;
    }

    //    Реализовать метод countConsonantRecursion с использованием рекурсивного подхода.
    public static int countConsonantRecursion(String str) {
        //  Базовый случай если пустая строка:
        if (str.isEmpty()) {
            return 0;
        }
        char firstChar = str.charAt(0);
        int countRest = countConsonantRecursion(str.substring(1)); // Рекурсивный вызов для оставшейся части строки
        // Проверка:
        if (isConsonant(firstChar)) {
            return 1 + countRest;
        } else {
            return countRest;
        }
    }
}
