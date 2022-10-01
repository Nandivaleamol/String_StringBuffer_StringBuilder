package com.amol.string_strbuffer_strbuilder;

public class _01_StringVsStringBuffer01 {
    public static void main(String[] args) {

        // String class : String is Immutable in nature that means we can't perform any modification operation on same object.
        // If we want to perform any modification operation on string object then we need to create other object(It means new object creation is required )
        // Whenever we perform any modification operation on string object then it will create new object and old object will be eligible for garbage collector.
        // String object is most usable in any Java application
        // String improve performance and memory efficiency. because string internally implements Heap memory and String Constant Pull memory concept.
        // String object is reusable that is if all string objects literal is same then it is pointing same memory address in String Constant Pull memory. that means it is save memory usage.
        String str = new String("java");
        str.concat("programming");
        System.out.println(str); // java

        // StringBuffer object: StringBuffer is Mutable in nature that means we can perform any modification operation on same object, not need create new object.
        //
        StringBuffer sb = new StringBuffer("java");
        sb.append("programming");
        System.out.println(sb); // javaprogramming

    }
}
