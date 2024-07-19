package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(pow(2, 5));
        System.out.println(pow(4, 2));
        System.out.println(pow(2, 3));
        System.out.println(pow(3, 3));
        System.out.println(pow(3, 1));
    }
    public static int pow(int base, int power) {
        if (power==0){
            return 1;
        }
        int result = base;
        for (int i = 1; i < power; i++) {
            result *= base;
        }
        return result;
    }
}