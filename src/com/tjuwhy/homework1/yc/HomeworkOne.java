package com.tjuwhy.homework1.yc;


public class HomeworkOne {

    public static void main(String[] args) {

    }

    /**
     * 1.判断大小写字母并相互转换
     *
     * @return ch
     */
    public char reverse(char ch) {
        String str1 = String.valueOf(ch);
        if (Character.isLetter(ch) && str1.length() <= 1) {         //判断输入的是否为字母
            if (ch >= 65 && ch <= 90) {                                           //利用acsii码值判断大小写
                System.out.print("输入了一个大写字母，转化为小写为 : " + str1.toLowerCase());
            } else if (ch >= 97 && ch <= 122) {
                System.out.print("输入了一个小写字母，转化为大写为: " + str1.toUpperCase());
            }
        } else {
            System.out.print("输入了一个非法字符");
        }
        return ch;
    }

    /**
     * 2.判断能否构成三角形
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public boolean isTriangle(int a, int b, int c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 3.输出0-100间所有的素数
     */
    public void printPrimeNum() {
        boolean isPrimeNum;
        for (int i = 3; i < 100; i += 2) {                          //除2以外的所有偶数都不是素数，因此只遍历奇数，减少外层遍历次数
            isPrimeNum = true;
            for (int j = 3; j <= Math.sqrt(i); j++) {         //只遍历到j开平方根的数，减少内层遍历的次数
                if (i % j == 0) {
                    isPrimeNum = false;
                    break;
                }
            }
            if (isPrimeNum)
                System.out.print(i + " ");
        }
    }

    /**
     * 4.实现数组从大到小排序
     *
     * @param a
     */
    public void sort(int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;                //让两个数交换位置
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
    }

    /**
     * 5.传入两个正整型数，返回其相加进位的次数
     *
     * @param num1
     * @param num2
     * @return
     */
    public int carryNum(int num1, int num2) {
        int count = 0;
        if (num1 % 10 + num2 % 10 >= 10) {
            count++;
        }
        if (num1 % 100 + num2 % 100 >= 100) {
            count++;
        }
        if (num1 % 1000 + num2 % 1000 >= 1000) {
            count++;
        }
        return count;
}

    /**
     * 6.递归方式计算数组所有元素的和
     *
     * @param array
     * @param n
     * @return
     */
    public int sum(int[] array, int n) {
        if (n < array.length - 1) {                     //返回当前的值加剩下的那一部分所有的和
            return array[n] + sum(array, n + 1);
        } else {
            return array[n];                               //只有一个了，所以只需要返回当前的
        }
    }


    /**
     * 7.非递归方式返回第n项斐波那契额数列的值
     *
     * @param n
     * @return fn
     */
    public long fib(int n) {
        int first = 0;
        int second = 1;
        int fn = 0;
        for (int i = 2; i < n + 1; i++) {
            fn = first + second;
            first = second;
            second = fn;
        }
        return fn;
    }
}
