package test;

import base.Base;
import config.Settings;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

public class SeleniumTest extends BaseTest {


    @Test
    public void openBrowser() {

        LoginPage loginPage = new LoginPage(webDriver);
        HomePage homePage = loginPage.login();
        homePage.showHomePage();

        LOGGER.info(webDriver.getCurrentUrl());
        LOGGER.info(Settings.userName);


    }


}
