package smartObjectives;

import Shaftengine.Main;
import com.helger.commons.concurrent.ThreadHelper;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class What_Is_Missing_In_Your_Kitchen {

    static SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();

    @Test(description = "Microwaves and Ovens")
    public void GC01()  {
        driver.element().click(By.xpath("//a[contains(text(),'المايكرويف والأفران')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Meat Grinder")
    public void GC02()  {
        driver.element().click(By.xpath("//a[contains(text(),'مفرمة اللحوم')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Mixers")
    public void GC03()  {
        driver.element().click(By.xpath("//a[contains(text(),'الخلاطات')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Mills")
    public void GC04()  {
        driver.element().click(By.xpath("//a[contains(text(),'المطاحن')]"));
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
