package com.amol.string_strbuffer_strbuilder;

public class _08_StringImmutableAdvanced {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = str1.toString();
        String str3 = str1.toLowerCase();
        String str4 = str1.toUpperCase();

        System.out.println(str1==str2); // true
        System.out.println(str1==str3); // true
        System.out.println(str1==str4); // false

        // Note: here string object content is not modify then it will not create new object
        
    }
}
