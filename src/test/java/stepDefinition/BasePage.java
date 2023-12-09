package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utility.BrowserClass;

public class BasePage {
    @Given("user navigates to next website")
    public void user_navigates_to_next_website() {
        BrowserClass.page.navigate("https://www.next.co.uk/");
    }

    @When("user clicks on my account button")
    public void user_clicks_on_my_account_button() {
        BrowserClass.page.locator("a[data-test-id='header-adaptive-my-account-icon-container-link']").click();
    }
}
