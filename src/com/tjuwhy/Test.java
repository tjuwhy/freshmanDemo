package com.tjuwhy;

public class Test {

    public static void main(String[] args) {

        StringClass a = new StringClass("123");
        StringClass b = new StringClass("123");
        System.out.println(a.equals(b));
    }

    static class StringClass{
        String string;
        StringClass(String string){
            this.string = string;
        }

        @Override
        public boolean equals(Object obj) {
            return this.string.equals(((StringClass) obj).string);
        }
    }
}
