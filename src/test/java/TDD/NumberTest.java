package TDD;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class NumberTest {
    private Number number;

    @BeforeEach
    void setUp() {
        Number number = new Number();
    }

    @AfterEach
    void tearDown() {
        number = null;
    }

    /**
     * Проверка четного числа, на четном значении, отработка теста assertTrue;
     */
    @Test
    @DisplayName("Check number for EVEN!-> one arg")
    void evenOddNumberTrue() {
        assertTrue(number.evenOddNumber(12));
    }

    /**
     * Проверка четного числа,на массиве четных аргументов, отработка теста assertTrue;
     * @param arg = array even arguments;
     */
    @ParameterizedTest
    @ValueSource(ints = {8, 6, 2, 2})
    @DisplayName("Check number for EVEN! -> many args")
    void evenOddNumber(int arg) {
        assertTrue(number.evenOddNumber(arg));
    }

    /**
     * Проверка четного числа, на нечетном значении, отработка теста assertTrue;
     */
    @Test
    @DisplayName("Check number for EVEN - Incorrect arg!")
    void notEvenOddNumberTrue() {
        assertFalse(number.evenOddNumber(13));
    }

    /**
     * Проверка четного числа,на массиве нечетных аргументов, отработка теста assertTrue;
     * @param arg = array not even arguments;
     */
    @ParameterizedTest
    @ValueSource(ints = {7, 5, 3, 1})
    @DisplayName("Check number for EVEN! -> many args")
    void notEvenOddNumber(int arg) {
        assertFalse(number.evenOddNumber(arg));
    }

    /**
     * Проверка числа в диапозоне от 25 до 100 -> корректный аргумент
     */


    @Test
    @DisplayName("Check number in interval - True arg")
    void numberInIntervalTrueTest(){
        assertTrue(number.numberInInterval(30));
    }

    /**
     * Проверка числа в диапозоне от 25 до 100 -> некорректный аргумент
     */

    @Test
    @DisplayName("Check number in interval - False arg")
    void numberInIntervalFalseTest(){
        assertFalse(number.numberInInterval(17));
    }

    /**
     * Проверка массива корректных аргументов в диапозоне;
     * @param arg = correct array args
     */
    @ParameterizedTest
    @ValueSource(ints = {26,50,80,99})
    @DisplayName("Check number in interval - Correct args")
    void numberInIntervalTrueArgs(int arg){
        assertTrue(number.numberInInterval(arg));
    }

    /**
     * Проверка массива некорректных аргументов в диапозоне;
     * @param arg = correct array args
     */

    @ParameterizedTest
    @ValueSource(ints = {23,24,101,102})
    @DisplayName("Check number in interval - False args")
    void numberInIntervalFalseArgs(int arg){
        assertFalse(number.numberInInterval(arg));
    }

}