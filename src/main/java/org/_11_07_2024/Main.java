package org._11_07_2024;

public class Main {
    public static void main(String[] args) {
        System.out.println(fibonacciRecursion(7));
    }
    private static int binarySearch(int[] sortedArray, int valueToFind, int low, int high) {
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sortedArray[mid] < valueToFind) {
                low = mid + 1;
            } else if (sortedArray[mid] > valueToFind) {
                high = mid - 1;
            } else if (sortedArray[mid] == valueToFind) {
                index = mid;
                break;
            }
        }
        return index;
    }
    private static int fibonacciRecursion(int n) {
        if (n < 2) {
            return 1;
        }
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }
}
