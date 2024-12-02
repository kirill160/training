package basics.datatype;

import sun.misc.Unsafe;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        //searchLongAndSmallNumber();
        //showNumbers();
        //numbersWithGreaterOrLesserLength();
        numberWithDifferentDigits();

    }

    //Найти самое короткое и самое длинное число. Вывести найденные числа
    //и их длину.
    public static void searchLongAndSmallNumber() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrayInt = new int[n];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = scanner.nextInt();
        }
        String[] numbers = new String[arrayInt.length];
        for (int i = 0; i < arrayInt.length; i++) {
            numbers[i] = String.valueOf(arrayInt[i]);
        }
        int max = numbers[0].length();
        int min = numbers[0].length();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i].length()) {
                max = numbers[i].length();
                count1 = i;
            }
            if (min > numbers[i].length()) {
                min = numbers[i].length();
                count2 = i;
            }
        }
        System.out.println("max length string " + max + " index string " + count1);
        System.out.println("min length string " + min + " index string " + count2);
        scanner.close();
    }

    //Упорядочить и вывести числа в порядке возрастания (убывания) значений
    //их длины.
    public static void showNumbers() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbersInt = new int[n];
        String[] parseNumbers = new String[n];
        for (int i = 0; i < n; i++) {
            numbersInt[i] = scanner.nextInt();
            parseNumbers[i] = String.valueOf(numbersInt[i]);
        }
        Comparator<String> comparator = (o1, o2) -> {
            if (o1.length() > o2.length()) {
                return 1;
            } else if (o1.length() < o2.length()) {
                return -1;
            }
            return 0;
        };
        System.out.println("Array in ascending order");
        Arrays.sort(parseNumbers, comparator);
        for (String str : parseNumbers) {
            System.out.println(str);
        }
        Comparator<String> comparator2 = (String o1, String o2) -> {
            if (o1.length() < o2.length()) {
                return 1;
            } else if (o1.length() > o2.length()) {
                return -1;
            }
            return 0;
        };
        System.out.println("\n" + "Array in descending order");
        Arrays.sort(parseNumbers, comparator2);
        for (String str : parseNumbers) {
            System.out.println(str);
        }
        scanner.close();

    }

    //Вывести на консоль те числа, длина которых меньше (больше) средней,
    //а также длину
    public static void numbersWithGreaterOrLesserLength() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrayInt = new int[n];
        String[] numbers = new String[n];
        int averageLength = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = scanner.nextInt();
            numbers[i] = String.valueOf(arrayInt[i]);
            averageLength += numbers[i].length();
        }
        averageLength /= n;
        System.out.println("average length " + averageLength);
        for (String str : numbers) {
            if (str.length() > averageLength) {
                System.out.println("Number " + str + " string length is " + str.length());
            }
        }
        scanner.close();
    }

    //Найти число, в котором число различных цифр минимально. Если таких
    //чисел несколько, найти первое из них
    public static void numberWithDifferentDigits() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrayInt = new int[n];
        String[] numbers = new String[n];

        for (int i = 0; i < n; i++) {
            arrayInt[i] = scanner.nextInt();
            numbers[i] = String.valueOf(numbers[i]);
        }
    }

}
