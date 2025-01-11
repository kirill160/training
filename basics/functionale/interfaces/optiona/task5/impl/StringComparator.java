package basics.functionale.interfaces.optiona.task5.impl;

@FunctionalInterface
public interface StringComparator<U extends String, T extends  String> {
     String apply(T t, U u);
}
