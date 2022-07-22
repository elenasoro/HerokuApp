package pages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputsPage extends BasePage{

    @FindBy(tagName = "input")
    private WebElement input;


    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public void openInputsPage() {
        driver.get(Urls.INPUTS_URL);
    }

    public void sendUpKey() {
        input.sendKeys(Keys.UP);
    }

    public void sendDownKey() {
        input.sendKeys(Keys.DOWN);
    }

    public String getInputValue() {
        return input.getAttribute("value");
    }
}
