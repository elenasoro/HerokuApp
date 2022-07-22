package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRemovePage;

public class AddRemoveTest extends BaseTest{
    @Test
    public void addRemoveElementsTest() {
        AddRemovePage addRemovePage = new AddRemovePage(driver);
        addRemovePage.openAddRemovePage();
        addRemovePage.addElement();
        addRemovePage.addElement();
        addRemovePage.removeElement();
        int numberOfButtons = addRemovePage.countNumberOfButtons();
        Assert.assertEquals(1, numberOfButtons, "Incorrect buttons number");
    }
}
