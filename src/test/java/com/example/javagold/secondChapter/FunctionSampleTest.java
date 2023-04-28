package com.example.javagold.secondChapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionSampleTest {
    FunctionSample fs;
    @BeforeEach
    void setup(){
        fs = new FunctionSample();
    }
    @Test
    void andThen() {
        assertEquals(14,fs.andThen());
    }

    @Test
    void compose() {
        assertEquals(12,fs.compose());
    }
}