package org.homework260624;

import java.util.Scanner;

public class Tasks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        counterFirst(n);
//        System.out.println(counterSecond(n));
//        System.out.println(counterThird(n));
        System.out.println(counterFourth(n));
    }

    // task #1
    // 1) Итоговая временная сложность для n>1: О(n)+1 = O(n).
    // 2)  Итоговая временная сложность для n=1: О(1).
    public static void counterFirst(int n) { //    task #1
        if (n == 1) {
            return;
        } // Программа завершится, если n равно 1
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.println("*");
                break;
            }
        }
    }

    //    task #2
//
//    START
//    READ number n
//    numbers i = 0, j = 0, a = 0
//    FOR i = n/2, i <= n; i + 1
//    FOR j = 2, j <= n, j * 2
//    a = a + n / 2
//    END

    // task #2
    // 1) Итоговая временная сложность для n>1: n/2*O(log n)= O(n*(log n)).
    // 2)  Итоговая временная сложность для n=0 или n=1: О(1).
    public static int counterSecond(int n) {

        int i = 0;
        int j = 0;
        int a = 0;

        for (i = n / 2; i < n; i++) { //O(n/2) = O(n)
//            System.out.println("*");
            //i=2 2<4 i=i+1   2 раза  1+1=2
            for (j = 2; j <= n; j *= 2) {  //j=2 j<=4 j =j*2  2+2=4, 4+2 = 6. O(log n)
                a = a + n / 2;
//                System.out.println("*");
            }
        }
        return a;
    }

    //    task #3
//
//    START
//    READ number n
//    number a = 0
//    FOR i = 0, i < n, i + 1
//    FOR j = n, j > i, j - 1
//    a = a + i + j
//            END

    // Итоговая временная сложность O(n/2)*O(n) = O(n^2);
    public static int counterThird(int n) {

        int a = 0;

        for (int i = 0; i < n; i++) {  // n=10 0<10 0++ : 10 раз O(n)
            for (int j = n; j > i; j--) {  // j = 10 ; 10>0; 10-- : 10 раз; 9 ; 8 ; 7 ... O(n\2)
                a = a + i + j;
            }
        }
        return a;
    }

    //    task #4
//
//    START
//    READ number n
//    numbers a = 0, i = n
//    WHILE i > 0
//    a = a + i
//            i = i / 2
//    END

    // Итоговая временная сложность O(log n);
    public static int counterFourth(int n) {  //n=10
        int a = 0;
        int i = n;  //i=10
        while (i > 0) {
            a = a + i; // 10, 15, 17, 18
            i = i / 2; // 5 , 2 ,1 0;
        }
        return a;
    }
}
