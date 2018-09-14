package class2;

import java.util.*;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap<Integer, String>();//初始化一个key类型为int,value类型为String的Map

        hashMap.put(1, "My key is 1.");
        hashMap.put(2, "My key is 2.");
        hashMap.put(3, "My key is 3.");//为map添加一个key为3，value为"My key is 3."的元素

        System.out.println(hashMap.keySet());// 输出结果：[1, 2, 3]
        // 返回了hashMap中所有key的集合（Set）

        System.out.println(hashMap.values());// 输出结果：[My key is 1., My key is 2., My key is 3.]
        // 返回了hashMap中所有value的集合（Collection)

        System.out.println(hashMap.entrySet());//输出结果：[1=My key is 1., 2=My key is 2., 3=My key is 3.]
        // 返回了hashMap中所有映射关系的集合（Set）


        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(4, "My key is 4");
        hashMap1.put(5, "My key is 5");

        hashMap.putAll(hashMap1);//将 hashMap1 中的所有元素加到hashMap中

        System.out.println(hashMap.remove(1));// 输出结果：My key is 1.
        // 删除 hashMap 中key为1的元素，并返回key为1的value值

    }

}
