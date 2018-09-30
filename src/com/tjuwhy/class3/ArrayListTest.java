package com.tjuwhy.class3;

import java.util.*;

public class ArrayListTest {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(); //创建一个 ArrayList 对象
        arrayList.add("1");
        arrayList.add("12");
        arrayList.add("123"); //向 arrayList 的最后添加元素

        arrayList.add(0, "0"); //在 arrayList 的指定下标处插入元素

        System.out.println(arrayList);

        String str = arrayList.get(1); //str = "1"
        //访问 arrayList 指定下标index对应的元素

        int length = arrayList.size(); //length = 4
        //返回 arrayList 中元素的个数

        boolean isContain = arrayList.contains("123"); //isContain = true
        //判断 arrayList 中是否存在某个元素值

        arrayList.remove(0);//将arrayList中下标为0的元素移除
        System.out.println(arrayList);

        arrayList.remove("123");//将arrayList中"123"元素移除
        System.out.println(arrayList);

        arrayList.clear();//将arrayList中所有元素移除

        boolean isEmpty = arrayList.isEmpty();//isEmpty = true
        //判断 arrayList 是否为空
    }
}
