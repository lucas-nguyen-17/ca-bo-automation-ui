package com.rga.ca.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PageHome extends PageObject {
    public static Target CREATE_CASE_BUTTON = Target.the("'create case' button")
            .locatedBy("#btn_create_case");
}
