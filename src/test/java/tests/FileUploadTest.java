package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTest extends BaseTest{

    @Test
    public void FileUploadTest() {
        FileUploadPage fileUploadPage = new FileUploadPage(driver);
        String confirmationText = fileUploadPage.openFileUploadPage().chooseFile().uploadFile().getConfirmationText();
        Assert.assertEquals(confirmationText, "panda.jpeg", "Incorrect file uploaded");
    }
}
