package com.test.tests;

import com.pageobject.MouseHoverPage;
import com.test.BaseTest;
import org.junit.Before;
import org.junit.Test;

public class MouseHover extends BaseTest {
    private MouseHoverPage mouse_hover_page = null;

    @Before
    public void init() {
        if (mouse_hover_page == null) mouse_hover_page = new MouseHoverPage(driver);
    }

    @Test
    public void able_to_hover_and_see_user_info() {
        mouse_hover_page.mouse_over_user(1).verify_general_info_for_user(1);
        mouse_hover_page.mouse_over_user(2).verify_general_info_for_user(2);
        mouse_hover_page.mouse_over_user(3).verify_general_info_for_user(3);
    }
}
