package Convert_Minutes_into_Seconds;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConvertMinutesIntoSeconds {
    public static int convert(int minutes) {
        return minutes*60;
    }

    @Test
    void test(){
        Assert.assertEquals(convert(2),120);
    }
}
