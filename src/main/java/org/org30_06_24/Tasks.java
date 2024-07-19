package org.org30_06_24;

public class Tasks {
    public static void main(String[] args) {
        System.out.println(funRecursion(5, 9));
        System.out.println("--------------");
        System.out.println(funInt(5, 9));
    }

    public static int funRecursion(int x, int y) {
        if (x == 0) {
            return y;
        } else {
            int res = funRecursion(x - 1, x + y); // 2, 6 // 1 + 8 // рез = 9
            System.out.println("res = " + res + "; x = " + x + "; y = " + y);
            return res;
        }
    }

    public static int funInt(int x, int y) {
        int res = 0;
        for (int i = x; i > 0; i--) {
            y = x + y;
            x--;
            System.out.print(" x= " + x);
            System.out.print(" y= " + y);
            System.out.println();
        }
        System.out.println();
        res = x + y;
        System.out.print("res = ");
        return res;
    }
}
