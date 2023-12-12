package DecemberTenIntefrationTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGeneratorTest {

    private RandomNumberGenerator randomNumberGenerator;
    private List<Integer> generateNumbers = new ArrayList<>();

    @BeforeEach
    void setUp() {
        randomNumberGenerator = new RandomNumberGenerator(1, 12);
        generateNumbers = randomNumberGenerator.generateRandomNumbers(5);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Check random numbers in interval from 1 to 12")
    void generateRandomNumberTestIntervalMinMax() {
        for (int num : generateNumbers) {
            assertTrue(num >= 1 && num <= 12);
        }
    }

    @Test
    @DisplayName("Check that lenght == 5 numbers")
    void generateRandomNumberTestLenght() {
        assertEquals(5, generateNumbers.size());
    }

}
