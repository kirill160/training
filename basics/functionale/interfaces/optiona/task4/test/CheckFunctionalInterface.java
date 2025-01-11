package basics.functionale.interfaces.optiona.task4.test;

import basics.functionale.interfaces.optiona.task4.impl.CheckNumber;

public class CheckFunctionalInterface {
    public static void main(String[] args) {
        CheckNumber<Integer> checkNumber = integer -> integer % 13 == 0;
        System.out.println(checkNumber.test(13));
    }
}
