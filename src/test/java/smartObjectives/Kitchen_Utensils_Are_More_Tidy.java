package smartObjectives;

import com.helger.commons.concurrent.ThreadHelper;
import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Kitchen_Utensils_Are_More_Tidy {

    static SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();

    @Test(description = "Cooking Utensils")
    public void GC01()  {
//        new Main(driver).clickCooking_Utensils();
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Drink Paraphernalia")
    public void GC02()  {
//        new Main(driver).clickDrinkParaphernalia();
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Kitchen Accessory")
    public void GC03()  {
//        new Main(driver).clickKitchenAccessory();
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Storage and Organization Supplies")
    public void GC04()  {
//        new Main(driver).clickStorageAndOrganizationSupplies();
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
