package com.amol.string_strbuffer_strbuilder;

public class _01_StringVsStringBuffer01 {
    public static void main(String[] args) {

        // String object: It is Immutable in nature which is nothing but we can't perform any operation on same object.
        // whenever we perform any modification operation on string object then it will create new object and old will be garbage collector.
        String str = new String("java");
        str.concat("programming");
        System.out.println(str);

        // StringBuffer object: It is mutable in nature which is nothing but we can perform any operation on same object without creating new object.
        StringBuffer sb = new StringBuffer("java");
        sb.append("programming");
        System.out.println(sb);

    }
}
