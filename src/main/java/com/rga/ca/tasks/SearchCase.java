package com.rga.ca.tasks;

import com.rga.ca.ui.ComponentCaseList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchCase implements Task {

    private String keyword;

    public SearchCase(String caseID) {
        this.keyword = caseID;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(keyword).into(ComponentCaseList.SEARCH_BOX)
        );
    }

    public static SearchCase search(String keyword) {
        return instrumented(SearchCase.class, keyword);
    }

}
