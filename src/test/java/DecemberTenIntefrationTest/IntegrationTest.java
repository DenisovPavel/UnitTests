package DecemberTenIntefrationTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class IntegrationTest {

    @Test
    @DisplayName("Check integration between RandomNumberGenerator & MaxNumberFinder")
    void checkConnectionBetweenRandomNumberGeneratorAndMaxNumberFinder() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(12, 12);// 1st class
        List<Integer> numbers = randomNumberGenerator.generateRandomNumbers(5); // create List
        MaxNumberFinder maxNumberFinder1 = new MaxNumberFinder();// 2nd class object
        assertEquals(12, maxNumberFinder1.findMaxNumber(numbers));// check integration both classes
/// Проверяем, что максимальное число в списке соответствует реальному максимуму
//        int actualMax = Collections.max(numbers); // установка макс значения через Collections
//        assertEquals(actualMax, max);
    }
}

