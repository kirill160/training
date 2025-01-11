package basics.functionale.interfaces.optiona.task3.test;

import basics.functionale.interfaces.optiona.task3.user.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class TestUser {
    public static void main(String[] args) {
        User[] users = new User[]{new User("Wasil", 23, "Germany"), new User("Maria", 24, "Italia"), new User("Rihanna", 35, "USA"), new User("JayZ", 27, "Russia")};
        //сортировка по стране и по возрасту
        Comparator<User> userComparator = Comparator.comparing(User::getCountry).thenComparing(User::getYearsOld);
        Arrays.stream(users)
                .sorted(userComparator)
                .forEach(System.out::println);
        System.out.println();
        //Выбрать всех пользователей старше заданного возраста
        Predicate<User> userPredicate = user -> user.getYearsOld() > 27;
        Arrays.stream(users)
                .filter(userPredicate)
                .forEach(System.out::println);
        System.out.println();
        //первая буква имени у которых начинается с заданной буквы.
        Arrays.stream(users)
                .filter(s -> s.getName().startsWith("m") || s.getName().startsWith("M"))
                .forEach(System.out::println);
        System.out.println();
        //Получить максимальный и минимальный элемент в сгруппированном результате по возрасту
        User userMinYearsOld = Arrays.stream(users)
                .min(Comparator.comparing(User::getYearsOld))
                .get();
        User userMaxYearsOld = Arrays.stream(users)
                .max(Comparator.comparing(User::getYearsOld))
                .get();
        System.out.println("Минимальный возраст " + userMinYearsOld.getYearsOld() + " " + "Максимальный возраст " + userMaxYearsOld.getYearsOld() + '\n');
    }

}
