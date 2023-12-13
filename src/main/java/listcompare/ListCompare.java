package listcompare;

import java.util.List;

public class ListCompare {
    private List<Integer> listOne;
    private List<Integer> listTwo;

    public ListCompare(List<Integer> listOne, List<Integer> listTwo) {
        this.listOne = listOne;
        this.listTwo = listTwo;
    }

    public static int checkListForVolume(List<Integer> exampleList) throws Exception {
        if (exampleList.isEmpty()) {
            throw new Exception("List is Empty!");
        }
        int count = 0;
        for (int i = 0; i < exampleList.size(); i++) {
            count += exampleList.get(i);
        }
        return count / exampleList.size();
    }

    public static String compareListToCheck(List<Integer> listOne, List<Integer> listTwo) throws Exception {
        int averageValueOne = checkListForVolume(listOne);
        int averageValueTwo = checkListForVolume(listTwo);
        String result;
        if (averageValueOne > averageValueTwo) {
            result = "First List has bigger average value then second!";
        } else if (averageValueOne < averageValueTwo) {
           result = "Second list has bigger average value than first!";
        } else {
            result = "The average values both lists are equal!";
        }
        return result;
    }
}
