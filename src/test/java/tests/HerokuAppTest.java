package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HerokuAppTest extends BaseTest {

    @Test
    public void normalTest() {

        driver.get(Urls.HEROKUAPP_URL);

        //click on Add/Remove Elements link
        driver.findElement(By.linkText("Add/Remove Elements")).click();
        //add 2 elements
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        //delete 1 element
        driver.findElement(By.xpath("//*[@id='elements']/button[1]")).click();
        //get number of remained elements
        int numberOfButtons = driver.findElements(By.xpath("//*[@id='elements']/button")).size();
        Assert.assertEquals(1, numberOfButtons, "Incorrect buttons number");

    }

}
