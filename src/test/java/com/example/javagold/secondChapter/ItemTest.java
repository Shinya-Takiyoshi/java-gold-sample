package com.example.javagold.secondChapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ItemTest {

    @Test
    public void builderTest(){
        Item item = new Item.Builder(100)
                .with(b -> {
                    b.name = "aiko";
                    b.age = "12";
                }).build();
        Assertions.assertAll("item",
                ()-> Assertions.assertEquals(100,item.getId()),
                ()-> Assertions.assertEquals("aiko",item.getName()),
                ()-> Assertions.assertEquals("12",item.getAge())
        );
    }
}