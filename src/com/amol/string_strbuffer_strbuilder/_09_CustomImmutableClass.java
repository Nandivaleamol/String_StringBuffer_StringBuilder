package com.amol.string_strbuffer_strbuilder;

final class CustomImmutable{
    private int i;
    CustomImmutable(int i){
        this.i = i;
    }
    public CustomImmutable modify(int i){

        if (this.i == i){
            return this;
        }else{
            return new CustomImmutable(i);
        }
    }
}
public class _09_CustomImmutableClass {
    public static void main(String[] args) {

        CustomImmutable ct1 = new CustomImmutable(18);
        CustomImmutable ct2 = ct1.modify(18);
        CustomImmutable ct3 = ct1.modify(10);

        System.out.println(ct1==ct2); // true
        System.out.println(ct1==ct3); // false
    }
}
