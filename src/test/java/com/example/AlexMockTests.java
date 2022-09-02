package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexMockTests {

    @Mock
    Feline feline;

    @Test
    public void alexGetKittensTest() throws Exception {
        AlexLion alex = new AlexLion("Самец", feline);
        int expected = 0;
        int actual = alex.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        AlexLion alex = new AlexLion("Самец", feline);
        String expected = "Нью-Йоркский зоопарк";
        String actual = alex.getPlaceOfLiving();
        assertEquals(expected, actual);
    }

    @Test
    public void getFriendsTest() throws Exception {
        AlexLion alex = new AlexLion("Самец", feline);
        List<String> expected = List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
        List<String> actual = alex.getFriends();
        assertEquals(expected, actual);
    }

}
