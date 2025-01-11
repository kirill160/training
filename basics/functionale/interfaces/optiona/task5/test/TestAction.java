package basics.functionale.interfaces.optiona.task5.test;


import basics.functionale.interfaces.optiona.task5.impl.StringComparator;

public class TestAction {
    public static void main(String[] args) {
        StringComparator<String, String> actionStrings = (s, s1) -> {
            String res;
            if (s.length() >= s1.length()) {
                res = s;
            } else {
                res = s1;
            }
            return res;
        };

        String result = actionStrings.apply("value", "number");
        System.out.println("строка длиннее " + result);
    }
}
