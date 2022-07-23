package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TablesPage extends BasePage{

    @FindBy(xpath = "//*[@id='table1']/tbody/tr[2]/td[1]")
    private WebElement lastName;

    @FindBy(xpath = "//*[@id='table1']/tbody/tr[2]/td[2]")
    private WebElement firstName;

    @FindBy(xpath = "//*[@id='table2']/tbody/tr[2]/td[4]")
    private WebElement due;

    @FindBy(xpath = "//*[@id='table2']/tbody/tr[2]/td[5]")
    private WebElement webSite;

    public TablesPage(WebDriver driver) {
        super(driver);
    }

    public void openTablesPage() {
        driver.get(Urls.TABLES_URL);
    }

    public String getLastName() {
        return lastName.getText();
    }

    public String getFirstName() {
        return firstName.getText();
    }

    public String getDue() {
        return due.getText();
    }

    public String getWebsite() {
        return webSite.getText();
    }
}
