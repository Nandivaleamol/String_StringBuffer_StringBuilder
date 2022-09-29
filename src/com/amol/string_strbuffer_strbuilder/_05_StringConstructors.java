package com.amol.string_strbuffer_strbuilder;

public class _05_StringConstructors {
    public static void main(String[] args) {

        // 0 length string
        String str1 = new String();
        System.out.println(str1.length()); // 0

        // literal string constructor
        String str2 = new String("java");
        System.out.println(str2.length()); // 4

        // char [] ch string constructor
        char[] ch = {'j','a','v','a'};
        String str3 = new String(ch);
        System.out.println(str3); // java

        // byte[] by string constructor
        byte [] by = {97,98,99,100};
        String str4 = new String(by);
        System.out.println(str4); // abcd , here byte value string treats like alphabets ascii value


    }
}
