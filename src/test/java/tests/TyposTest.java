package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TyposTest extends BaseTest{

    @Test
    public void checkTyposTest() {
        driver.get(Urls.TYPOS_URL);
        String expectedText = "Typos\n" +
                "This example demonstrates a typo being introduced. It does it randomly on each page load.\n" +
                "Sometimes you'll see a typo, other times you won't.";
        String actualText = driver.findElement(By.className("example")).getText();
        Assert.assertEquals(expectedText, actualText, "Typo is present");
    }
}
