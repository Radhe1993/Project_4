package testsuite;

import browserfactory.Utility;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginTest extends Utility
{
    @Before
    public void setUrl()
    {
        openBrowser();
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {

        sendTextToElement(By.id("user-name"),"standard_user");
        sendTextToElement(By.id("password"),"secret_sauce");
        driver.findElement(By.xpath("//input[@id = 'login-button']")).click();
        String expectedtext = "Products";

    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        sendTextToElement(By.id("user-name"),"standard_user");
        sendTextToElement(By.id("password"),"secret_sauce");
        clickOnElement(By.xpath("//input[@id = 'login-button']"));
        List<WebElement> elementlist = driver.findElements(By.className("inventory_item"));
        System.out.println("Total Product are " + elementlist.size());
    }
    @After
    public void close()
    {
        closeBrowser();
    }
}
