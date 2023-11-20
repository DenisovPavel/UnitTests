import org.junit.Test;
import org.junit.jupiter.api.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.*;




public class TaskOneTest {

//    @Test
//    public void testMethod() {
//        assertEquals(5, 2 + 3);
//    }

//    @BeforeEach
//    public void setup() {
//        // Инициализация ресурсов
//    }
//
//    @AfterEach
//    public void teardown() {
//        // Очистка ресурсов
//    }

//    @BeforeAll
//    public static void globalSetup() {
//        // Инициализация
//    }
//
//    @AfterAll
//    public static void globalTeardown() {
//        // Очистка
//    }
//
//    @Test
//    @DisplayName("Тест суммирования")
//    public void testSum() {
//        assertEquals(5, 2 + 3);
//    }
//
    @Test
    public void testMethod() {
        assertEquals(5, 2 + 3);
    }


    @Test
    @BeforeAll
    public void globalSetup() {
        // Инициализация
    }

    @Test
    @AfterAll
    public void globalTeardown() {
        // Очистка
    }

    @Test
    @DisplayName("Test summarize")
    public void testSum() {
        assertEquals(5, 2 + 3);
    }




}