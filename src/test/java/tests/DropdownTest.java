package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;
import java.util.List;

public class DropdownTest extends BaseTest{

    @Test
    public void DropdownOptionsTest() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        List<WebElement> dropdownOptions = dropdownPage.openDropdownPage().getAllElements();
        String resultOptionsText = "";
        for (WebElement option :
                dropdownOptions) {
            resultOptionsText += option.getText() + " ";
        }
        Assert.assertEquals(resultOptionsText, "Please select an option Option 1 Option 2 ", "Incorrect options text");
        Assert.assertEquals(dropdownOptions.size(), 3, "Incorrect options number");
    }

    @Test
    public void SelectFirstOptionTest() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        List<WebElement> selectedOptions = dropdownPage.openDropdownPage().selectElementByIndex(1).getSelectedOptions();
        String selectedOptionText = "";
        for (WebElement option :
                selectedOptions) {
            selectedOptionText += option.getText();
        }
        Assert.assertEquals(selectedOptionText, "Option 1", "Incorrect option selected");
    }

    @Test
    public void SelectSecondOptionTest() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        List<WebElement> selectedOptions = dropdownPage.openDropdownPage().selectElementByIndex(2).getSelectedOptions();
        String selectedOptionText = "";
        for (WebElement option :
                selectedOptions) {
            selectedOptionText += option.getText();
        }
        Assert.assertEquals(selectedOptionText, "Option 2", "Incorrect option selected");
    }
}
