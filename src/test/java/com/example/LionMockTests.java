package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTests {

    @Mock
    Feline feline;

    @Test
    public void maleLionGetKittensTest() throws Exception{
        Lion lion = new Lion("Самец", feline);
        int expected = 1;
        Mockito.when(lion.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void femaleLionGetKittensTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        int expected = 1;
        Mockito.when(lion.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void maleLionGetFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedEatMeat = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualEatMeat = lion.getFood();
        assertEquals(expectedEatMeat, actualEatMeat);
    }

    @Test
    public void femaleLionGetFoodTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        List<String> expectedEatMeat = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualEatMeat = lion.getFood();
        assertEquals(expectedEatMeat, actualEatMeat);
    }

}
