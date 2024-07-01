package cucumber.resources;



import cucumber.pages.SingUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    private SingUpPage signUpPage;
    

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        this.signUpPage = new SingUpPage();
    }



    @When("the user enters {string} into the username field")
    public void the_user_enters_into_the_username_field(String string) {
        signUpPage.preecherCampoXpath("//*[@id=\"username\"]", "tomsmith");
    }

    @When("the user enters {string} into the password field")
    public void the_user_enters_into_the_password_field(String string) {

        signUpPage.preecherCampoXpath("//*[@id=\"password\"]", "SuperSecretPassword!");

    }

    @When("the user clicks the login button")
    public void the_user_clicks_the_login_button() {
        signUpPage.clicarXpath("//*[@id=\"login\"]/button/i");
    }

    @Then("the user should be redirected to the home page")
    public void the_user_should_be_redirected_to_the_home_page() {
        signUpPage.paginaCerta("https://the-internet.herokuapp.com/login");
    }

    @Then("a welcome message {string} should be displayed")
    public void a_welcome_message_should_be_displayed(String string) {
        signUpPage.checarLogin("//*[@id=\"flash\"]/text()");
    }

}
