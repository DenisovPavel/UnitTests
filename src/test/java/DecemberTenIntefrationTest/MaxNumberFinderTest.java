package DecemberTenIntefrationTest;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberFinderTest {
    private MaxNumberFinder maxNumberFinder;


    @BeforeEach
    void setUp() {
        maxNumberFinder = new MaxNumberFinder();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Проверка выброса исключения")
    void findMaxNumberForException() {
        List<Integer> numbers = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> maxNumberFinder.findMaxNumber(numbers));
    }

    @Test
    @DisplayName("Проверка выброса исключения")
    void findMaxNumberTest() {
        List<Integer> numbers = List.of(5, 10, 15);
        assertEquals(15, maxNumberFinder.findMaxNumber(numbers));
    }
}