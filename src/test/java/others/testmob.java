package others;

import com.shaft.driver.SHAFT;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testmob {


    SHAFT.GUI.WebDriver driver;
    SHAFT.TestData.JSON testData;

    By searchBox = By.name("q");
    By resultStats = By.id("result-stats");

    @Test
    public void test_nativeDriver() {
        WebDriver nativeWebDriver = driver.getDriver();
        nativeWebDriver.navigate().to("https://www.google.com/");
        new SoftAssert().assertEquals(nativeWebDriver.getTitle(), "Google");
        nativeWebDriver.findElement(searchBox).sendKeys(testData.getTestData("searchQuery") + Keys.ENTER);
        Assert.assertNotEquals(nativeWebDriver.findElement(resultStats).getText(), "");
    }


    @BeforeClass
    public void beforeClass() {
        // common attributes android
        SHAFT.Properties.platform.set().targetPlatform(Platform.ANDROID.name());
        SHAFT.Properties.mobile.set().automationName(AutomationName.ANDROID_UIAUTOMATOR2);

        // common attributes ios
//        SHAFT.Properties.platform.set().targetPlatform(Platform.IOS.name());
//        SHAFT.Properties.mobile.set().automationName(AutomationName.IOS_XCUI_TEST);

        // self-managed execution (android only) [WARNING: WORK IN PROGRESS]
        SHAFT.Properties.mobile.set().selfManaged(true);
        SHAFT.Properties.mobile.set().selfManagedAndroidSDKVersion(30);

        // local appium server (for local and GitHub actions execution)
        SHAFT.Properties.platform.set().executionAddress("localhost:4723");
        SHAFT.Properties.mobile.set().app("Phone");

        // local appium server (android-emulator docker-compose)
        SHAFT.Properties.platform.set().executionAddress("localhost:4725");
        SHAFT.Properties.mobile.set().app("Web View Browser tester");
    }
    {
    driver = new SHAFT.GUI.WebDriver();
    testData = new SHAFT.TestData.JSON("simpleJSON.json");
}

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
