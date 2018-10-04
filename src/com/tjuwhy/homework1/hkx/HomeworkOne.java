package com.tjuwhy.homework1.hkx;

import java.util.Arrays;

public class HomeworkOne{
    public char reverse(char ch){
        if (Character.isLowerCase(ch)){
            char CH = Character.toUpperCase(ch);
            return CH;
        }else{
            char toch = Character.toLowerCase(ch);
        return toch;
        }
    }

    public boolean isTriangle(int a, int b, int c){
        if (a + b >= c && a + c >= b && b + c >= a ){
            return true;
        }else{
            return false;
        }
    }

    public void printPrimeNum(){
        for (int i = 1; i <= 100; i++) {
            if(i <=2 ){
                System.out.print(i + ",");
            }else{
                for (int a = 2; a <= i - 1; a++) {
                    if (i % a != 0) {
                        while (a == i - 1) {
                            System.out.print(i + ",");
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
    }
    public void sort(int[] a){
        Arrays.sort(a);
        for (int i = a.length-1; i >= 0; i--){
            System.out.print(a[i] + ",");
        }
    }

    public int carryNum(int num1, int num2) {
        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);
        int counter = 0; int n = 0;
        for (int i = 0; i <= Math.max(str1.length(), str2.length()) + 1; i++) {
            int a1 = num1 % 10; int b1 = num2 % 10;
            int ai = num1 / 10; int bi = num2 / 10;
            if ( a1 + b1 + n >= 10 ){
                counter++;
                n = 1;
                num1 = ai; num2 = bi;
            }else{
                num1 = ai; num2 = bi;
            }
        }
        return counter;
    }

    public int sum(int[] array, int n){
        if(n == 1 ){
            return array[0];
        }
        return array[n - 1] + sum(array,n - 1 );
    }


    public long fib(int n){
        long a = 1;
        long b = 1;
        long c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        HomeworkOne test = new HomeworkOne();
        int[] array ={11,2,62,23,4,13};
        System.out.println("1." + test.reverse('k'));
        System.out.println("2." + test.isTriangle(5,6,5));
        System.out.print("3.素数："); test.printPrimeNum();System.out.println();
        System.out.print("4."); test.sort(array);System.out.println();
        System.out.println("5." + test.carryNum(1,999));
        System.out.println("6." + test.sum(array,6));
        System.out.println("7." + test.fib(6));
    }
}



/*int a1 = num1 % 10; int b1 = num2 % 10;//啊……用递归写的……但是写不出来……不对……
        int ai = num1 / 10; int bi = num2 / 10;
        int counter = 0;
        if( a1 + b1 >=10 ){
            counter++;
            if ( ai < 10 & bi < 10 ) {
                if (ai + bi + 1 >= 10) {
                    return 1+counter;
                } else {
                    return counter;
                }
            } else {
                return carryNum();
            }
        }else{
            if (ai < 10 & bi < 10) {
                if (ai + bi >= 10) {
                    return 1+counter;
                } else {
                    return counter;
                }
            } else {
                return carryNum( ai , bi );
            }
        }*/