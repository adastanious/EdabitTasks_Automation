package dastan.hard;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ShuffleTheNameTest {
    @DataProvider(name = "user name")
    public Object[][] userName() {
        return new Object[][] {
                {"Donald Trump", "Trump Donald"},
                {"Rosie O'Donnell", "O'Donnell Rosie"},
                {"Seymour Butts", "Butts Seymour"}
        };
    }

    @Test(dataProvider = "user name")
    public void test(String str, String result) {
        ShuffleTheName obj = new ShuffleTheName();
        Assert.assertEquals(obj.nameShuffle(str),result);
    }
}
