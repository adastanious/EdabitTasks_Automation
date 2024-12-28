package dastan_test.hard;

import dastan.hard.ValidatePin;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValidatePinTest {

    @DataProvider(name = "Pins List")
    public Object[][] pinsList() {
        return new Object[][] {
                {"121317", true},
                {"1234", true},
                {"45135", false},
                {"89abc1", false},
                {"900876", true},
                {" 4983", false}
        };
    }

    @Test(dataProvider = "Pins List")
    public void test(String pin, boolean result) {
        ValidatePin obj = new ValidatePin();
        Assert.assertEquals(obj.validate(pin),result);
    }
}
