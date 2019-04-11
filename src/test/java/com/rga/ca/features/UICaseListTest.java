package com.rga.ca.features;

import com.rga.ca.questions.*;
import com.rga.ca.tasks.Login;
import com.rga.ca.tasks.Start;
import com.rga.ca.ui.ComponentCaseList;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isA;

@RunWith(SerenityRunner.class)
public class UICaseListTest {

    @Managed
    public WebDriver herBrowser;

    @Managed
    public WebDriver hisBrowser;

    Actor emily = Actor.named("Emily");
    Actor jacob = Actor.named("Jacob");

    @Before
    public void canBrowseTheWeb() {
        emily.can(BrowseTheWeb.with(herBrowser));
        jacob.can(BrowseTheWeb.with(hisBrowser));
    }

    @WithTags(@WithTag("test"))
    @Test
    public void should_be_able_to_see_items_in_case_list() {
        givenThat(emily).wasAbleTo(Start.theApplication());
        when(emily).attemptsTo(Login.withUserAccount());
        then(emily).should(
                seeThat(the(ComponentCaseList.SEARCH_BOX), isVisible()),
                seeThat(the(ComponentCaseList.CASE_LIST_VIEW), isVisible())
                );
    }
}
