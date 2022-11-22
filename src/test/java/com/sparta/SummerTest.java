package com.sparta;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SummerTest {

    @Test
    @DisplayName("Testing sum of integer arrays")
    public void sumOfIntegerArrays()
    {
        int[] ints = {1,2,3,4,5};
        int expected = 15;
        int result = Summer.sumArray(ints);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Counting first character in word list")
    public void countFirstLetterMatch()
    {
        String[] words = {"the", "the", "test", "main", "test", "chat", "eng"};
        int expected = 4;
        int result = Summer.countWords(words, 't');
        assertEquals(expected, result);
    }

}