package orders;

import com.helger.commons.concurrent.ThreadHelper;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrderWithDiscount {

    SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();

    @Test(description = "Discount 10%")
    public void GC01() {
        driver.element().click(By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/figure[1]/a[1]/img[1]"));
        driver.element().click(By.xpath("//a[contains(text(),'سرائر')]"));
        driver.element().click(By.xpath("//body/div[3]/main[1]/div[4]/div[1]/div[3]/div[2]/ol[1]/li[1]/div[1]/a[1]/span[1]/span[1]/img[1]"));
        driver.element().click(By.xpath("//body[1]/div[4]/main[1]/div[2]/div[1]/div[2]/div[7]/form[1]/div[1]/div[1]/div[2]/button[1]/span[1]"));
        driver.element().click(By.xpath("//header/div[2]/div[1]/div[3]/div[2]/a[1]/i[1]"));
        driver.element().click(By.xpath("//button[@id='top-cart-btn-checkout']"));
        ThreadHelper.sleep(7000);
        driver.element().click(By.xpath("//span[contains(text(),'التالى')]"));
        ThreadHelper.sleep(10000);
        driver.element().click(By.xpath("//span[contains(text(),'تطبيق كود الخصم')]"));
        driver.element().type(By.xpath("//input[@id='discount-code']"), "RF10");
        driver.element().click(By.xpath("//span[contains(text(),'تطبيق الخصم')]"));
        driver.element().click(By.xpath("//body/div[4]/main[1]/div[3]/div[1]/div[3]/div[4]/ol[1]/li[3]/div[1]/form[1]/fieldset[1]/div[2]/div[1]/div[1]/div[4]/div[1]"));
    }

    @BeforeClass
    public void BeforeClass()
    {
        driver.browser().navigateToURL("https://www.raneen.com");
        driver.element().click(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]"));
        driver.element().type(By.xpath("//input[@id='email']"), "hassanezzo17@gmail.com");
        driver.element().type(By.xpath("//input[@name = 'login[password]']"), "Hasan1234");
        driver.element().click(By.xpath("//body[1]/div[3]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[6]/div[1]/button[1]/span[1]"));
        ThreadHelper.sleep(7000);
        driver.element().click(By.xpath("//img[@src = 'https://www.raneen.com/media/logo/stores/2/logo-ar.png']"));
    }

    @AfterClass
    public void AfterClass()
    {
        driver.quit();
    }
}
