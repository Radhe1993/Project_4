package browserfactory;

import org.openqa.selenium.By;

public class Utility extends BaseTest{

        public void mousehover(By by) {
            driver.findElement(by).click();
        }
        public void sendTextToElement(By by,String text)
        {
            driver.findElement(by).sendKeys(text);
        }
        public void   clickOnElement(By by)
        {
            driver.findElement(by).click();
        }

    }

