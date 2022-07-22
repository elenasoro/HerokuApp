package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NotificationMessagePage;

public class NotificationMessageTest extends BaseTest{

    @Test
    public void notificationMessageTest() {
        NotificationMessagePage notificationMessagePage = new NotificationMessagePage(driver);
        notificationMessagePage.openNotificationMessagePage();
        notificationMessagePage.openNotification();
        String expectedNotificationMessage = "Action successful\n" + "×";
        String actualNotificationMessage = notificationMessagePage.getNotificationText();
        Assert.assertEquals(expectedNotificationMessage, actualNotificationMessage, "Incorrect notification message");
    }
}
