package com.tjuwhy.homework1.zk;

import java.lang.Math;
import java.util.Arrays;

public class HomeworkOne {
    public static void main(String[] args){
        //创建对象
        HomeworkOne settle = new HomeworkOne();
        //output 1
        System.out.println(settle.reverse('a'));//转换大小写
        System.out.println(settle.reverse('A'));//转换大小写
        //output 2
        System.out.println(settle.isTrangle(4,2,3));//判断是否为三角形
        //output 3
        settle.printPrimeNum();//输出质数
        //output 4
        int[] a =new int[10];//创建数组a
        for (int i = 0; i <10 ; i++) {
            a[i] = (int)(Math.random()*200-100);//随机赋值
        }
        settle.sort(a);
        System.out.println(Arrays.toString(a));
        //output 5
        int[] h ={1,-1,3};
        System.out.println(settle.sum(h,h.length -1));//数组h各元素求和
        //output 6
        System.out.println(settle.carryNum(2333,6666));//判断求和进位次数
        //output 7
        System.out.println(settle.fib(10));//斐波那契数列
    }
    //quesion 1
    public char reverse(char ch){
        if(ch >= 'a' && ch <= 'z'){
            ch -=32; //变成大写
        }else if(ch >= 'A' && ch <= 'Z'){
            ch +=32; //变成小写
        }
        return ch;
    }
    //question 2
    public boolean isTrangle(int a,int b,int c){
        if(a > b){//重新排序，使a < b
            int d = b;
            b = a;
            a = d;
            if(b > c){//重新排序，使b < c
                d = b;
                b = c;
                c = d;
            }
        }
        if(a + b > c && c - b < a){
            return true;
        }else{
            return false;
        }
    }
    //question 3
    public void printPrimeNum(){
        for (int i = 2; i <= 100; i++) {//遍历2~100的整数
            boolean bool = true;
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if(i % j == 0){
                    bool = false;//判断是否为质数
                }
            }
            if(bool){
                System.out.printf("%d ",i);//输出质数
            }
        }System.out.println("");//换行
    }
    //question 4
    public void sort(int[] a){
        Arrays.sort(a);//数组排序
    }
    //question 5
    public int carryNum(int num1,int num2){
        //将int转换成String
        String str1 ="" + num1;
        String str2 ="" + num2;
        //获取String长度，声明计数器
        int len1 = str1.length();
        int len2 = str2.length();
        int count = 0;

        for (len1 = len1 -1,len2 = len2 -1; len1 >= 0 && len2 >= 0; len1--, len2--) {
            int i1 = Integer.parseInt(str1.charAt(len1)+"");//依次获取个、十、百……位
            int i2 = Integer.parseInt(str2.charAt(len2)+"");//依次获取个、十、百……位
            if(i1 + i2 >= 10){//判断是否进位
                count++;
            }
        }
        return count;
    }
    //question 6
    public int sum(int[] array,int n){
        if(n == 0){
            return array[n];//返回:前n项和
        }
        return sum(array,n - 1) + array[n];//返回:前n-1项和 + 第n项
    }
    //question 7
    public long fib(int n){
        long[] fibArray = new long[n];//声明长整型数组
        for (int i = 0; i < n; i++) {
            if(i == 0 || i == 1){
                fibArray[i] = 1;//赋值 斐波那契数列前两项
            }else {
                fibArray[i] = fibArray[i - 1] + fibArray[i - 2];//计算数列第i项
            }
        }
        return fibArray[n-1];//返回数列第n项
    }


}
