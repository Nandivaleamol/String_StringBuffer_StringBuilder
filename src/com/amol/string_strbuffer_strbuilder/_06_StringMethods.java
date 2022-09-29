package com.amol.string_strbuffer_strbuilder;

import java.util.Locale;

public class _06_StringMethods {
    public static void main(String[] args) {

        // string methods

        String str = "abababab";

        // replace(char old, char new) - used to replace new value with old value place
        System.out.println(str.replace("a","b")); // bbbbbbbb

        // substring(int begin) - used to create sub string of begin index onward
        String str2 = "programming";
        System.out.println(str2.substring(3)); // gramming

        //substring(int begin, int end) -it create string object from begin index to end-1 index
        System.out.println(str2.substring(0,6)); // progra

        // indexOf(char c) - it will return first occuraces index of given character
        System.out.println(str2.indexOf('r')); // 1
        System.out.println(str2.indexOf('j')); // -1 because if given character is not occur in given string object then it will return -1.

        // lastIndexOf(char) - it will return last occurance index of given character.
        System.out.println(str2.lastIndexOf('r')); // 4
        System.out.println(str2.lastIndexOf("mi")); // 7

        // toLowerCase() - it will return string object in lowercase string
        String str3 = "ProGrammiNg";
        System.out.println(str3.toLowerCase()); // programming

        // toUpperCase() - it will return string Capital Letters
        System.out.println(str3.toUpperCase());

        // trim() - it will remove beginning and ending blank spaces of string object
        String str4 = "  Java   ";
        System.out.println(str4.trim());




    }
}
