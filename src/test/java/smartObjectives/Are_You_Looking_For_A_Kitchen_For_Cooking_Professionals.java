package smartObjectives;

import com.helger.commons.concurrent.ThreadHelper;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Are_You_Looking_For_A_Kitchen_For_Cooking_Professionals {
    static SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();

    @Test(description = "Sandwich Recipe")
    public void GC01(){
        driver.element().click(By.xpath("//a[contains(text(),'محضر الساندوتش')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Juicers")
    public void GC02() {
        driver.element().click(By.xpath("//a[contains(text(),'عصارات')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Coffee Maker")
    public void GC03() {
        driver.element().click(By.xpath("//a[contains(text(),'صانع القهوة')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Food Processor and Perineum")
    public void GC04() {
        driver.element().click(By.xpath("//a[contains(text(),'محضر الطعام و العجان')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @BeforeClass
    public void BeforeClass()
    {
        driver.browser().navigateToURL("https://www.raneen.com");
    }

    @AfterClass
    public void AfterClass()
    {
        driver.quit();

    }
}
