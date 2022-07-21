package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessageTest extends BaseTest{

    @Test
    public void notificationMessageTest() {
        driver.get(Urls.NOTIFICATION_URL);
        driver.findElement(By.linkText("Click here")).click();
        String expectedNotificationMessage = "Action successful\n" + "×";
        String actualNotificationMessage = driver.findElement(By.id("flash")).getText();
        Assert.assertEquals(expectedNotificationMessage, actualNotificationMessage, "Incorrect notification message");
    }
}
