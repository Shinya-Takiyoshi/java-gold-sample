package com.example.javagold.secondChapter;


import lombok.Getter;

import java.util.function.Consumer;

@Getter
public class Item {
    private int id;
    private String name;
    private String age;

    private Item(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
    }

    public static class Builder{
        private int id;
        public String name;
        public String age;
        public Builder(int id){
            this.id = id;
        }
        public Builder with(Consumer<Builder> consumer){
            consumer.accept(this);
            return this;
        }
        public Item build(){
            return new Item(this);
        }
    }
}
