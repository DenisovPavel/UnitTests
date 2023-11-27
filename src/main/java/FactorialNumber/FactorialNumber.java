package FactorialNumber;

public class FactorialNumber {

// 1! =  1
// 2! =  1 * 2 = 2
// 3! =  1 * 2 * 3 = 6
// 4! =  1 * 2 * 3 * 4 = 24
// 5! =  1 * 2 * 3 * 4 * 5  = 120

    public int getFactorial(int f) {
        int result = 1;
        if (f < 0) {
            throw new IllegalArgumentException("Your number can not be negative!\n");
        }

        if (f == 0) {
            return 1;
        }
        if (f == 1) {
            return 1;
        } else {
            for (int i = 1; i <= f; i++) {
                result = result * i;
            }
        }
        return result;
    }

}
