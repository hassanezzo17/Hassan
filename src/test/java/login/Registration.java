package login;

import com.helger.commons.concurrent.ThreadHelper;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Registration {

    SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();

    @Test(description = "Create New Account")

    //Methods:

        public void SignUp() {
        // Click on Sign up Button
        driver.element().click(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"));
        // Send keys to Firstname
        driver.element().type(By.xpath("//input[@id='firstname']"), "Hassan");
        // Send Keys to Lastname
        driver.element().type(By.xpath("//input[@id='lastname']"), "Ezzo");
        // Click on mark box to get news
        WebElement option = driver.getDriver().findElement(By.id("is_subscribed"));
        option.click();
        // Send Keys to Email
        driver.element().type(By.xpath("//input[@id='email_address']"), "hassanezzo17@gmail.com");
        // Send Keys to Password
        driver.element().type(By.xpath("//input[@id='password']"), "Hasan1234");
        // Send Keys to Password Confirmation
        driver.element().type(By.xpath("//input[@id='password-confirmation']"), "Hasan1234");
        ThreadHelper.sleep(5000);
        //Click on Sign up Button
        driver.element().click(By.xpath("//body[1]/div[3]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]"));
    }


        @BeforeClass
        public void BeforeClass ()
        {
            // Navigate to Raneen Website
            driver.browser().navigateToURL("https://www.raneen.com");
        }

        @AfterClass
        public void AfterClass ()
        {
            // Close Browser
            driver.quit();
        }
    }


