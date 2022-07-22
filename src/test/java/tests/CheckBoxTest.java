package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {

    @Test
    public void firstCheckboxUncheckedTest() {
        driver.get(Urls.CHECKBOXES_URL);
        boolean isChecked = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")).isSelected();
        Assert.assertFalse(isChecked, "Checkbox is checked");
    }

    @Test
    public void checkFirstCheckboxTest() {
        driver.get(Urls.CHECKBOXES_URL);
        driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")).click();
        boolean isChecked = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")).isSelected();
        Assert.assertTrue(isChecked, "Checkbox is unchecked");
    }

    @Test
    public void secondCheckboxCheckedTest() {
        driver.get(Urls.CHECKBOXES_URL);
        boolean isChecked = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).isSelected();
        Assert.assertTrue(isChecked, "Checkbox is unchecked");
    }

    @Test
    public void checkSecondCheckboxTest() {
        driver.get(Urls.CHECKBOXES_URL);
        driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).click();
        boolean isChecked = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).isSelected();
        Assert.assertFalse(isChecked, "Checkbox is checked");
    }
}
