package Return_the_Sum_of_Two_Numbers;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReturnTheSumOfTwoNumbers {

        public static int sum(int a, int b) {
            return a + b;
        }

        @Test
    void test(){
            Assert.assertEquals(sum(5,5), 10);
        }

}
