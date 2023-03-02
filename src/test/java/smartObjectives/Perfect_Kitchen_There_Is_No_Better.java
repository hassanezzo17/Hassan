package smartObjectives;

import com.helger.commons.concurrent.ThreadHelper;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Perfect_Kitchen_There_Is_No_Better {

    static SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();

    @Test(description = "Electric Grills")
    public void GC01() {
        driver.element().click(By.xpath("//img[@data-pb-style='UXIEM9R']"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }
    @Test(description = "Fryers")
    public void GC02() {
        driver.element().click(By.xpath("//img[@data-pb-style='RUXBMB6']"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Kettles")
    public void GC03() {
        driver.element().click(By.xpath("//img[@data-pb-style='XCAY60P']"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }
    @Test(description = "Toaster")
    public void GC04() {
        driver.element().click(By.xpath("//img[@data-pb-style='I6YR0DK']"));
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
