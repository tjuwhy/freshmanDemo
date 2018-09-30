package com.tjuwhy.class3;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    public static void main(String[] args) {
        HashSet set = new HashSet<String>(); //初始化一个Set
        set.add("12");
        set.add("1");
        set.add("12");
        set.add("123");
        set.add("123");//重复的元素不会被添加
        set.add("13");
        set.add("23");
        set.add("42");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //输出结果
        //12
        //1
        //23
        //123
        //13
        //42
        //注：set的储存是无序的
    }

}
