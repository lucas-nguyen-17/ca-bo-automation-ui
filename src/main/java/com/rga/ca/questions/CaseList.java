package com.rga.ca.questions;

import com.rga.ca.ui.ComponentCaseList;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import java.util.List;

public class CaseList {

    public static CaseListStatus status() {
        return new CaseListStatus();
    }

    public static Question<List<String>> title() {
        return actor ->  TextContent.of(ComponentCaseList.TITLE).viewedBy(actor).asList();
    }

    public static CaseListDescription description() {
        return new CaseListDescription();
    }

    public static CaseListAppID appID() {
        return new CaseListAppID();
    }
}
