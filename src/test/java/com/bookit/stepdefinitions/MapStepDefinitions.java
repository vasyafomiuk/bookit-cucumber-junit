package com.bookit.stepdefinitions;

import com.bookit.pages.MapPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MapStepDefinitions {
	MapPage map = new MapPage();

	@Then("^user navigates to general schedule and verifies subtitle$")
	public void user_navigates_to_general_schedule_and_verifies_subtitle() throws Throwable {
		map.goToGeneralSchedule();
	}

	@When("user navigates to the hunt")
	public void user_navigates_to_the_hunt() {
		map.goToHunt();
	}

	@Then("user navigates to general schedule and verifies {string} subtitle")
	public void user_navigates_to_general_schedule_and_verifies_subtitle(String string) {
		map.goToGeneralSchedule(string);
	}
}
