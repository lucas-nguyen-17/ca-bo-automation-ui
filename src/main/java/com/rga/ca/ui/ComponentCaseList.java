package com.rga.ca.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ComponentCaseList extends PageObject {

    public static final Target TITLE = Target.the("Title")
			.locatedBy("//div[@class='header']/span[1]");

	public static final Target APP_ID = Target.the("App ID")
			.locatedBy("");

	public static final Target DESCRIPTION = Target.the("'Description' field")
			.locatedBy("");

	public static Target STATUS = Target.the("Status")
			.locatedBy("span.status-lozenge-span span span");

	public static Target LOADING_CASE_LIST = Target.the("'LOADING_CASE_LIST' icon")
			.locatedBy("#case_list_loading");

	public static Target CASE_LIST_VIEW = Target.the("'CASE_LIST_VIEW'")
			.locatedBy(".list.case-list");

	public static Target FIST_ITEM_TITLE = Target.the("'title' label")
			.locatedBy("//*[@id='case_list_item_0']/div/div[1]/span[1]");

	public static Target FIST_ITEM_DESCRIPTION = Target.the("'description' field")
			.locatedBy("#case_list_item_0 div.description");

	public static Target FIST_ITEM_STATUS = Target.the("'status' label")
			.locatedBy("//*[@id='case_list_item_0']/div/div[1]/span[2]/span");

	public static final Target SEARCH_BOX = Target.the("'Search' field")
			.locatedBy("//input[@placeholder='Search...']");

}
