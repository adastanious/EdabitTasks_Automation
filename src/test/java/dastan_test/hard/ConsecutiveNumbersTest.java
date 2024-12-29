package dastan_test.hard;

import dastan.hard.ConsecutiveNumbers;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ConsecutiveNumbersTest {
    @DataProvider (name = "cons numbers")
    public Object[][] consNumbers() {
        return new Object[][] {
                {new int[]{5, 1, 4, 3, 2}, true},
                {new int[]{5, 1, 4, 3, 2, 8}, false},
                {new int[]{5, 6, 7, 8, 9, 9}, false},
        };
    }

    @Test(dataProvider = "cons numbers")
    public void test(int[] nums, boolean result) {
        ConsecutiveNumbers obj = new ConsecutiveNumbers();
        Assert.assertEquals(obj.cons(nums),result);
    }
}
