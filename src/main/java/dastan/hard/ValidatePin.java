package dastan.hard;

public class ValidatePin {
    public boolean validate(String pin) {
        if (pin.length() == 4 || pin.length() == 6) {
            for (int i = 0; i < pin.length(); i++) {
                if (!Character.isDigit(pin.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
