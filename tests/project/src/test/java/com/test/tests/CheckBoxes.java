package com.test.tests;

import com.pageobject.CheckBoxPage;
import com.test.BaseTest;
import org.junit.*;

public class CheckBoxes extends BaseTest {

    private CheckBoxPage check_box_page;

    @Before
    public void init_page_objects() {
        if (check_box_page == null) check_box_page = new CheckBoxPage(driver);
    }

//    @Test()
//    public void is_default_second_checkbox_selected() {
//        check_box_page.verify_second_checkbox_selected(true);
//    }

    @Test()
    public void is_able_to_unselect_second_checkbox() {
        check_box_page
                .click_second_checkbox()
                .verify_second_checkbox_selected(false);
    }

    public void is_able_to_select_first_checkbox() {
        check_box_page
                .click_first_checkbox()
                .verify_first_checkbox_selected(true);
    }

    public void is_able_to_unselect_first_checkbox() {
        check_box_page
                .click_first_checkbox()
                .verify_first_checkbox_selected(false);
    }
}
