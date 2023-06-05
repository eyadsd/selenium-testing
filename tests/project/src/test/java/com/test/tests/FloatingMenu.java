package com.test.tests;

import com.pageobject.FloatingMenuPage;
import com.test.BaseTest;
import org.junit.Before;
import org.junit.Test;

public class FloatingMenu extends BaseTest {

    private FloatingMenuPage floating_menu_page = null;

    @Before
    public void init() {
        if (floating_menu_page == null) floating_menu_page = new FloatingMenuPage(driver);
    }

    @Test
    public void scroll_and_check_menu_floating() {
        floating_menu_page
                .scroll_to_bottom()
                .verify_menu_is_still_displayed_on_top();
    }
}
