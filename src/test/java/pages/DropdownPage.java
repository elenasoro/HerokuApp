package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class DropdownPage extends BasePage {

    @FindBy(id = "dropdown")
    private WebElement dropdown;

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public DropdownPage openDropdownPage() {
        driver.get(Urls.DROPDOWN_URL);
        return this;
    }

    public List getAllElements() {
        Select dropDownList = new Select(dropdown);
        List<WebElement> optionsList = dropDownList.getOptions();
        return optionsList;
    }


    public DropdownPage selectElementByIndex(int index) {
        Select select = new Select(dropdown);
        select.selectByIndex(index);
        return this;
    }

    public List getSelectedOptions() {
        Select select = new Select(dropdown);
        return select.getAllSelectedOptions();
    }

}
