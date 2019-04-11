package com.rga.ca.questions;

import com.rga.ca.model.FirstCaseInformation;
import com.rga.ca.ui.ComponentCaseList;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class FirstCase implements Question<FirstCaseInformation> {

	@Override
	public FirstCaseInformation answeredBy(Actor actor) {
		String title = Text.of(ComponentCaseList.FIST_ITEM_TITLE)
				.viewedBy(actor).asString();
		
		String description= "";
		
		try {
			description = Text.of(ComponentCaseList.FIST_ITEM_DESCRIPTION)
					.viewedBy(actor).asString();
		} catch (Exception e) {

		}

		String status = Text.of(ComponentCaseList.FIST_ITEM_STATUS)
				.viewedBy(actor).asString();

		return new FirstCaseInformation(title, description, status);
	}

	public static FirstCase information() {
		return new FirstCase();
	}

}
