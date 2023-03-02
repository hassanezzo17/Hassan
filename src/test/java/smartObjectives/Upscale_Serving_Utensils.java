package smartObjectives;

import com.helger.commons.concurrent.ThreadHelper;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Upscale_Serving_Utensils {

    static SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();

    @Test(description = "Food Utensils")
    public void GC01()  {
        driver.element().click(By.xpath("//a[contains(text(),'أوانى الطعام')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Kitchen Tools")
    public void GC02()  {
        driver.element().click(By.xpath("//a[@id='EM6PGUK']"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Presentation Tools")
    public void GC03()  {
        driver.element().click(By.xpath("//a[contains(text(),'أدوات التقديم')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Polat")
    public void GC04()  {
        driver.element().click(By.xpath("//a[contains(text(),'بولات')]"));
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
