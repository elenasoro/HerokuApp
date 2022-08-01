package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage extends BasePage{

    @FindBy(id = "file-upload")
    private WebElement chooseFileButton;

    @FindBy(id = "file-submit")
    private WebElement uploadButton;

    @FindBy(id = "uploaded-files")
    private WebElement confirmationText;

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public FileUploadPage openFileUploadPage() {
        driver.get(Urls.FILEUPLOAD_URL);
        return this;
    }

    public FileUploadPage chooseFile() {
        String path = System.getProperty("user.dir").concat("/src/test/resources/panda.jpeg");
        chooseFileButton.sendKeys(path);
        return this;
    }

    public FileUploadPage uploadFile() {
        uploadButton.click();
        return this;
    }

    public String getConfirmationText() {
        return confirmationText.getText().trim();
    }
}
