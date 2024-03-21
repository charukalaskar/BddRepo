package BDD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
     //use particular annotations from cucumber 
	@Given("user navigate to Register Account Page")
	public void user_navigate_to_Register_Account_Page() {
		System.out.println("** user navigate to Register Account Page");
	}
	
	@When("user enters firstname {string} into the firstname field")
	public void user_enters_firstname_into_the_firstname_field(String firstname) {
	   System.out.println("** user enters firstname");
	}

	@When("enters lastname {string} into the last name field")
	public void enters_lastname_into_the_last_name_field(String lastname) {
		System.out.println("** user enters lastname "+lastname);
	}
	

	@When("enters email address {string} into the Email field")
	public void enters_email_address_into_the_email_field(String email) {
		System.out.println("** user enters Email "+email);
	}

	@When("enters telephone {int} into the telephone field")
	public void enters_telephone_into_the_telephone_field(int telephone) {
		System.out.println("** User enter telephone number "+telephone);
	}

	@When("enters password {int} into password field")
	public void enters_password_into_password_field(int password) {
		System.out.println("** User enter password "+password);
	}

	@When("enters password {int} into password confirm field")
	public void enters_password_into_password_confirm_field(int confirmpassword ) {
		System.out.println("** User enter password to confirm "+confirmpassword);
	}

	@When("select privacy policy field")
	public void select_privacy_policy_field() {
		System.out.println("** User select privacy policy field");
	}

	@When("clicks on continue button")
	public void clicks_on_continue_button() {
		System.out.println("** Click on continue");
	}

	@Then("Account should get successfully created")
	public void account_should_get_successfully_created() {
		System.out.println("** Account created successfully");
	}

	

	@When("select yes for Newsletter")
	public void select_yes_for_newsletter() {
		System.out.println("** Select yes for Newsletter");
	}

	@When("user Clicks on continue button")
	public void user_clicks_on_continue_button() {
		System.out.println("** continue");
	}

	@When("Warning messages should be displayed for all the mandatory fields")
	public void warning_messages_should_be_displayed_for_all_the_mandatory_fields() {
		System.out.println("** Warning messages should be displayed ");
	}

	@Then("Warning message informating the User about duplicate email address should have displayed")
	public void warning_message_informating_the_user_about_duplicate_email_address_should_have_displayed() {
		System.out.println("** Warning messages for duplicate Email Address");
	}

	
}
