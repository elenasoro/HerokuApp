package pages;

import constants.Urls;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddRemovePage extends BasePage{

    @FindBy(xpath="//button[text()='Add Element']")
    private WebElement addButton;

    @FindBy(xpath="//*[@id='elements']/button[1]")
    private WebElement deleteButton;

    @FindBy(xpath = "//*[@id='elements']/button")
    private List<WebElement> deleteButtons;

    public AddRemovePage(WebDriver driver) {
        super(driver);
    }

    public void openAddRemovePage() {
        driver.get(Urls.ADDREMOVE_URL);
    }

    public void addElement() {
        addButton.click();
    }

    public void removeElement() {
        deleteButton.click();
    }

    public int countNumberOfButtons() {
        return deleteButtons.size();
    }
}
