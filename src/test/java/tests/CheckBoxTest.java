package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckBoxPage;

public class CheckBoxTest extends BaseTest {

    @Test
    public void firstCheckboxUncheckedTest() {
        CheckBoxPage checkBoxPage = new CheckBoxPage(driver);
        checkBoxPage.openCheckBoxPage();
        boolean isChecked = checkBoxPage.isFirstCheckboxSelected();
        Assert.assertFalse(isChecked, "Checkbox is checked");
    }

    @Test
    public void checkFirstCheckboxTest() {
        CheckBoxPage checkBoxPage = new CheckBoxPage(driver);
        checkBoxPage.openCheckBoxPage();
        checkBoxPage.selectFirstCheckbox();
        boolean isChecked = checkBoxPage.isFirstCheckboxSelected();
        Assert.assertTrue(isChecked, "Checkbox is unchecked");
    }

    @Test
    public void secondCheckboxCheckedTest() {
        CheckBoxPage checkBoxPage = new CheckBoxPage(driver);
        checkBoxPage.openCheckBoxPage();
        boolean isChecked = checkBoxPage.isSecondCheckboxSelected();
        Assert.assertTrue(isChecked, "Checkbox is unchecked");
    }

    @Test
    public void checkSecondCheckboxTest() {
        CheckBoxPage checkBoxPage = new CheckBoxPage(driver);
        checkBoxPage.openCheckBoxPage();
        checkBoxPage.selectSecondCheckbox();
        boolean isChecked = checkBoxPage.isSecondCheckboxSelected();
        Assert.assertFalse(isChecked, "Checkbox is checked");
    }
}
