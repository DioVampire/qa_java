package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTests {



    @Test
    public void felineEatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedEatMeat = List.of("Животные", "Птицы", "Рыба");
        List <String> actualEatMeat = feline.getFood("Хищник");
        assertEquals(expectedEatMeat, actualEatMeat);
    }

    @Test
    public void felineGetFamilyTest() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void felineGetKittensWithoutParametersTest() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void felineGetKittensWithParametersTest() {
        Feline feline = new Feline();
        int expected = 10;
        int actual = feline.getKittens(10);
        assertEquals(expected, actual);
    }


}
