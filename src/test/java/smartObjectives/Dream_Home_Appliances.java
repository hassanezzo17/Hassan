package smartObjectives;

import com.helger.commons.concurrent.ThreadHelper;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dream_Home_Appliances {

    static SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();

    @Test(description = "Dish Washers")
    public void GC01()  {
        driver.element().click(By.xpath("//a[contains(text(),'غسالات الأطباق')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Water Dispensers")
    public void GC02()  {
        driver.element().click(By.xpath("//a[contains(text(),'مبردات المياه')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Water Heaters")
    public void GC03()  {
        driver.element().click(By.xpath("//a[contains(text(),'سخانات المياه')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Built-In Appliances")
    public void GC04()  {
        driver.element().click(By.xpath("//a[contains(text(),'أجهزة بلت إن')]"));
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
