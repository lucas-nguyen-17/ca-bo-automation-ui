package com.rga.ca.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SubComponentDateFilter {

    public static Target ONE_WEEK = Target.the("'ONE_WEEK'")
            .locatedBy("");

    public static Target USERNAME_FIELD = Target.the("'username' field")
            .locatedBy("#username");
}
