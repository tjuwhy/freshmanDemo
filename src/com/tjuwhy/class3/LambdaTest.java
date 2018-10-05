package com.tjuwhy.class3;

import sun.swing.plaf.windows.ClassicSortArrowIcon;

import java.util.*;

public class LambdaTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.stream()
                .map(it -> it + "2")
                .forEach(System.out::println);
        int array[] = {1,2,3};

        Operation o = (int a, int b) -> a - b;
        Say s = str -> {
            System.out.println(str);
            // a = 1;
            // 表达式只能引用标记了 final 的外层局部变量，这就是说不能在 lambda 内部修改定义在域外的局部变量，否则会编译错误。
        } ;
        System.out.println(operate(3,2, o));

        new Thread(() -> System.out.println("aaa"));

        List<StringClass> list1 = new ArrayList<>();
        FirstData first = new FirstData();
        for (int i = 0; i < first.getDataList().size(); i++){
            SecondData secondData = first.getDataList().get(i);
            //do something with second and firstData.
            for (int j = 0; j < secondData.getDataList().size(); j++ ){
                ThirdData third = secondData.getDataList().get(j);
                //give thirdList a filter
                if (third.getThirdData().startsWith(" ")){
                    list1.add(new StringClass(third.getThirdData()));
                }
                //do something with third and thirdData
            }
        }

        first.getDataList()
                .forEach(it ->
                        it.getDataList()
                                .stream()
                                .filter(t -> t.getThirdData().startsWith(" "))
                                .map(t -> new StringClass(t.getThirdData()))
                                .forEach(list1::add)
                );

    }

    interface Operation {
        int operate(int a, int b);
    }

    interface Say{
        void say(String str);
            default void print(String str){
                System.out.println(str);
            }
    }

    static int operate(int a, int b, Operation o) {
        return o.operate(a, b);
    }

    static class FirstData{

        private int firstIndex;
        private String firstData;
        private List<SecondData> dataList;

        public int getFirstIndex() {
            return firstIndex;
        }

        public void setFirstIndex(int firstIndex) {
            this.firstIndex = firstIndex;
        }

        public String getFirstData() {
            return firstData;
        }

        public void setFirstData(String firstData) {
            this.firstData = firstData;
        }

        public List<SecondData> getDataList() {
            return dataList;
        }

        public void setDataList(List<SecondData> dataList) {
            this.dataList = dataList;
        }
    }

    static class SecondData{
        private int secondIndex;
        private String secondData;
        private List<ThirdData> dataList;

        public int getSecondIndex() {
            return secondIndex;
        }

        public void setSecondIndex(int secondIndex) {
            this.secondIndex = secondIndex;
        }

        public String getSecondData() {
            return secondData;
        }

        public void setSecondData(String secondData) {
            this.secondData = secondData;
        }

        public List<ThirdData> getDataList() {
            return dataList;
        }

        public void setDataList(List<ThirdData> dataList) {
            this.dataList = dataList;
        }
    }

    static class ThirdData{
        private int thirdIndex;
        private String thirdData;

        public String getThirdData() {
            return thirdData;
        }

        public void setThirdData(String thirdData) {
            this.thirdData = thirdData;
        }

        public int getThirdIndex() {
            return thirdIndex;
        }

        public void setThirdIndex(int thirdIndex) {
            this.thirdIndex = thirdIndex;
        }
    }

    static class StringClass{

        private String str;

        StringClass(String str){
            this.str = str;
        }
    }

}

