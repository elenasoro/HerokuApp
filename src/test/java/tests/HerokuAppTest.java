package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collection;
import java.util.Set;

public class HerokuAppTest extends BaseTest {

    @Test
    public void addRemoveElementsTest() {

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

    @Test
    public void tableTest() {

        driver.get(Urls.HEROKUAPP_URL);

        //click on Tables link
        driver.findElement(By.linkText("Sortable Data Tables")).click();
        //add 2 elements
        String lastName = driver.findElement(By.xpath("//*[@id='table1']/tbody/tr[2]/td[1]")).getText();
        String firstName = driver.findElement(By.xpath("//*[@id='table1']/tbody/tr[2]/td[2]")).getText();
        String due = driver.findElement(By.xpath("//*[@id='table2']/tbody/tr[2]/td[4]")).getText();
        String webSite = driver.findElement(By.xpath("//*[@id='table2']/tbody/tr[2]/td[5]")).getText();

        Assert.assertEquals("Bach", lastName, "Incorrect last name");
        Assert.assertEquals("Frank", firstName, "Incorrect first name");
        Assert.assertEquals("$51.00", due, "Incorrect due");
        Assert.assertEquals("http://www.frank.com", webSite, "Incorrect web site");
    }

}
