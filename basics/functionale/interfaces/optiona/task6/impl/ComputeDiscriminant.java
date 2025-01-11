package basics.functionale.interfaces.optiona.task6.impl;

@FunctionalInterface
public interface ComputeDiscriminant<U extends Double, T extends Double, R extends Double> {
    double calculate(U u, T t, R r);
}
