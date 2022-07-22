package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TyposPage extends BasePage{

    @FindBy(className = "example")
    private WebElement text;

    public TyposPage(WebDriver driver) {
        super(driver);
    }

    public void openTyposPage(){
        driver.get(Urls.TYPOS_URL);
    }

    public String getText() {
        return text.getText();
    }
}
