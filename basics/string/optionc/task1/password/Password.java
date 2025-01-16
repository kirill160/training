package basics.string.optionc.task1.password;



import java.util.regex.Pattern;

public class Password {
    public boolean checkPassword(String password) {
        return Pattern.compile("^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])[A-Za-z_0-9]{10,}").matcher(password).matches();
    }
}
