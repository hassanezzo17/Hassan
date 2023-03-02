package buners;

import com.helger.commons.concurrent.ThreadHelper;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Braun_Products_Are_Built_To_Last {

    static SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();

    @Test(description = "Braun Products Are Built To Last")
    public void GC01() {

        driver.element().click(By.xpath("/html[1]/body[1]/div[3]/main[1]/div[2]/div[1]/div[2]/div[1]/div[22]/div[1]/figure[1]/a[1]/img[1]"));
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
