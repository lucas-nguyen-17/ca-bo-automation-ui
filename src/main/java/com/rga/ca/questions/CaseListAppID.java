package com.rga.ca.questions;

import com.rga.ca.ui.ComponentCaseList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class CaseListAppID implements Question<List<String>> {
    @Override
    public List<String> answeredBy(Actor actor) {
        return Text.of(ComponentCaseList.APP_ID).viewedBy(actor).asList();
    }
}
