package com.tjuwhy.class1;

public class BasicDataType {

    public static void main(String[] args) {

        int a = 1;//int 类型表示整数
        double b = 2.0;//double类型表示浮点数
        final boolean c = true;//boolean true false
        String d = "twtstudio";//String并不是基本数据类型,而是一个类

        int arrayA[] = {1, 2, 3};//数组是一个对象
        double arrayB[] = {1.0, 2.0, 3.0};
        //...以此类推

        // c = false; ->错误！被final修饰的变量不可更改
        // a =  9999999999999 -> 溢出！超出int的最大范围

    }

}
