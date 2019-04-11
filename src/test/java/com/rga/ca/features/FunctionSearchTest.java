package com.rga.ca.features;

import com.rga.ca.questions.CaseList;
import com.rga.ca.tasks.Login;
import com.rga.ca.tasks.SearchCase;
import com.rga.ca.tasks.Start;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.Matchers.*;

@RunWith(SerenityRunner.class)
public class FunctionSearchTest {

    @Managed
    public WebDriver herBrowser;

    Actor emily = Actor.named("Emily");

    @Before
    public void canBrowseTheWeb() {
        emily.can(BrowseTheWeb.with(herBrowser));
    }

    @WithTags(@WithTag("function"))
    @Test
    public void should_be_able_to_search_cases_by_caseId(){
        String caseId = "case 1";

        givenThat(emily).wasAbleTo(Start.theApplication());
        when(emily).attemptsTo(Login.withUserAccount(), SearchCase.search(caseId));
        then(emily).should(seeThat("the case list title", CaseList.title(), hasItem(containsString(caseId))));
    }

    public void should_be_able_to_search_cases_by_description(){
        String description = "description";

        givenThat(emily).wasAbleTo(Start.theApplication());
        when(emily).attemptsTo(Login.withUserAccount(), SearchCase.search(description));
        then(emily).should(seeThat(CaseList.description(), hasItem(containsString(description))));
    }

    public void should_be_able_to_search_cases_by_AppId(){
        String appID = "app 1";

        givenThat(emily).wasAbleTo(Start.theApplication());
        when(emily).attemptsTo(Login.withUserAccount(), SearchCase.search(appID));
        then(emily).should(seeThat(CaseList.appID(), hasItem(containsString(appID.toUpperCase()))));
    }
}
