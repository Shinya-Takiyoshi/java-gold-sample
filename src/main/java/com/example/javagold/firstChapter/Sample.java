package com.example.javagold.firstChapter;

public class Sample {
    public Sample(){
        System.out.println("A");
    }
}
class Main {
    public void run(){
        Sample sample = new Sample();
                //匿名クラスではコンストラクタは宣言できない
        /*{

            public Sample(){
                System.out.println("B");
            }
        }*/
    }

}

