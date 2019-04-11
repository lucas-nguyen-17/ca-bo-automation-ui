package com.rga.ca.tasks;

import com.rga.ca.ui.PageLogin;
import com.rga.ca.ui.PageWelcome;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Login implements Task {

	private final String username;
	private final String password;

	public Login(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Step("{0} login with username '#username' and password '#password'")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(PageWelcome.LOGIN_BTN),
				Enter.theValue(username).into(PageLogin.USERNAME_FIELD),
				Enter.theValue(password).into(PageLogin.PASSWORD_FIELD),
				Click.on(PageLogin.LOGIN_BUTTON));
	}

	public static Login withUserAccount() {
		return Instrumented.instanceOf(Login.class).withProperties("emily",
				"12345678");
	}
	
	public static Login withAdminAccount() {
		return Instrumented.instanceOf(Login.class).withProperties("jacob",
				"12345678");
	}
	
}
