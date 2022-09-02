package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AlexParameterizedTest {
    private final String sex;
    private final String expected;
    private final Feline feline = new Feline();

    public AlexParameterizedTest(String sex, String expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] setAlexLionData() {
        return new Object[][] {
                {"Самец", "true"},
                {"Самка", "Алекс может быть только самцом"}
        };
    }

    @Test
    public void testAlexLionConstructor() throws Exception {
        try {
            AlexLion alex = new AlexLion(sex, feline);
            boolean actual = alex.doesHaveMane();
            String actualString = Boolean.toString(actual);
            Assert.assertEquals(expected, actualString);
        } catch (Exception exception){
            String actual = exception.getMessage();
            Assert.assertEquals(expected, actual);
        }
    }
}
