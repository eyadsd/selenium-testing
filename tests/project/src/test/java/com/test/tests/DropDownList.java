package com.test.tests;

import com.pageobject.DropDownListPage;
import com.test.BaseTest;
import org.junit.Before;
import org.junit.Test;

public class DropDownList extends BaseTest {

    private DropDownListPage dropdown_list_page = null;

    @Before
    public void init() {
        if (dropdown_list_page == null) dropdown_list_page = new DropDownListPage(driver);
    }

    @Test
    public void able_to_select_option() {
        final String OPTION_01 = "Option 1";
        final String OPTION_02 = "Option 2";
        dropdown_list_page
                .select_option(OPTION_01)
                .verify_selected_option(OPTION_01)
                .select_option(OPTION_02)
                .verify_selected_option(OPTION_02);
    }

}
