package org.example.outer_inner;

public class Foo {
    public static void main(String[] argc) {
        MyOuterClass outerobj = new MyOuterClass();
        MyOuterClass.MyInnerClass innerobj = new MyOuterClass.MyInnerClass();

        outerobj.inner = innerobj;
        innerobj.go();
    }
}
