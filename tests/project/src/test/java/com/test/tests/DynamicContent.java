package com.test.tests;

import com.pageobject.DynamicContentPage;
import com.test.BaseTest;
import org.junit.Before;
import org.junit.Test;

public class DynamicContent extends BaseTest {

    private DynamicContentPage dynamic_content_page = null;

    @Before
    public void init() {
        if (dynamic_content_page == null) dynamic_content_page = new DynamicContentPage(driver);
    }

    @Test
    public void make_sure_dynamic_content_change() {
        final int TIME_TO_REFRESH = 3;
        dynamic_content_page.verify_content_change_after_refresh(TIME_TO_REFRESH);
    }

}
