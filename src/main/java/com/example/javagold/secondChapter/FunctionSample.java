package com.example.javagold.secondChapter;

import java.util.function.Function;

public class FunctionSample {
    Function<Integer,Integer> a = x -> x + 2;
    Function<Integer,Integer> b = x -> x * 2;

    public Integer andThen(){
        // 処理順：a -> b
       return  a.andThen(b).apply(5);
    }
    public Integer compose(){
        // 処理順：b -> a
        return  a.compose(b).apply(5);
    }

}
