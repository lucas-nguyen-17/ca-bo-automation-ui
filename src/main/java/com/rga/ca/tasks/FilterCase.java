package com.rga.ca.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FilterCase   {


    public static FilterByStatus byStatus(Enum status) {
        return new FilterByStatus(status);
    }

    public static FilterByDate byDate(Enum date) {
        return new FilterByDate(date);
    }
}
