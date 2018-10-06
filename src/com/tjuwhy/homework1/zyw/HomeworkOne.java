package com.tjuwhy.homework1.zyw;

import java.util.Arrays;

public class HomeworkOne {
    public char reverse(char ch) {
        String str = "abcdEfGH";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
                continue;
            }
            chars[i] = Character.toUpperCase(c);
        }
        String str1 = new String(chars);
        System.out.println(str1);
        return ch;

    }

    public boolean isTrangle(int a, int b, int c) {
        boolean naruto = false;
        if ((a + b) > c && (a + c) > b && (b + c) > a)
            naruto = true;
        else
            naruto = false;
        return naruto;
    }

    public void printPrimeNum() {

        for (int i = 2; i <= 100; i++) {
            int j = 2;
            while (i % j != 0) {
                j++;
            }
            if (j == i) {
                System.out.println(i);
            }
        }
    }

    public void sort(int[] a) {
        int max = 100;
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * (max + 1));
            nums[i] = num;
        }
        for (int b : nums) {
            System.out.println(b + ",");
        }
        System.out.println();
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i - 1; j++) {
                if (nums[j] > nums[i]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }


    public static int carryNum(int num1, int num2) {
        boolean Carry = false;
        int m = 0, n = 0, count = 0;
        while (num1 > 0 || num2 > 0) {
            m = num1 % 10;
            n = num2 % 10;
            num1 = num1 / 10;
            num2 = num2 / 10;
            if (Carry) m++;
            if ((m + n) >= 10) {
                count++;
                Carry = true;
                continue;
            }
            Carry = false;
        }
        return count;
    }

    public static int sum(int[] array, int n) {


        int result = 0;
        int[] intArray = new int[]{23, 78, 95, 127, 984};
        for (int i = 0; i < intArray.length; i++) {
            result = result + intArray[i];

        }
        System.out.println(result);
        return result;
    }

    public static long fib(int n) {

        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            int c = 0, a = 1, b = 1;
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }


}
