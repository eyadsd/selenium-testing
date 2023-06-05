package com.test;

import com.helper.Webdriver;
import org.openqa.selenium.WebDriver;
import org.junit.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import org.openqa.selenium.chrome.*;
import java.net.MalformedURLException;

public class BaseTest {

    public WebDriver driver;

    @Before
    public void set_up() throws MalformedURLException{
        System.out.println("Before class");
        ChromeOptions options = new ChromeOptions();
        this.driver = new RemoteWebDriver(new URL("http://selenium:4444/wd/hub"), options);
        driver.get("https://the-internet.herokuapp.com/");
    }

    @After
    public void tear_down() {
        System.out.println("After class");
//        driver.close();
//        driver.quit();
    }
}
