package com.tjuwhy.class1;

public class BasicStatement {

    public static void main(String[] args) {

        int a = 1;//int 类型表示整数
        double b = 2.0;//double类型表示浮点数
        final boolean c = true;//boolean true false
        String d = "twtstudio";//String并不是基本数据类型,而是一个类

        int arrayA[] = {1, 2, 3};//数组是一个对象
        double arrayB[] = {1.0, 2.0, 3.0};

        System.out.println(a);//输出并换行
        System.out.print(b);//输出不换行

        if (arrayA[0] == ++a/*后置加加*/) {
            System.out.println("a和array[0]是相等的");
        } else {
            System.out.println("a和array[0]是不等的");
        }

//        {
//            int num = 0;
//        }
//        num

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }

        for (double num : arrayB) {
            System.out.println(num);
        }

        while (a != 5/*循环条件,只要满足就会一直执行后面的代码块*/){
            System.out.println(a++);
        }
    }

}
