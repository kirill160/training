package basics.functionale.interfaces.optiona.task4.impl;


@FunctionalInterface
public interface CheckNumber<T extends Number> {

    boolean test(T t);

}
