package com.test.tests;

import com.pageobject.DynamicLoadingPage;
import com.test.BaseTest;
import org.junit.Before;
import org.junit.Test;

public class DynamicLoading extends BaseTest {

    private DynamicLoadingPage dynamic_loading_page = null;

    @Before
    public void init() {
        if (dynamic_loading_page == null) dynamic_loading_page = new DynamicLoadingPage(driver);
    }

    @Test
    public void able_to_load_new_text() {
        dynamic_loading_page
                .click_on_start_btn()
                .verify_hello_world_displayed();
    }

}
