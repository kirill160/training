package basics.oop.optionb.task1.test;

import basics.oop.optionb.task1.fraction.Fraction;

public class TestFraction {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(1,2);
        Fraction fraction1 = new Fraction(1,2);
        Fraction result;
        result = fraction.additionsFractions(fraction1);
        System.out.println(result);
        System.out.println();
        result = fraction.divisionFractions(fraction1);
        System.out.println(result);
        System.out.println();
        result = fraction.multiplicationFractions(fraction1);
        System.out.println(result);
        System.out.println();
        result = fraction.subtractionFractions(fraction1);
        System.out.println(result);
        System.out.println();

    }
}
