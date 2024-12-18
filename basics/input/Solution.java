package basics.input;

import java.util.Arrays;

import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

//        inputNumbers();
//        greatestAndLeastValues();
//        numbersDivisionByThreeOrNein();
//        numbersDivisionByFiveOrSeven();
//        showNotTheSameNumbers();
//        primeNumbers();
//        sortedNumbersInAscendingAndDescendingOrder();
    }

    //Ввести с консоли n целых чисел. На консоль вывести:
    //1. Четные и нечетные числа
    public static void inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int[] array = new int[amount];
        for (int i = 0; i < amount; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("the value is positive " + array[i]);
            } else if (array[i] % 2 != 0) {
                System.out.println("the value is negative " + array[i]);
            }
        }
        scanner.close();
    }

    //2. Наибольшее и наименьшее число.
    public static void greatestAndLeastValues() {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int[] array = new int[amount];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int maxValue = array[0];
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        System.out.println("maxValue " + maxValue);
        System.out.println("minValue " + minValue);

        scanner.close();

    }

    //Числа, которые делятся на 3 или на 9
    public static void numbersDivisionByThreeOrNein() {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int[] array = new int[amount];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0 || array[i] % 9 == 0) {
                System.out.println(array[i]);
            }
        }
        scanner.close();
    }

    //Числа, которые делятся на 5 или на 7
    public static void numbersDivisionByFiveOrSeven() {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int[] array = new int[amount];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0 || array[i] % 7 == 0) {
                System.out.println(array[i]);
            }
        }
        scanner.close();
    }

    //Все трехзначные числа, в десятичной записи которых нет одинаковых
    //цифр
    public static void showNotTheSameNumbers() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 10; k++) {
                    if (i != j && j != k && k != i) {
                        System.out.println("" + i + j + k);
                    }
                }
            }
        }
    }

    //Простые числа
    public static void primeNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean prime = number % 2 != 0 && number % 3 != 0 && number % 5 != 0;
        if (prime) {
            System.out.println(number + " is a prime");
        } else {
            System.out.println(number + " is not a prime");
        }
        scanner.close();
    }
    //Отсортированные числа в порядке возрастания и убывания.
    public static void sortedNumbersInAscendingAndDescendingOrder() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Integer[] arrayNumber = new Integer[number];
        for (int i = 0; i < number; i++) {
            arrayNumber[i] = scanner.nextInt();
        }

        Arrays.sort(arrayNumber);
        System.out.println("numbers in ascending order");
        for (Integer numbers : arrayNumber) {
            System.out.println(numbers);
        }
        System.out.println("numbers in descending order");
        Arrays.sort(arrayNumber, Collections.reverseOrder());
        for (Integer numberTwo : arrayNumber) {
            System.out.println(numberTwo);
        }
        scanner.close();

    }
}


