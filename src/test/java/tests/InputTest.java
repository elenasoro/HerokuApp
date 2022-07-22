package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InputsPage;

public class InputTest extends BaseTest{

    @Test
    public void enterPositiveNumberTest() {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.sendUpKey();
        inputsPage.sendUpKey();
        String numberEntered = inputsPage.getInputValue();
        Assert.assertEquals("2", numberEntered, "Incorrect number");
    }

    @Test
    public void enterNegativeNumberTest() {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.sendDownKey();
        inputsPage.sendDownKey();
        String numberEntered = inputsPage.getInputValue();
        Assert.assertEquals("-2", numberEntered, "Incorrect number");
    }

    @Test
    public void enterZeroNumberTest() {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.sendDownKey();
        inputsPage.sendUpKey();
        String numberEntered = inputsPage.getInputValue();
        Assert.assertEquals("0", numberEntered, "Incorrect number");
    }
}
