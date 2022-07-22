package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage extends BasePage{

    @FindBy(xpath = "//form[@id='checkboxes']/input[1]")
    private WebElement firstCheckbox;

    @FindBy(xpath = "//form[@id='checkboxes']/input[2]")
    private WebElement secondCheckbox;

    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    public void openCheckBoxPage() {
        driver.get(Urls.CHECKBOXES_URL);
    }

    public boolean isFirstCheckboxSelected() {
        return firstCheckbox.isSelected();
    }

    public boolean isSecondCheckboxSelected() {
        return secondCheckbox.isSelected();
    }

    public void selectFirstCheckbox() {
        firstCheckbox.click();
    }

    public void selectSecondCheckbox() {
        secondCheckbox.click();
    }
}
