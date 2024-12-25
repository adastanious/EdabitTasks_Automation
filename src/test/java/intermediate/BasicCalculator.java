package intermediate;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicCalculator {

    public int calculator(int num1, char operator, int num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                // according to the notes "If the input tries to divide by 0, return 0."
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
     void test1(){
        Assert.assertEquals(calculator(2,'+',2),4);

    }

    @Test
    void test2(){
        Assert.assertEquals(calculator(2,'*',2),4);

    }

    @Test
    void test3(){
        Assert.assertEquals(calculator(4,'/',2),2);

    }

    @Test
    void test4() {
        Assert.assertEquals(calculator(4, '-', 1), 3);
    }


    @Test
    void test5() {
            Assert.assertEquals(calculator(4, '/', 0), 0);
    }


}
