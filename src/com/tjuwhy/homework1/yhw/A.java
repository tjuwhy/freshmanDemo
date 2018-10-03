package com.tjuwhy.homework1.yhw;

//用ABC之类代表任务
//这里是第一个任务
public class A {
    public char reverse(char ch) {
        if (Character.isUpperCase(ch)) {
            ch = (char) (ch + 32);
            System.out.println(ch);
        } else {
            ch = (char) (ch - 32);
            System.out.println(ch);
        }

        return ch;
    }

    //第二个
    public boolean isTrangle(int a, int b, int c) {
        if (a + b > c && a - b < c && a + c > b && a - c < b && b + c > a && b - c < a) {
            System.out.println("可以构成三角形");
        } else {
            System.out.println("不能构成三角形");
        }
        return true;
    }

    //第三个
    public void printPrimeNum() {
        int i, j;
        //i从2到100，用n来判断i是不是素数

        for (i = 2; i <= 100; i++) {
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0)
                    break;
                //能被j整除就不是素数了【j既不是1也不是i本身
            }
            if (j > i / 2)
                System.out.println(i + "是素数");
        }

    }

    //第四个
    public void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                int t;
                if (a[j] > a[i]) {
                    //冒泡排序【虽然感觉时间上花得多一点
                    t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                }
            }
        }
        System.out.println("排序结果为：");
        for (int n = 0; n < a.length; n++) {

            System.out.print(a[n] + ",");
        }
    }

    //第五个
    public int carryNum(int num1, int num2) {
        //进位次数为n
        int n=0;
        //各个位上的数，用a,b,c,d来表示
        //千位
        int d1=num1/1000;
        int d2=num2/1000;
        //百位
        int c1=(num1%1000)/100;
        int c2=(num2%1000)/100;
        //十位
        int b1=(num1%100)/10;
        int b2=(num2%100)/10;
        //个位
        int a1=num1%10;
        int a2=num2%10;
        //各个位上的数字相加
        if (a1+a2>9){n=n+1;b1=b1+1;}//个位数加起来大于9，进位，十位上的数+1,下面同理
        if (b1+b2>9){n=n+1;c1=c1+1;}
        if (c1+c2>9){n=n+1;d1=d1+1;}
        if (d1+d2>9){n=n+1;}



        System.out.println("2个数字相加，进位次数为："+n);

        return num1;
    }
    //第六个
    public int sum(int[] array){
        int n=0;//n为总和
        for (int i=0;i<array.length;i++){
            n=n+array[i];
        }
        System.out.println("数组内的数字相加后的和是："+n);
        return n;
    }
    //第七个
    //先定义数列，把数列中的项添加到一个List中
    public long fib(int n){
        int arr[] = new int[1000];
        arr[0] = arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
            System.out.print("数列第n项为："+arr[n-1]);

        return  n;
    }
}





