package basics.functionale.interfaces.optiona.task6.test;

import basics.functionale.interfaces.optiona.task6.impl.ComputeDiscriminant;

public class TestDiscriminant {
    public static void main(String[] args) {
        ComputeDiscriminant<Double, Double, Double> computeDiscriminant = (b, a, c) -> Math.pow(b, 2) - 4 * a * c;
        int res = (int)computeDiscriminant.calculate(5.0, 5.0, 5.0);
        System.out.println(res);
    }

}
