package com.tjuwhy.class3;

public class Box<T> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();

        integerBox.set(10);
        stringBox.set("天外天移动Android组");

        System.out.println(integerBox.get());
        System.out.println(stringBox.get());
        //输出结果：
        //10
        //天外天移动Android组
    }
}