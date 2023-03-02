package buners;

import com.helger.commons.concurrent.ThreadHelper;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Furnish_Rooms_With_Prices_Starting_From_29222LE {
    static SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();

    @Test(description = "Furnish Rooms With Prices Starting From 29,222 L.E")
    public void GC01()  {

        driver.element().click(By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/figure[1]/a[1]/img[1]"));
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
