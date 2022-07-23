package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TablesPage;

public class TableTest extends BaseTest{

    @Test
    public void tableTest() {
        TablesPage tablesPage = new TablesPage(driver);
        tablesPage.openTablesPage();
        String lastName = tablesPage.getLastName();
        String firstName = tablesPage.getFirstName();
        String due = tablesPage.getDue();
        String webSite = tablesPage.getWebsite();

        Assert.assertEquals("Bach", lastName, "Incorrect last name");
        Assert.assertEquals("Frank", firstName, "Incorrect first name");
        Assert.assertEquals("$51.00", due, "Incorrect due");
        Assert.assertEquals("http://www.frank.com", webSite, "Incorrect web site");
    }
}
