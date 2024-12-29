package dastan_test.hard;

import dastan.hard.LargestGap;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LargestGapTest {
    @DataProvider(name = "arrays")
    public Object[][] arrays() {
        return new Object[][] {
                {new int[]{9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5}, 11},
                {new int[]{14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7}, 4},
                {new int[]{13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9}, 2}
        };
    }

    @Test(dataProvider = "arrays")
    public void test(int[] arr, int gap) {
        LargestGap obj = new LargestGap();
        Assert.assertEquals(obj.largestGap(arr), gap);
    }

}
