package pages;


import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class DragDropPage extends BasePage {

    @FindBy(className="demo-frame")
    private WebElement frame;

    @FindBy(id="draggable")
    private WebElement itemToDrag;

    @FindBy(id="droppable")
    private WebElement target;

    @FindBy(xpath="//*[@id='droppable']/p")
    private WebElement droppableText;

    public DragDropPage(WebDriver driver) {
        super(driver);
    }

    public DragDropPage openDragDropPage() {
        driver.get(Urls.DRAGDROP_URL);
        return this;
    }

    public DragDropPage switchToFrame() {
        driver.switchTo().frame(frame);
        return this;
    }

    public DragDropPage dragAndDrop() {
        Actions actions = new Actions(driver);
        actions
                .clickAndHold(itemToDrag)
                .moveToElement(target)
                .release()
                .build()
                .perform();
        return this;
    }

    public String getResultText() {
        return droppableText.getText();
    }

}
