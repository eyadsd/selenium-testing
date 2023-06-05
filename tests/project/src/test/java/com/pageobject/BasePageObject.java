package com.pageobject;

import org.openqa.selenium.WebDriver;

public class BasePageObject {

    public WebDriver driver;

    public void open_page(String path) {
        String current_url = driver.getCurrentUrl();
        if(!current_url.contains(path)) {
            driver.navigate().to(current_url + path);
        }
    }
}
