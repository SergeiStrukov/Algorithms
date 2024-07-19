package org.example._06_06_2024;

public class Main {
    public static void main(String[] args) {
        String s = "a man, a plan, a canal, panama!";
        String s1 = "a man, a plan, ag canal, panama!";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s1));
    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (!Character.isAlphabetic(s.charAt(left))) {
                left++;
            }
            while (!Character.isAlphabetic(s.charAt(right))) {
                right--;
            }
            if (s.charAt(left) != s.charAt(right)) return false;
            right--;
            left++;
        }
        return true;
    }
}
