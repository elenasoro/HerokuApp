package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotificationMessagePage extends BasePage{

    @FindBy(linkText = "Click here")
    private WebElement clickLink;

    @FindBy(id = "flash")
    private WebElement notification;

    public NotificationMessagePage(WebDriver driver) {
        super(driver);
    }

    public void openNotificationMessagePage() {
        driver.get(Urls.NOTIFICATION_URL);
    }

    public void openNotification() {
        clickLink.click();
    }

    public String getNotificationText() {
        return notification.getText();
    }
}
