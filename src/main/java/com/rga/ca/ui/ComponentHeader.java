package com.rga.ca.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ComponentHeader {

    public static final Target ON_MY_CASE = Target.the("'Only My Case' element")
            .locatedBy("//label[contains(text(),'Only My Cases')]");

    public static Target DATE_FILTER = Target.the("'Date Filter' element")
            .locatedBy("//a[@class='item dropdown ui']");

    public static final Target STATUS_FILTER = Target.the("'Status filter' element")
            .locatedBy("//*[@id='main_menu']/div[2]/div[2]/div[1]");

    public static Target LANGUAGE_SWITCH = Target.the("'Language Switch' element")
            .locatedBy("//div[contains(text(),'English')]");

    public static final Target LOGOUT_BUTTON = Target.the("'Logout' button")
            .locatedBy("//div[@id='btn_top_right']//span[1]");
}
