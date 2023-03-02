package Shaftengine;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;


public class Main {
    SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();

    public Main(SHAFT.GUI.WebDriver SignIn) {
        SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();
    }

        public void navigateHomePage() {driver.browser().navigateToURL("https://www.raneen.com");
    }

        public void clickSignIn() {driver.element().click(By.cssSelector("body.rtl.cms-layout-2023.layout-1220.wide.mobile-sticky.cms-index-index.page-layout-1column:nth-child(2) div.page-wrapper:nth-child(18) header.page-header.type2:nth-child(1) div.main-panel-top div.container div.main-panel-inner div.panel.wrapper div.header-right div.panel.header.show-icon-tablet:nth-child(1) ul.header.links li.link.authorization-link:nth-child(2) > a:nth-child(1)"));}
        public void sendKeyUsername() {driver.element().type(By.xpath("//input[@id='email']"), "hassanezzo17@gmail.com");}
        public void sendKeyPassWord() {driver.element().type(By.xpath("//input[@name = 'login[password]']"), "Hasan1234");}
        public void clickSignInDone() {driver.element().click(By.xpath("//body[1]/div[3]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[6]/div[1]/button[1]/span[1]"));}
        public void clickRaneenHome() {driver.element().click(By.xpath("//img[@src = 'https://www.raneen.com/media/logo/stores/2/logo-ar.png']"));}

}