package AretheNumbersEqual;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AretheNumbersEqual {
    public static boolean isSameNum(int x, int y) {
        if (x == y){
            return true;
        }
        return false;
    }

    @Test
    void test3 (){
        Assert.assertTrue(isSameNum(5,5));
    }
}