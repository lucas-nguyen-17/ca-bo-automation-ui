package com.rga.ca.questions;

import com.rga.ca.ui.ComponentCaseList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import java.util.List;

public class CaseListTitle implements Question<List<String>> {

    @Override
    public List<String> answeredBy(Actor actor) {
        try {
            Thread.sleep(1000);
        } catch (Exception e){
            e.printStackTrace();
        }
        return TextContent.of(ComponentCaseList.TITLE).viewedBy(actor).asList();
    }
}
