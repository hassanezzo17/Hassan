package orders;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Order1 {

    SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();

    @Test(description = "Make Complete order with sign in")
    public void GC01() {

        //Click on Sign In.
        driver.element().click(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]"));
        //Send Keys to Email.
        driver.element().type(By.xpath("//input[@id='email']"), "hassanezzo17@gmail.com");
        //Send Keys to Password.
        driver.element().type(By.xpath("//input[@name = 'login[password]']"), "Hasan1234");
        //Click on Sign In.
        driver.element().click(By.xpath("//body[1]/div[3]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[6]/div[1]/button[1]/span[1]"));
        //Navigate to home Page.
        driver.element().click(By.xpath("//img[@src = 'https://www.raneen.com/media/logo/stores/2/logo-ar.png']"));
        //
        driver.element().click(By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/figure[1]/a[1]/img[1]"));
        //
        driver.element().click(By.xpath("//body/div[3]/main[1]/div[4]/div[1]/div[3]/div[2]/ol[1]/li[1]/div[1]/a[1]/span[1]/span[1]/img[1]"));
        //
        driver.element().click(By.xpath("//body[1]/div[4]/main[1]/div[2]/div[1]/div[2]/div[7]/form[1]/div[2]/div[1]/div[1]/div[2]/button[1]/span[1]"));
        //
        driver.element().click(By.xpath("//header/div[2]/div[1]/div[3]/div[2]/a[1]/i[1]"));
        //
        driver.element().click(By.xpath("//button[@id='top-cart-btn-checkout']"));
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
