package com.amol.string_strbuffer_strbuilder;

public class _12_StringBufferMethods02 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        // inset() - inset the char, int string, boolean float any type...
        sb.insert(1,"YA");
        System.out.println(sb); // JYAava

        // delete(int begin, ind end) - it will delete from begin index to end-1 index
        sb.delete(1,3);
        System.out.println(sb); // Java

        // deleteCharAt(int i) - delete i index char
        sb.deleteCharAt(2);
        System.out.println(sb); // Jaa

        // reverse() - it will return reverse order string characters
        sb.reverse();
        System.out.println(sb); // aaJ
    }
}
