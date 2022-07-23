package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TyposPage;

public class TyposTest extends BaseTest{

    @Test
    public void checkTyposTest() {
        TyposPage typosPage = new TyposPage(driver);
        typosPage.openTyposPage();
        String expectedText = "Typos\n" +
                "This example demonstrates a typo being introduced. It does it randomly on each page load.\n" +
                "Sometimes you'll see a typo, other times you won't.";
        String actualText = typosPage.getText();
        Assert.assertEquals(expectedText, actualText, "Typo is present");
    }
}
