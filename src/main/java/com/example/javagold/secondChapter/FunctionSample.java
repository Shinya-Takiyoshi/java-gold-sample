package com.example.javagold.secondChapter;

import java.util.function.Function;

public class FunctionSample {
    Function<Integer,Integer> a = x -> x + 2;
    Function<Integer,Integer> b = x -> x * 2;

    public Integer andThen(){
       return  a.andThen(b).apply(5);
    }
    public Integer compose(){
        return  a.compose(b).apply(5);
    }

}
