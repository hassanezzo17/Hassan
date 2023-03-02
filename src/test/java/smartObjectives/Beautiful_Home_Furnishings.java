package smartObjectives;

import com.helger.commons.concurrent.ThreadHelper;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Beautiful_Home_Furnishings {

    static SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();

    @Test(description = "Pillows")
    public void GC01() {
        driver.element().click(By.xpath("//a[contains(text(),'الوسائد')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Towels and Napkins")
    public void GC02() {
        driver.element().click(By.xpath("//a[contains(text(),'المناشف و الفوط')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Mattresses")
    public void GC03() {
        driver.element().click(By.xpath("//a[contains(text(),'مراتب')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Chair Covers")
    public void GC04() {
        driver.element().click(By.xpath("//a[contains(text(),'أغطية الكراسي')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }
    @Test(description = "Bed Sheets")
    public void GC05() {
        driver.element().click(By.xpath("//a[contains(text(),'ملايات السرير')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Curtain")
    public void GC06() {
        driver.element().click(By.xpath("//a[contains(text(),'ستارة')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Tablecloths")
    public void GC07() {
        driver.element().click(By.xpath("//a[contains(text(),'مفارش طاولات')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Rugs and Mats")
    public void GC08() {
        driver.element().click(By.xpath("//a[contains(text(),'سجاد & دواسات')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Blankets")
    public void GC09()  {
        driver.element().click(By.xpath("//a[contains(text(),'البطاطين')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Bed Warmers")
    public void GC10()  {
        driver.element().click(By.xpath("//a[contains(text(),'دفايات السرير')]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Quilt")
    public void GC11()  {
        driver.element().click(By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[2]/div[1]/div[17]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/p[1]/a[1]"));
        ThreadHelper.sleep(5000);
        driver.getDriver().navigate().back();
    }

    @Test(description = "Bed Cover")
    public void GC12()  {
        driver.element().click(By.xpath("//a[contains(text(),'كوفرتة سرير')]"));
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
