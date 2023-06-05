package com.test.tests;

import com.pageobject.DynamicControlPage;
import com.test.BaseTest;
import org.junit.Before;
import org.junit.Test;

public class DynamicControl extends BaseTest {

    private DynamicControlPage dynamic_control_page = null;

    @Before
    public void init() {
        if (dynamic_control_page == null) dynamic_control_page = new DynamicControlPage(driver);
    }

    @Test
    public void able_to_remove_checkbox() {
        dynamic_control_page
                .click_on_remove_checkbox_button()
                .verify_checkbox_is_removed();
    }

    @Test
    public void able_to_enable_textfield() {
        dynamic_control_page
                .click_to_enable_text_field()
                .verify_text_field_is_enabled();
    }
}
