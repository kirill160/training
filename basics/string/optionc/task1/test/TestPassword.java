package basics.string.optionc.task1.test;

import basics.string.optionc.task1.password.Password;

public class TestPassword {
    public static void main(String[] args) {
        String password = "asd1sdLay_asbc";
        System.out.println(new Password().checkPassword(password));

    }
}
