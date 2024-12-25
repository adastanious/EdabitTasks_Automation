package intermediate;

import org.testng.annotations.Test;

public class BasicCalculator {

    public static int calculator(int num1, char operator, int num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    return 0;
                } else {
                    return num1 / num2;
                }
            default:
                return 0;
        }
    }

    @Test

}
