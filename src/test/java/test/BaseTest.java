package test;

import base.Base;
import base.BrowserInitializer;;
import base.BrowserType;
import config.ConfigReader;
import config.Settings;
import org.junit.After;
import org.junit.Before;


import java.io.IOException;


public class BaseTest extends Base {


    @Before
    public void init() throws IOException {
        ConfigReader.populateSettings();
        BrowserInitializer.browserInitializer((BrowserType) Settings.browserType);
    }

    @After
    public void tearDown() {


        webDriver.quit();
    }
}
