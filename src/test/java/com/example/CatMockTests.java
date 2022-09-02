
package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatMockTests {

    @Mock
    Feline feline;

    @Test
    public void getCatFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");;
        Mockito.when(cat.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = cat.getFood();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getCatSoundTest() {
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        String actual = cat.getSound();
        Assert.assertEquals(expected, actual);
    }

}