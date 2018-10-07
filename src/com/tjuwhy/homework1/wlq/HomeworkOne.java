package com.tjuwhy.homework1.wlq;

import java.util.Scanner;
import java.util.Arrays;

public class HomeworkOne {
    public char reverse(char ch) {
        if (ch >= 'A' && ch <= 'Z') {//判断ch是否为大写
            ch += 32;
        } else {
            ch -= 32;
        }
        return ch;//返回ch
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//使用Scanner类
        HomeworkOne homeworkeOne = new HomeworkOne();
        char ch = homeworkeOne.reverse(input.next().charAt(0));//调用方法reverse并传入参数
        System.out.println(ch);
        boolean len = homeworkeOne.isTrangle(input.nextInt(), input.nextInt(), input.nextInt());//调用方法isTrangle并传入参数
        System.out.println(len);
        homeworkeOne.printPrimeNum();//调用方法printPrimeNum
        int a[] = {input.nextInt(), input.nextInt(), input.nextInt()};
        homeworkeOne.sort(a);//调用方法sort并传入数组a
        int m=homeworkeOne.carryNum(input.nextInt(),input.nextInt());//调用方法carryNum并传入参数
        System.out.println(m);
        int b[]={input.nextInt(),input.nextInt(),input.nextInt()};
        int n=homeworkeOne.sum(b,0);//调用方法sum并传入参数
        System.out.println(n);
        long lib=homeworkeOne.fib(input.nextInt());//调用方法fib并传入参数
        System.out.println(lib);
    }

    public boolean isTrangle(int a, int b, int c) {
        boolean len;
        if (a + b > c && a + c > b && b + c > a) {//判断任意两边之和是否大于第三边
            len = true;
        } else {
            len = false;
        }
        return len;
    }

    public void printPrimeNum() {
        int m = 0;
        for (int i = 2; i <= 100; i++) {//根据素数定义，利用for循环遍历2-100之间的整数
            m = 0;
            for (int n = 2; n < i; n++) {//利用for循环遍历2-i之间的整数，检验是否存在i的因数
                if (i % n == 0) {//存在i的因数，则m加1
                    m ++;
                }
            }
            if (m != 0) {//若m不等于0，则此时i不是素数，使用continue跳过此循环
                continue;
            }
            System.out.println(i);
        }
    }

    public void sort(int[] a) {
        Arrays.sort(a);//对数组a排序
        for (int i = 0; i < a.length; i++) {//遍历数组a中元素并输出
            System.out.println(a[i]);
        }
    }

    public int carryNum(int num1, int num2) {
        int m = 0;
        for (int i = 10; i <=num1 + num2; i *= 10) {//利用for循环依次去掉整数的后几位
            // 通过做差依次求出个位，十位，百位等等的进位次数
            m += (num1 + num2) / i - (num1 / i + num2 / i);
        }
        return m;//返回m
    }
    public int sum(int[]array,int n){
        for(int i=0;i<array.length;i++){//利用for循环遍历数组array中的元素
            n+=array[i];//对数组中的元素求和
        }
        return n;//返回n
    }
    public long fib(int n) {
        long[]lib=new long[n];//定义一个长度为n的整型数组
        lib[0]=1;//定义数组第一项为1
        if(n<=1){//判断输入数字是否小于等于1，若是，则输出问题，并终止程序
            System.out.println("输入数字有问题");
            System.exit(-1);//终止程序
        }
        lib[1]=1;//定义数组第二项为1
        for(int i=2;i<n;i++){//利用for循环计算第n项的值
            lib[i]=lib[i-2]+lib[i-1];
        }
        return lib[n-1];//返回第n项
    }
}
