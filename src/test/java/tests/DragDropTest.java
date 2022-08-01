package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DragDropPage;

public class DragDropTest extends BaseTest{

    @Test
    public void addRemoveElementsTest() {
        DragDropPage dragDropPage = new DragDropPage(driver);
        String resultText = dragDropPage.openDragDropPage().switchToFrame().dragAndDrop().getResultText();
        Assert.assertEquals(resultText, "Dropped!", "Incorrect result text");
    }
}
