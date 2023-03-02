package smartObjectives;

import com.helger.commons.concurrent.ThreadHelper;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Mens_Watches {

    static SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();

    @Test(description = "Mens Watches")
    public void GC01() {
        driver.element().click(By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[2]/div[1]/div[15]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/figure[1]/a[1]/img[1]"));
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
