package TDD;

public class Number {

    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
    int number;

    public Number() {
        this.number = number;
    }

    public static boolean evenOddNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    // HW 3.2. Нужно написать метод который проверяет,
    // попадает ли переданное число в интервал (25;100)
    // и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%

    public static boolean numberInInterval(int number) {
        if (number > 25 && number < 100) {return true;}
        return false;
    }
}
