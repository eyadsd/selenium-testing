package com.test.tests;

import com.flow.LoginFlow;
import com.pageobject.LoginPage;
import com.test.BaseTest;
import org.junit.Before;
import org.junit.Test;

public class Login extends BaseTest {

    private LoginPage login_page = null;

    @Before
    public void init() {
        if (login_page == null) login_page = new LoginPage(driver);
    }

    @Test
    public void login_invalid_creds() throws InterruptedException {
        login_page
                .input_username("abc")
                .input_password("abc")
                .click_on_login_btn();
        login_page.verify_wrong_credentials_msg();
    }

    @Test
    public void login_valid_creds() {
        LoginFlow login_flow = new LoginFlow(driver, "tomsmith", "SuperSecretPassword!");
        login_flow.login();
        login_flow.verify_correct_credentials_msg();
    }

}


