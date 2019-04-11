package com.rga.ca.features;

import com.rga.ca.questions.CaseList;
import com.rga.ca.tasks.FilterCase;
import com.rga.ca.tasks.Login;
import com.rga.ca.tasks.Start;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static com.rga.ca.model.Status.*;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.core.IsCollectionContaining.hasItem;

@RunWith(SerenityRunner.class)
public class FunctionFilterTest {

    @Managed
    public WebDriver herBrowser;

    Actor emily = Actor.named("Emily");

    @Before
    public void canBrowseTheWeb() {
        emily.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void should_be_able_to_filter_cases_by_status(){
        givenThat(emily).wasAbleTo(Start.theApplication());

        when(emily).attemptsTo(Login.withUserAccount(), FilterCase.byStatus(Validating_ocr));
        then(emily).should(seeThat(CaseList.status(), hasItem("Validating OCR".toUpperCase())));

        when(emily).attemptsTo(FilterCase.byStatus(Completed));
        then(emily).should(seeThat(CaseList.status(), hasItem("Completed".toUpperCase())));

        when(emily).attemptsTo(FilterCase.byStatus(Processing_ocr));
        then(emily).should(seeThat(CaseList.status(), hasItem("Processing OCR".toUpperCase())));
    }
}
