package com.tjuwhy.homework1.lyh;

public class HomeworkOne {
    public static void main(String args[]) {
        HomeworkOne test = new HomeworkOne();//以下是测试
        System.out.println(test.reverse('a'));
        System.out.println(test.reverse('A'));
        System.out.println(test.isTrangle(3, 4, 5));
        System.out.println(test.isTrangle(1, 1, 2));
        test.printPrimNum();
        int[] op = {1, 3, 6, 9, 8, 6, 5, 4, 2, 3, 6, 5, 4};
        test.sort(op);
        for (int i : op) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.printf("\n");
        System.out.println(test.carryNum(132, 88));
        System.out.println(test.carryNum(1001, 1001999));
        System.out.println(test.sum(op, op.length));
        System.out.println(test.fib(300));
    }

    public char reverse(char ch) {//大小写字母转化
        if (ch >= 'a' && ch <= 'z') return (char) (ch - 32);
        if (ch >= 'A' && ch <= 'Z') return (char) (ch + 32);
        return '\0';//输入非法
    }

    public boolean isTrangle(int a, int b, int c) {//三角形判定
        if (a <= 0 || b <= 0 || c <= 0) return false;
        if (a + b <= c || a + c <= b || b + c <= a) return false;
        return true;
    }

    public static void printPrimNum() {//质数输出
        boolean[] op = new boolean[101];//默认初始化为false
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; i * j <= 100; j++) op[i * j] = true;
        }
        for (int i = 2; i <= 100; i++) {
            if (!op[i]) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.printf("\n");
    }

    public void quick_sort(int l, int r, int[] a) {//快排递归版
        if (l >= r) return;
        int k = a[l], i = l, j = r;
        int temp = 0;
        while (i < j) {
            while (i < j && a[j] <= k) j--;
            temp = a[i];//JAVA里int没法引用(应该),swap()写不出来,只能先这样了ヽ(ー_ー)ノ
            a[i] = a[j];
            a[j] = temp;
            while (i < j && a[i] >= k) i++;
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        quick_sort(l, i - 1, a);
        quick_sort(i + 1, r, a);
    }

    public void sort(int[] a) {//数的降序排列
        quick_sort(0, a.length - 1, a);
    }

    public int carryNum(int num1, int num2) {//计算进位次数,输入正整数
        int ans = 0, r = 0;//ans储存答案,r储存当前进位的数
        while (num1 != 0 && num2 != 0) {
            if (num1 % 10 + num2 % 10 + r >= 10) ans++;
            r = (num1 % 10 + num2 % 10 + r) / 10;
            num1 /= 10;
            num2 /= 10;
        }
        return ans;
    }

    public int sum(int[] array, int n) {//计算数组的和,这里认为n是前n项和
        if (n == 1) return array[0];
        return sum(array, n - 1) + array[n - 1];
    }

    public long fib(int n) {//斐波那契数列循环版,默认输入为正整数
        if (n <= 2) return 1l;
        long x = 1, y = 1, z = 0;
        for (int i = 3; i <= n; i++) {
            z = x + y;
            if (x < y) x = z;
            else y = z;
        }
        return z;
    }
}
