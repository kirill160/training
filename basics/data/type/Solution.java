package basics.data.type;

import java.util.*;


public class Solution {
    public static void main(String[] args) {
        //searchLongAndSmallNumber();
        //showNumbers();
        //numbersWithGreaterOrLesserLength();
        //numberWithDifferentDigits();
        //tableMultiplication();
        //arrayElementsInReverseOrder();
        //amountZeroInNumber();
        //findTheBaseOfTheNumber();
        //conversionToADifferentSystemOfCalculus(1997);
        //orderedArrayValues(4);
        //sortArray();



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
        System.out.println("\n" + "Array in ascending order");
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
        System.out.println("Array in descending order");
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
        Map<String, Integer> integerHashMap = new HashMap<>();
        Map<String, Integer> resultHashMap = new HashMap<>();
        String[] strings = new String[n];
        int[] ints = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextInt();
            strings[i] = String.valueOf(ints[i]);
            integerHashMap.put(strings[i], i);
        }
        char[] chars2;
        for (Map.Entry<String, Integer> m : integerHashMap.entrySet()) {
            chars2 = m.getKey().toCharArray();
            int lengthArray = chars2.length;
            for (int i = 0; i < chars2.length; i++) {
                if (chars2[i] != chars2[--lengthArray]) {
                    count++;
                }

            }
            resultHashMap.put(m.getKey(), count);
            count = 0;
        }
        scanner.close();
        SortedMap<String, Integer> sortedMap = new TreeMap<>(resultHashMap);
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(sortedMap.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        SortedMap<String, Integer> newSortedMap = new TreeMap<>();

        for (Map.Entry<String, Integer> m : entryList) {
            newSortedMap.put(m.getKey(), m.getValue());
        }


        System.out.println("\n" + "число " + newSortedMap.firstKey());
    }

    // Найти количество чисел, содержащих только четные цифры, а среди них — количество чисел с равным числом четных и нечетных цифр.
    //
    //Вывести на экран таблицу умножения.
    public static void tableMultiplication() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                int result = i * j;
                System.out.println(i + "*" + j + " = " + result);

            }
            System.out.println();
        }

    }

    //Вывести элементы массива в обратном порядке
    public static void arrayElementsInReverseOrder() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (10 + Math.random() * 150);
        }
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);

        }
        scanner.close();
    }

    //Определить принадлежность некоторого значения k интервалам (n, m], [n, m), (n, m), [n, m].
    public static void determineValueByInterval() {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String result = "value k determinate by interval";

        if (n < k && k <= m) {
            System.out.println(result);
        }
        if (n <= k && k < m) {
            System.out.println(result);
        }
        if (n < k && k < m) {
            System.out.println(result);
        }
        if (n <= k && k <= n) {
            System.out.println(result);
        }
    }

    //Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.
    public static void showNumbersWithoutRemainder() {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    //Сколько значащих нулей в двоичной записи числа 129?
    public static int amountZeroInNumber() {
        int number = 129;
        String binaryString = Integer.toBinaryString(number);
        char[] digits = binaryString.toCharArray();
        int count = 0;
        for (char ch : digits) {
            if (ch == '0') {
                count++;
            }
        }
        return count;
    }

    //В системе счисления с некоторым основанием десятичное число 81 записывается в виде 100. Найти это основание.
    public static int findTheBaseOfTheNumber() {
        int number = 81;
        int x = 1;
        int power = (int) (1 * Math.pow(x, 2) + 0 * Math.pow(x, 1) + 0 * Math.pow(x, 0));
        x = (int) Math.sqrt(number);
        return x;

    }

    //Написать код программы, которая бы переводила числа из десятичной системы счисления в любую другую
    public static void conversionToADifferentSystemOfCalculus(int n) {
        System.out.println("Двоичная");
        String numbers = Integer.toBinaryString(n);
        System.out.println(numbers + "\n");
        System.out.println("восьмеричная");
        String numbers2 = Integer.toOctalString(n);
        System.out.println(numbers2 + "\n");
        System.out.println("шестнадцатиричная");
        String numbers3 = Integer.toHexString(n);
        System.out.println(numbers3);
        int number = Integer.parseInt(numbers, 2);
        System.out.println(number);
    }

    //Вариант С
    //Ввести с консоли n-размерность матрицы a[n][n]. Задать значения элементов матрицы в интервале значений от -n до n с помощью генератора случайных
    //чисел.Упорядочить строки (столбцы) матрицы в порядке возрастания значений
    //элементов k-го столбца (строки)
    public static void orderedArrayValues(int k) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        boolean swapped = false;
        int[][] array = new int[n][n];

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) ((Math.random() * (n + n)) - n);

            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");

            }
            System.out.println();
        }

        int[] digitsArray = new int[n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == k) {
                    digitsArray[count++] = array[i][j];

                }
            }
        }
        System.out.println();
        while (!swapped) {
            swapped = true;
            for (int i = 0; i < digitsArray.length - 1; i++) {
                if (digitsArray[i] > digitsArray[i + 1]) {
                    int temp = digitsArray[i];
                    digitsArray[i] = digitsArray[i + 1];
                    digitsArray[i + 1] = temp;
                    swapped = false;
                }

            }
        }

        System.out.println();

        int[][] result = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[i][j] = array[i][j]; // здесь я сразу заполняю новый массив только не с отсортированным столбцом
            }

        }
        for (int i = 0; i < array.length; i++) {
            result[0][k] = digitsArray[i]; //здесь я уже меня этот столбец на отсортированный
            System.out.print(result[0][k]);
        }
        System.out.println();

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "   ");
            }
            System.out.println();
        }

    } // это и следующее доделать позже
    public static void sortArray(int k) {
        int array[][] = {
                {1, 7, 9, 3},
                {4, 3, 2, 8},
                {3, 3, 7, 5},
                {1, 6, 1, 6}
        };
        //        boolean swapped2 = false;
//        int[][] array2 = new int[4][4];
//        int s = 1;
//        for (int i = 0; i < array2.length; i++) {
//            array2[0][i] = array[0][s];
//        }
//        for (int i = 0; i < array2.length; i++) {
//        }

//        boolean swapped = false;
//        while (!swapped) {
//            swapped = true;
//            for (int i = 0; i < array.length; i++) {
//                for (int j = 0; j < array[i].length - 1; j++) {
//                    if (array[i][j] > array[i][j]) {
//                        int temp = array[i][j];
//                        array[i][j] = array[i + 1][j];
//                        array[i + 1][j] = temp;
//                        swapped = false;
//                    }
//                }
//            }
//        }

//        Comparator<int[]> cmp = (a, b) -> {
//            return IntStream.range(0, Math.min(a.length, b.length)).filter(i ->Integer.compare(a[i], b[i]) != 0)
//                    .findFirst()
//                    .orElseGet(() -> Integer.compare(a.length, b.length));
//        };
        int length = array[k].length;
        Integer[] indexs = new Integer[k];
        for (int i = 0; i < length; i++) {
            indexs[i] = i;
        }
        Arrays.sort(array, Comparator.comparingInt( row-> row[k]));

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
    //доделать

}





