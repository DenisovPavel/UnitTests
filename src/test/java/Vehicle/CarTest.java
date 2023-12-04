package Vehicle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("Volkswagen", "Polo", 2010);
    }

    @AfterEach
    void tearDown() {
        car = null;
    }

    //    - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    @DisplayName("Car instance of Vehicle")
    void checkCarAndVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    //  - проверка того, объект Car создается с 4-мя колесами
    @Test
    @DisplayName("Car has four wheels")
    void checkCarWheelsNumber() {
        assertEquals(4, car.getNumWheels());

    }

    // - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    @DisplayName("Car speed in TestDrive is 60 km")
    void checkCarTestDriveSpeed() {
        assertEquals(60, car.testDrive(),.001);// 3 arg -> предотвратит возможные проблемы с округлением
    }
// - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта)
// машина останавливается (speed = 0)
    @Test
    @DisplayName("Park Test")
    void checkCarSpeedInPark() {
        car.testDrive();
//        int a = 0;
//        assertEquals(car.park(),a);
        car.testDrive();
        assertEquals(0,car.park());
    }
}