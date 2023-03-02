package smartObjectives;

import com.helger.commons.concurrent.ThreadHelper;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Great_Care_Devices_That_Are_Easy_To_Use {

    static SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();

    @Test(description = "Shaving and Trimming")
    public void GC01() {
        driver.element().click(By.xpath("//a[contains(text(),'الحلاقة والتشذيب')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Hairdressing Devices")
    public void GC02() {
        driver.element().click(By.xpath("//a[contains(text(),'أجهزة تصفيف الشعر')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Body Care")
    public void GC03() {
        driver.element().click(By.xpath("//a[contains(text(),'العناية بالجسم')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Personal Care")
    public void GC04() {
        driver.element().click(By.xpath("//a[contains(text(),'العناية الشخصية')]"));
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
