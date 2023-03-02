package smartObjectives;

import com.helger.commons.concurrent.ThreadHelper;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Happy_Baby_Happy_Home {

    static SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();

    @Test(description = "Bikes and Scooters")
    public void GC01()  {
        driver.element().click(By.xpath("//a[@id='L2FPQF9']"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Baby Supplies")
    public void GC02()  {
        driver.element().click(By.xpath("//a[contains(text(),'مستلزمات الطفل')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Movement and Activity Games")
    public void GC03()  {
        driver.element().click(By.xpath("//a[contains(text(),'العاب الحركة والنشاط')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "My Dolls and Toys")
    public void GC04()  {
        driver.element().click(By.xpath("//a[contains(text(),'دمي والعاب')]"));
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
