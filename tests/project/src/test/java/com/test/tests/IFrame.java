package com.test.tests;

import com.pageobject.IFramePage;
import com.test.BaseTest;
import org.junit.Before;
import org.junit.Test;

public class IFrame extends BaseTest {

    private IFramePage iframe_page = null;

    @Before
    public void init() {
        if (iframe_page == null) iframe_page = new IFramePage(driver);
    }

    @Test
    public void able_to_input_text_to_iframe() {
        iframe_page
                .input_text_in_Iframe("ABC")
                .verify_input_text();
    }

}
