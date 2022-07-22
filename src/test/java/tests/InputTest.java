package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputTest extends BaseTest{

    @Test
    public void enterPositiveNumberTest() {
        driver.get(Urls.INPUTS_URL);
        driver.findElement(By.tagName("input")).sendKeys(Keys.UP);
        driver.findElement(By.tagName("input")).sendKeys(Keys.UP);
        String numberEntered = driver.findElement(By.tagName("input")).getAttribute("value");
        Assert.assertEquals("2", numberEntered, "Incorrect number");
    }

    @Test
    public void enterNegativeNumberTest() {
        driver.get(Urls.INPUTS_URL);
        driver.findElement(By.tagName("input")).sendKeys(Keys.DOWN);
        driver.findElement(By.tagName("input")).sendKeys(Keys.DOWN);
        String numberEntered = driver.findElement(By.tagName("input")).getAttribute("value");
        Assert.assertEquals("-2", numberEntered, "Incorrect number");
    }

    @Test
    public void enterZeroNumberTest() {
        driver.get(Urls.INPUTS_URL);
        driver.findElement(By.tagName("input")).sendKeys(Keys.DOWN);
        driver.findElement(By.tagName("input")).sendKeys(Keys.UP);
        String numberEntered = driver.findElement(By.tagName("input")).getAttribute("value");
        Assert.assertEquals("0", numberEntered, "Incorrect number");
    }
}
