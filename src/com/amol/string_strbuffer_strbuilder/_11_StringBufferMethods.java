package com.amol.string_strbuffer_strbuilder;

public class _11_StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        // length() method
        System.out.println(sb.length()); // 4

        // capacity() method
        System.out.println(sb.capacity()); // 20

        //charAt(int index) method
        System.out.println(sb.charAt(2)); // v

        // setCharAt(int index, char ch)
        sb.setCharAt(0,'Y');
        System.out.println(sb);

        // append() method --> here append() method overloading concept is available
        // append() method is overloaded method... argument like - char , int , float , double, boolean string...
        StringBuffer sb2 = new StringBuffer();
        sb2.append("PI value is ");
        sb2.append(3.14);
        sb2.append( " is exactly ");
        sb2.append(true);
        System.out.println(sb2); // PI value is 3.14 is exactly true

    }
}
