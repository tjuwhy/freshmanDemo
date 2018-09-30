package com.tjuwhy.class3;

public class GenericMethodTest {

    private static<T> void printClassName(T t){
        System.out.println(t.getClass());
    }

    public static void main(String[] args) {
        printClassName(1);
        printClassName(2.0);
        printClassName("twt");
        //输出结果：
        //class java.lang.Integer
        //class java.lang.Double
        //class java.lang.String
    }

}
