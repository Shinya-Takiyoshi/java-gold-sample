package com.example.javagold.firstChapter;

public interface A
{
    //Java SE8以降からインターフェースにstaticメソッドが定義できるようになりました。
    static void test(){
        System.out.println("A");
    }
}

interface B extends A{}

class Main9 implements A{
    public static void run(){
        A.test();
        //Bとしては呼べない
        //B.test();
    }
}
