package com.rga.ca.tasks;

import com.rga.ca.ui.SubComponentDateFilter;
import com.rga.ca.ui.ComponentHeader;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class FilterByDate implements Task {

    private Enum date;

    public FilterByDate(Enum date) {
        this.date = date;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        Target StatusLink = null;


        actor.attemptsTo(
                Click.on(ComponentHeader.DATE_FILTER),
                Click.on(SubComponentDateFilter.ONE_WEEK)
        );
    }
}
