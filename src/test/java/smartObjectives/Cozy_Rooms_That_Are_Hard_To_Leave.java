package smartObjectives;

import com.helger.commons.concurrent.ThreadHelper;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Cozy_Rooms_That_Are_Hard_To_Leave {

    static SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();

    @Test(description = "Living Room")
    public void GC01() {
        driver.element().click(By.xpath("//a[contains(text(),'غرفة المعيشة')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Bedroom")
    public void GC02() {
      driver.element().click(By.xpath("//a[contains(text(),'غرفة النوم')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Dining Room")
    public void GC03() {
        driver.element().click(By.xpath("//a[contains(text(),'غرفة الطعام')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Storage Units")
    public void GC04() {
        driver.element().click(By.xpath("//a[contains(text(),'وحدات تخزين')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Home Decoration")
    public void GC05() {
        driver.element().click(By.xpath("//a[contains(text(),'ديكور المنزل')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Outdoor Furniture")
    public void GC06() {
        driver.element().click(By.xpath("//a[contains(text(),'أثاث خارجي')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Office Furniture")
    public void GC08() {
        driver.element().click(By.xpath("//a[contains(text(),'أثاث المكتب')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Lighting")
    public void GC09() {
        driver.element().click(By.xpath("//a[contains(text(),'الإضاءة')]"));
        ThreadHelper.sleep(5000);;
        driver.getDriver().navigate().back();
    }

    @Test(description = "Corner Sofa")
    public void GC10() {
        driver.element().click(By.xpath("//a[contains(text(),'كنبة ركنة')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Mirrors")
    public void GC11() {
        driver.element().click(By.xpath("//a[contains(text(),'مرايات')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Frames")
    public void GC12() {
        driver.element().click(By.xpath("//a[contains(text(),'براويز')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Carpets")
    public void GC13() {
        driver.element().click(By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[2]/div[1]/div[14]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[12]/div[1]/p[1]/a[1]"));
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
