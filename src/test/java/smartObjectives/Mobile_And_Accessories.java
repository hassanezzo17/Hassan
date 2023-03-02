package smartObjectives;

import com.helger.commons.concurrent.ThreadHelper;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Mobile_And_Accessories {

    static SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();

    @Test(description = "Mobile")
    public void GC01() {
        driver.element().click(By.xpath("//a[contains(text(),'الموبيلات')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Airpods")
    public void GC02() {
        driver.element().click(By.xpath("//a[contains(text(),'ايربودز')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Accessories")
    public void GC03() {
        driver.element().click(By.xpath("//a[contains(text(),'إكسسوارات')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "SmartWatches")
    public void GC04() {
        driver.element().click(By.xpath("//a[contains(text(),'الساعات الذكيه')]"));
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
