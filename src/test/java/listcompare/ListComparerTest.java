package listcompare;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListCompareTest {
    List<Integer> listOne;
    List<Integer> listTwo;
    List<Integer> listThree;
    List<Integer> listFour;
    List<Integer> listFive;
    ListCompare listCompareOne;
    ListCompare listCompareTwo;

    @BeforeEach
    void setUp() {
        listOne = List.of(1, 2, 3, 4, 5);
        listTwo = List.of(1, 2, 3, 4, 6);
        listThree = List.of(10, 20, 30, 40, 50);
        listFour = List.of(10, 20, 30, 40, 50);
        listFive = new ArrayList<>();
    }

    @AfterEach
    void tearDown() {
        listOne = null;
        listTwo = null;
        listThree = null;
        listFour = null;
        listFive = null;
    }

    @Test
    @DisplayName("Check for empty List")
    void checkListForVolumeTest() {
        Exception result = assertThrows(Exception.class, () -> listCompareOne.checkListForVolume(listFive));
        assertTrue(result.getMessage().contains("List is Empty!"));
    }

    @Test
    @DisplayName("Check for equal Lists")
    void compareListToCheckTest() throws Exception {
       String expectedResult = "The average values both lists are equal!";
       assertEquals(expectedResult, listCompareTwo.compareListToCheck(listThree, listFour));
    }

    @Test
    @DisplayName("First list average value bigger than second!")
    void compareListToCheckTestTwo()throws Exception {
        assertEquals("First List has bigger average value then second!",
                                                                listCompareOne.compareListToCheck(listThree, listOne));
    }

    @Test
    @DisplayName("Second list average value bigger than first!")
    void compareListToCheckTestThree()throws Exception {
        assertEquals("Second list has bigger average value than first!",
                listCompareOne.compareListToCheck(listOne, listThree));
    }
}