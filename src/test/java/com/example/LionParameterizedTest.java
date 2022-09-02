package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String sex;
    private final String expected;
    private final Feline feline = new Feline();

    public LionParameterizedTest(String sex, String expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] setLionData() {
        return new Object[][] {
                {"Самец", "true"},
                {"Самка", "false"},
                {"Транслев", "Используйте допустимые значения пола животного - самей или самка"}
        };
    }

    @Test
    public void testLionConstructor() throws Exception {
        try {
            Lion lion = new Lion(sex, feline);
            boolean actual = lion.doesHaveMane();
            String actualString = Boolean.toString(actual);
            Assert.assertEquals(expected, actualString);
        } catch (Exception exception){
            String actual = exception.getMessage();
            Assert.assertEquals(expected, actual);
        }
    }
}
