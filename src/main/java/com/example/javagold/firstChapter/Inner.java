package com.example.javagold.firstChapter;

/**
 * なぜインナークラスがあるかというと
 * Aクラス専用のBクラスがあったとする。
 * しかし将来意図していないCクラスからも使われるかもしれない。
 * そのためには関連するまとまりはまとめましょうという「カプセル化」の考え方がある
 * **/

public class Inner {
    private int data = 2;
    //エンクロージクラス(別名：トップクラス)
    class Outer{
        //インナークラス
        //newで呼び出す
        Outer outer = new Inner().new Outer();
    }
    public static class StaticOuter{
        //staticインナークラス
        //呼び出しエラーになる例
        //StaticOuter a = new Inner().StaticOuter();

        //staticの場合、そのまま生成できる
        StaticOuter outer = new StaticOuter();

        //staticなクラスからはstaticなメンバしかアクセスできない。
        //つまりInnerクラスのdataは参照できない
        //private int i = data * 2;

    }
    public void run(){
        String message = "java1章";
        class Huge {
            //ローカルクラス
            public void print(){
                System.out.println(message);
            }
        }
        //ローカルクラスのローカル変数は、class宣言の後にするとNG
        //String message = "java1章";

        //ローカルクラスのローカル変数は、実質的にfinalになるため不変である
        //message = "書き換えできない";

        Huge i = new Huge();
        //ローカルクラスのメソッド実行
        i.print();
    }

    Comparable comp = new Comparable() {
       //匿名クラス
        @Override
        public int compareTo(Object o) {
            return 0;
        }
    };
}
