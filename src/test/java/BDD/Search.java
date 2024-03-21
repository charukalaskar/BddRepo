package BDD;

import io.cucumber.java.en.*;

public class Search {
	@Given("user navigate to search field functionality")
	public void user_navigate_to_search_field_functionality() {
	   System.out.println("user navigate to search field functionality");
	}

	@When("user enters valid Item into search field")
	public void user_enters_valid_item_into_search_field() {
	   System.out.println("user enters valid Item into search field");
	}

	@When("user click on search button")
	public void user_click_on_search_button() {
	   System.out.println("user click on search button");
	}

	@Then("user get available option")
	public void user_get_available_option() {
	    System.out.println("user get available option ");
	}

	@When("user enters non existing Item into search field")
	public void user_enters_non_existing_item_into_search_field() {
	System.out.println("user enters non existing Item into search field ");
	//int a= 9/0; 
	}

	@Then("invalid item massage should displayed")
	public void invalid_item_massage_should_displayed() {
	    System.out.println("invalid item massage should displayed");
	}

	@When("user dont enter any product into search field")
	public void user_dont_enter_any_product_into_search_field() {
	  System.out.println("user dont enter any product into search field ");
	}

	@Then("error massage should display")
	public void error_massage_should_display() {
	   System.out.println("error massage should display");
	  // int a= 9/0; //intentionally fail TC to see html report  //this sentence cause artithmatic exceptions
	}

}
