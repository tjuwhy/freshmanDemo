package com.tjuwhy.class1;//包声明语句

import java.lang.Math;//导包语句

public class Main/*<-类声明语句，类体->*/ {

    //每一个能执行的类里必须有一个main方法
    public static void main(String[] args) {
        System.out.print("a = ");
        int a = Math.max(1, 2);
        System.out.println(a);
    }
}//每一个.java文件只能有一个public修饰的同名类