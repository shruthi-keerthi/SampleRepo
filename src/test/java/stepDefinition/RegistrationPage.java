package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.BrowserClass;

public class RegistrationPage extends BrowserClass {
    @When("user clicks on register button")
    public void user_clicks_on_register_button() {
        // Implement the logic for clicking on the register button
    }

    @When("user enters email address, title, firstname, lastname, password, confirm password")
    public void user_enters_email_address_title_firstname_lastname_password_confirm_password() {
        // Implement the logic for entering user details
    }

    @Then("user successfully able to login to the website")
    public void user_successfully_able_to_login_to_the_website() {
        // Implement the logic for verifying successful login
    }
}
