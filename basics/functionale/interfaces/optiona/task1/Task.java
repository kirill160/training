package basics.functionale.interfaces.optiona.task1;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Function;


public class Task {
    public static void main(String[] args) {
        //curryingAddingTwoNumbers(2, 3);
        //curryingCheckStringForRegularExpressions(" ", "\\s");
        //curryingSplitStringForRegularExpressions("we -fwe -fwe -fwee", "\\s-");
        //anagram("кулон", "клоун");

    }

    //1. С помощью каррирования реализовать функцию сложения двух чисел,
//функцию проверки строки на регулярное выражение, функцию разбиения
//строки по регулярному выражению
    public static void curryingAddingTwoNumbers(int value1, int value2) {
        Function<Integer, Function<Integer, Integer>> integerFunction = oneParameter -> twoParameter -> oneParameter + twoParameter;
        System.out.println(integerFunction.apply(value1).apply(value2));

    }

    //функция проверки строки на регулярное выражение
    public static void curryingCheckStringForRegularExpressions(String str, String pattern) {
        Function<String, Predicate<String>> checkRegularExpressions = s -> s::matches;
        System.out.println(checkRegularExpressions.apply(str).test(pattern));
    }

    //функция разбиения строки по регулярному выражению
    public static void curryingSplitStringForRegularExpressions(String str, String pattern) {
        Function<String, Function<String, String[]>> functionSplitString = s -> s::split;
        System.out.println(Arrays.toString(functionSplitString.apply(str).apply(pattern)));
    }

    //2. Определить, являются ли слова анаграммами, т.е. можно ли из одного слова
    //составить другое перестановкой букв.
    public static void anagram(String first, String second) {
        BiPredicate<String, String> findAnagram = (strings, strings2) -> {
            char[] lettersStrings = strings.replaceAll("\\s+", "").toLowerCase().toCharArray();
            char[] lettersStrings2 = strings2.replaceAll("\\s+", "").toLowerCase().toCharArray();
            Arrays.sort(lettersStrings);
            Arrays.sort(lettersStrings2);
            return new String(lettersStrings).equals(new String(lettersStrings2));
        };
        System.out.println(findAnagram.test(first, second));
    }

}