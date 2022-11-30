package com.amol.string_strbuffer_strbuilder;

public class _01_StringVsStringBuffer01 {
    public static void main(String[] args) {

        // String class : String is Immutable in nature that means we can't perform any modification operation on same string object.
        // If we want to perform any modification operation on string object then we need to create new object(It means new object creation is required )
        // Whenever we perform any modification operation on string object then it will create new object and old object will be eligible for garbage collector.
        // String object is most usable in any Java application because object reusable possible.(String Constant Pool memory)
        // String improve performance and memory efficiency. because string internally implements Heap memory and String Constant Pool memory area.
        // String object is reusable that is if all string objects literal is same then it is pointing same memory address in String Constant Pool memory.
        // String class contains its own methods like- length(),equals(), trim(), split(), contains(char c), charAt(int index), replace(char target, char replacement), toLowerCase, toUpperCase(), substring(int begin, int end), etc..
        String str = new String("java");
        str.concat("programming");
        System.out.println(str); // java

        // StringBuffer object: StringBuffer is Mutable in nature that means we can perform any modification operation on same object, not need to create new object.
        //There no String Constant Pool such type memory area, object store in Heap memory area.
        // StringBuffer is less use in any java application.
        // StringBuffer contains its own method like - length(), capacity(), charAt(int i), setCharAt(int index, char ch), append(String str), insert(int offset, String str), delete(int begin, int end), reverse(), etc..
        StringBuffer sb = new StringBuffer("java");
        sb.append("programming");
        System.out.println(sb); // javaprogramming

    }
}
