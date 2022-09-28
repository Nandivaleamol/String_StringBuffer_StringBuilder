package com.amol.string_strbuffer_strbuilder;

public class _02_CompareEqualMethodInBoth {
    public static void main(String[] args) {

        // String
        String str1 = new String("java");
        String str2 = new String("java");
        System.out.println(str1==str2);  // false
        System.out.println(str1.equals(str2)); // true

        // StringBuffer
        StringBuffer sb1 = new StringBuffer("java");
        StringBuffer sb2 = new StringBuffer("java");
        System.out.println(sb1==sb2); // false
        System.out.println(sb1.equals(sb2)); // false


        /*
        Note:1: .equal() method is present in Object class and main purpose of this
        .equals() method in Object class is to check reference or address it means
         == operator and .equals() method both are same in according to Object class.

         Note:2: .equals() method in String class is overridden method main purpose to
                check content it means it is in String class for used to content comparision.
         Note:3: .equals() method is not overridden in StringBuffer class that's why .equals() method
                in StringBuffer object it will compare reference or address of object. which is same as == operator.
         */
    }
}
