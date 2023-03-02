package smartObjectives;

import com.helger.commons.concurrent.ThreadHelper;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Warm_House_Cool_Make_It_As_You_Like {

    static SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();

    @Test(description = "Vacuum Cleaners")
    public void GC01() {
        driver.element().click(By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/figure[1]/a[1]/img[1]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Fans")
    public void GC02() {
        driver.element().click(By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/figure[1]/a[1]/img[1]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Irons")
    public void GC03() {
        driver.element().click(By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/figure[1]/a[1]/img[1]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Heaters")
    public void GC04() {
        driver.element().click(By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/figure[1]/a[1]/img[1]"));
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
