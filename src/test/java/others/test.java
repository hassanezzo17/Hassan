package others;

import Shaftengine.Main;
import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test {

    static SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();

    @Test(description = "Open Google")

    public void GC01()  {
        new Main(driver).navigateHomePage();
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
