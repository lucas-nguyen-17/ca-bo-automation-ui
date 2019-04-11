package com.rga.ca.features;

import com.rga.ca.tasks.Login;
import com.rga.ca.tasks.Start;
import com.rga.ca.ui.ComponentHeader;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

@RunWith(SerenityRunner.class)
public class UIHeaderTest {

    @Managed
    public WebDriver herBrowser;

    Actor emily = Actor.named("Emily");

    @Before
    public void canBrowseTheWeb() {
        emily.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void should_be_able_to_see_items_in_header() {

        givenThat(emily).wasAbleTo(Start.theApplication());

        when(emily).attemptsTo(Login.withUserAccount());

        then(emily).should(
                seeThat(the(ComponentHeader.ON_MY_CASE), isVisible()),
                seeThat(the(ComponentHeader.DATE_FILTER), isVisible()),
                seeThat(the(ComponentHeader.STATUS_FILTER), isVisible()),
                seeThat(the(ComponentHeader.LANGUAGE_SWITCH), isVisible()),
                seeThat(the(ComponentHeader.LOGOUT_BUTTON), isPresent())
        );
    }
}
