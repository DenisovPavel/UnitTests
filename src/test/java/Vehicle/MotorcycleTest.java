package Vehicle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {
    private Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 1999);
    }

    @AfterEach
    void tearDown() {
        motorcycle = null;
    }

    //- проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    @DisplayName("Motocycle has 2 wheels")
    void checkMotocycleWheels() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    // - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    @DisplayName("Motocycle speed TestDrive is 75")
    void checkMotoSpeedTestDrive() {
        assertEquals(75, motorcycle.testDrive(),.001);// 3 arg -> предотвратит возможные проблемы с округлением
    }

    //- проверить, что в режиме парковки (сначала testDrive,
    // потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)

    @Test
    @DisplayName("Park Test")
    void checkMotocycleSpeedInPark() {
        motorcycle.testDrive();
        int a = 0;
        assertEquals(motorcycle.park(), a);
    }

}