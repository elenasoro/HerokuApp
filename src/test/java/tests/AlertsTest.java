package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertsTest extends BaseTest{

    @Test
    public void AlertTextTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        String alertText = alertsPage.openAlertsPage().openAlert().getAlertText();
        alertsPage.acceptAlert();
        Assert.assertEquals(alertText, "I am a JS Alert", "Incorrect alert text");
    }

    @Test
    public void ConfirmAlertTextTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        String alertText = alertsPage.openAlertsPage().openConfirm().getAlertText();
        alertsPage.dismissAlert();
        Assert.assertEquals(alertText, "I am a JS Confirm", "Incorrect alert text");
    }

    @Test
    public void PromptTextTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        boolean isTextCorrect = alertsPage.openAlertsPage().openPrompt().enterText().acceptAlert().isTextCorrect();
        Assert.assertTrue(isTextCorrect, "Incorrect text");
    }
}
