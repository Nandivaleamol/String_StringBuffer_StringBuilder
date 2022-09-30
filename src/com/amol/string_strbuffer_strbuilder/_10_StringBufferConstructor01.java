package com.amol.string_strbuffer_strbuilder;

public class _10_StringBufferConstructor01 {
    public static void main(String[] args) {
        // empty object
        StringBuffer sb = new StringBuffer();
        // capacity() - it will return capacity of StringBuffer object
        // initial character capacity - 16
        // next capacity = (16+1)*2 = 34 // next - (34+1)*2 = 70
        System.out.println(sb.capacity()); // 16
        // length() - it will return length of StringBuffer object
        System.out.println(sb.length()); // 0

        // initial character capacity constructor
        StringBuffer bs2 = new StringBuffer(1000);
        System.out.println(bs2.capacity()); // 1000

        // non- empty
        StringBuffer sb3 = new StringBuffer("java"); // string str = "java" --- also same like StringBuffer(str);
        String str = "java";
        StringBuffer  sb4 = new StringBuffer(str);
        //length
        System.out.println(sb3.length()); // 4
        // capacity
        System.out.println(sb3.capacity()); // 20 --> 4+16=20
        System.out.println(sb4.capacity()); // 20 --> 4+16 = 20



    }
}
