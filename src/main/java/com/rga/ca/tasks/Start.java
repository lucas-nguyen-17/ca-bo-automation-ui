package com.rga.ca.tasks;

import com.rga.ca.ui.Application;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Start implements Task{
	
	Application theApplication;

	@Step("{0} open the Welcome Page")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(theApplication));
	}

	public static Start theApplication() {
		return instrumented(Start.class);
	}

}
