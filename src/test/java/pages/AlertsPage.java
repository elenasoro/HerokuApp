package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.FakeMessageGenerator;

public class AlertsPage extends BasePage{

    @FindBy(xpath="//button[text()='Click for JS Alert']")
    private WebElement jsAlertButton;

    @FindBy(xpath="//button[text()='Click for JS Confirm']")
    private WebElement jsConfirmButton;

    @FindBy(xpath="//button[text()='Click for JS Prompt']")
    private WebElement jsPromptButton;

    @FindBy(id="result")
    private WebElement resultText;

    String text = FakeMessageGenerator.generateText();

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public AlertsPage openAlertsPage() {
        driver.get(Urls.ALERTS_URL);
        return this;
    }

    public AlertsPage openAlert() {
        jsAlertButton.click();
        return this;
    }

    public AlertsPage openConfirm() {
        jsConfirmButton.click();
        return this;
    }

    public AlertsPage openPrompt() {
        jsPromptButton.click();
        return this;
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    public AlertsPage acceptAlert() {
        driver.switchTo().alert().accept();
        return this;
    }

    public AlertsPage dismissAlert() {
        driver.switchTo().alert().dismiss();
        return this;
    }

    public AlertsPage enterText() {
        driver.switchTo().alert().sendKeys(text);
        return this;
    }

    public boolean isTextCorrect() {
        return resultText.getText().equals("You entered: ".concat(text));
    }

}
