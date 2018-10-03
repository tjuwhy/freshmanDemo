package com.tjuwhy.homework1.lgz;

import java.util.Scanner;

//因为做了交互所以可能main部分有点长...
public class HomeworkOne {
    public static void main(String[] args) {
        HomeworkOne example = new HomeworkOne();
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字母(将进行转换）：");
        String s = scan.next();
        char ch;
        while (s.length() > 1 || s.charAt(0) < 65 || s.charAt(0) > 122 || (90 < s.charAt(0) && s.charAt(0) < 97)) {
            System.out.println("请重新输入该字母！");
            s = scan.next();
        }                 //判断输入是否符合要求
        ch = s.charAt(0);
        System.out.println("该字母转换后为：" + example.reverse(ch));        //以上为作业第一题
        System.out.println();

        System.out.println("请输入三角形的三边（将进行判断）：");
        int[] a = new int[3];
        for (int j = 0; j < 3; j++) {
            a[j] = scan.nextInt();
        }
        if (example.isTrangle(a[0], a[1], a[2]) == false)
            System.out.println("不能构成三角形！");
        else
            System.out.println("可以构成三角形。");                            //以上为作业第二题
        System.out.println();


        example.printPrimeNum();                                                //以上为作业第三题
        System.out.println();


        System.out.println("请输入一个数组,并使用逗号分隔（将进行排序）：");
        String number = scan.next();          //此处如果使用nextLine会导致直接跳过输入过程，并不知道为什么
        String arr[] = number.split(",");  //所以有了这个尴尬的使用逗号分隔...
        int[] num = new int[arr.length + 1];
        for (int i = 0; i < num.length - 1; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        example.sort(num);                                                        //以上为作业第四题
        System.out.println();


        System.out.println("请输入两个正整数（将计算加法进位次数）：");
        int n1, n2;
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        int up = example.carryNum(n1, n2);
        System.out.println("他们相加时的进位次数为：" + up);
        System.out.println();                                                   //以上为作业第五题


        System.out.println("请输入一个数组,并使用逗号分隔（将对数列求和）：");
        String number2 = scan.next();          //此处问题同上
        String arr2[] = number2.split(",");
        int[] num2 = new int[arr2.length + 1];
        for (int i = 0; i < num2.length - 1; i++) {
            num2[i] = Integer.parseInt(arr[i]);
        }
        System.out.println("该数列的和为:" + example.sum(num2, num2.length - 1));                     //以上为作业第六题
        System.out.println();


        System.out.println("请输入希望获得的斐波那契数列项：");
        int x = scan.nextInt();
        System.out.println(example.fib(x));
    }


    public char reverse(char ch) {
        if (ch <= 90)
            ch += 32;
        else
            ch -= 32;
        return ch;
    }

    public boolean isTrangle(int a, int b, int c) {
        boolean result;
        result = (a + b > c && a + c > b && b + c > a);
        return result;
    }

    public void printPrimeNum() {
        int j = 0;
        System.out.println("100以内的素数：");
        for (int i = 0; i < 100; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0)
                    break;
            }
            if (j == i)
                System.out.print(j + " ");
        }
        System.out.println();
    }

    public void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 2; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int k = 0; k < a.length - 1; k++) {
            System.out.print(a[k] + " ");
        }
        System.out.println();
    }

    public int carryNum(int num1, int num2) {
        int up = 0, e1 = 0, e2 = 0, count = 0;
        while (num1 != 0 || num2 != 0) {
            e1 = num1 % 10;
            e2 = num2 % 10;
            if (e1 + e2 + up >= 10) {
                count++;
                up = 1;
            } else {
                up = 0;
            }
            num1 /= 10;
            num2 /= 10;
        }
        return count;
    }

    public int sum(int[] array, int n) {
        if (n == -1)
            return 0;
        else
            return array[n] + sum(array, n - 1);
    }

    public long fib(int n) {
        int tmp = 0;
        int pre1 = 1;
        int pre2 = 1;
        if (n < 1) return 0;
        if (n == 1 || n == 2)
            return 1;
        for (int i = 3; i <= n; i++) {
            tmp = pre2;
            pre2 = pre2 + pre1;
            pre1 = tmp;
        }
        return pre2;

    }

}
