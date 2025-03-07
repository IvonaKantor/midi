package org.example.outer_inner;

public class Foo {
    public static void main(String[] argc) {
        MyOuterClass outerobj = new MyOuterClass();
        MyOuterClass.MyIneerClass innerobj = outerobj.new MyIneerClass();
    }
}
