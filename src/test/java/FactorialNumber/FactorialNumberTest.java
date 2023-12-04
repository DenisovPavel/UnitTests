package FactorialNumber;

import calculator.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialNumberTest {
    private FactorialNumber factorialNumber;

    @BeforeEach
    void setUp() {
        factorialNumber = new FactorialNumber();
    }

    @AfterEach
    void tearDown() {
        factorialNumber = null;
    }

    @Test
    @DisplayName("Факториал числа 1")
    void testNumberOne() {
        assertEquals(1, factorialNumber.getFactorial(1));
    }

    @Test
    @DisplayName("Факториал числа 0")
    void testNumberZero() {
        assertEquals(1, factorialNumber.getFactorial(0));
    }

    @Test
    @DisplayName("Факториал числа 2")
    void testNumberSecond() {
        assertEquals(2, factorialNumber.getFactorial(2));
    }

    @Test
    @DisplayName("Факториал числа 3")
    void testNumberThree() {
        assertEquals(6, factorialNumber.getFactorial(3));
    }

    @Test
    @DisplayName("Факториал числа 4")
    void testNumberFour() {
        assertEquals(24, factorialNumber.getFactorial(4));
    }

    @Test
    @DisplayName("Факториал числа 5")
    void testNumberFive() {
        assertEquals(120, factorialNumber.getFactorial(5));
    }

//    @Test
//    @Disabled("Этот тест отключен")
//    void disabledTest() {
//        fail("Не будет выполнен");
//    }


    @Test
    @DisplayName("Факториал отрицательного числа")
    void testNumberNotPositive() {
        assertThrows(IllegalArgumentException.class, () -> factorialNumber.getFactorial(-1));
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    @DisplayName("Параметризованный тест")
    void testWithParameters(int arg) {
        assertEquals(arg, factorialNumber.getFactorial(arg));
    }

    @Test
    @DisplayName("Проверка истинного условия")
    void testAssertTrue() {
        assertTrue(factorialNumber.getFactorial(5) == 120);
    }

    @Test
    @DisplayName("Проверка ложного условия")
    void testAssertFalse() {
        assertFalse(factorialNumber.getFactorial(4) == 25);
    }


    @Test
    @DisplayName("Проверка наличия объекта")
    void testAssertNotNull() {
        assertNotNull(factorialNumber);
    }

    @Test
    @DisplayName("Проверка отсутствия объекта")
    void testAssertNull() {
        factorialNumber = null;
        assertNull(factorialNumber);
    }

    @Test
    @DisplayName("Проверка равенства массивов")
    void testAssertArrayEquals() {

        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual);

    }

    @Test
    @DisplayName("Проверка НЕравенства массивов")
    void testAssertNotEquals() {

        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3, 4};
        assertNotEquals(expected, actual);

    }
}
