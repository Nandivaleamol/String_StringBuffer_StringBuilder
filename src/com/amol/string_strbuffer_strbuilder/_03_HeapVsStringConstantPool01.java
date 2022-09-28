package com.amol.string_strbuffer_strbuilder;

public class _03_HeapVsStringConstantPool01 {
    public static void main(String[] args) {

        // String
        // Heap memory as wel as String Constant Pull memory
        String s1 = new String("java");
        String s2 = new String("java");

        // String Constant Pull
        String s3 = "java";
        String s4 = "java";

        // total object are 2 because s3 and s4 object content is same as s1 that's why s3 and s4 pointing same object s1.

        // some == operator operations on string objects
//        System.out.println(s1==s2); // false
//        System.out.println(s1==s3); // false
//        System.out.println(s1==s4); // false
//        System.out.println(s2==s3); // false
//        System.out.println(s2==s4); // false
//        System.out.println(s3==s3); // true - because both s3 and s4 objects are pointing same reference or addressS

        // some .equals() method operations on string objects
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equals(s4)); // true
        System.out.println(s2.equals(s3)); // true
        System.out.println(s2.equals(s4)); // true
        System.out.println(s3.equals(s1)); // true
        System.out.println(s3.equals(s2)); // true
        System.out.println(s3.equals(s4)); // true
        // Here String class .equals() method compare object content.
        // all objects content is same that's why all condition are becoming true
    }
}
