package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {
    private final String animalKind;
    private final String expected;

    public AnimalParameterizedTest(String animalKind, String expected) {
        this.animalKind = animalKind;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] setGetFoodData() {
        return new Object[][]{
                {"Травоядное", "Трава, Различные растения"},
                {"Хищник", "Животные, Птицы, Рыба"},
                {"Насекомое", "Неизвестный вид животного, используйте значение Травоядное или Хищник"},
        };
    }

        @Test
                public void getFoodTest() throws Exception {
            try {
                Animal animal = new Animal();
                List<String> actual = animal.getFood(animalKind);
                String actualString = String.join(", ", actual);
                assertEquals(expected, actualString);
            } catch (Exception exception) {
                String actual = exception.getMessage();
                assertEquals(expected, actual);
            }

        }
}
