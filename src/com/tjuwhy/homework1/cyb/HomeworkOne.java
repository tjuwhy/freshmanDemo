package com.tjuwhy.homework1.cyb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeworkOne {
    //   1. 传入一个字符，判断它是否为小写字母，如果是，将其转换为大写字母，否则，转换为小写字母。
    public static char reverse(char ch) {
        if (Character.isUpperCase(ch)) {
            ch = Character.toLowerCase(ch);
        } else {
            ch = Character.toUpperCase(ch);
        }
        return ch;
    }

    //   2. 传入三个正整数，判断能否构成一个三角形。
    public static boolean isTrangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    //   3. 输出0~100之间的所有素数。
    public static void printPrimeNum() {
        ArrayList shuzu = new ArrayList();
        for (int i = 0; i <= 100; i++) {
            if (i > 2) {
                for (int a = 2; a < i; a++) {
                    if (i % a == 0) {
                        break;
                    }
                    if (a == i - 1) {
                        shuzu.add(i);
                    }
                }
            }
        }
        for (int q = 0; q < shuzu.size(); q++) {
            System.out.println(shuzu.get(q));
        }
    }

    //   4. 传入一个随机的int数组，将其由大到小排序。
    public static void sort(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] < a[j + 1]) {
                    int trans = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = trans;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    //  5.  传入两个正整形数，返回相加时的进位次数。
    public static int[] zhuanhuan(int q) {
        String qw;
        qw = Integer.toString(q);
        int[] qq = new int[qw.length()];
        for (int i = 0; i < qw.length(); i++) {
            qq[i] = qw.charAt(i);
        }
        return qq;
    }

    public static int carryNum(int num1, int num2) {
        int fanhuizhi = 0;
        int max;
        if (num1 >= num2) {
            max = num1;
        } else {
            max = num2;
        }
        int num = num1 + num2;
        int[] Num = zhuanhuan(num);
        int[] Max = zhuanhuan(max);
        if (Num.length == Max.length) {
            for (int i = 0; i < Num.length; i++) {
                if (Num[i] < Max[i]) {
                    fanhuizhi = fanhuizhi + 1;
                }
            }
        } else {
            List NUm = new ArrayList();
            for (int i = 0; i < Num.length; i++) {
                NUm.add(Num[i]);
            }
            NUm.remove(0);
            int[] NUM = new int[NUm.size()];
            for (int i = 0; i < NUm.size(); i++) {
                NUM[i] = (int) NUm.get(i);
            }
            for (int i = 0; i < NUM.length; i++) {
                if (NUM[i] < Max[i]) {
                    fanhuizhi = fanhuizhi + 1;
                }
            }
        }
        System.out.println(fanhuizhi);
        return fanhuizhi;
    }

    //  6.  用循环或者递归的方式计算数组所有元素的和。
    public static void sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }

    //  7.  用非递归方式返回第n项斐波那契数列的值。
    public static long fib(int n) {
        int[] shuzu = new int[n];
        shuzu[0] = 1;
        shuzu[1] = 1;
        shuzu[2] = 2;
        for (int i = 3; i < n; i++) {
            shuzu[i] = shuzu[i - 1] + shuzu[i - 2];
        }
        System.out.println(shuzu[n - 1]);
        return n;
    }


    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        char ch = in.next().charAt(0);
//        System.out.println(reverse(ch));
//        System.out.println(isTrangle(2, 3, 2));
//        HomeworkOne.printPrimeNum();
//        int[] k = {1, 9, 6, 5, 8};
//        HomeworkOne.sort(k);
//        HomeworkOne.sum(k);
//        HomeworkOne.fib(6);
//        HomeworkOne.carryNum(132, 988);
    }
}
