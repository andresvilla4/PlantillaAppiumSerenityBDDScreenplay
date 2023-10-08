package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.questions.LoggedInQuestions;
import starter.tasks.Login;
import starter.tasks.NavigateTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LogInStepDefinitions {


    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("John click on login view")
    public void navigateToLoginView() {
        theActorCalled("Jhon").attemptsTo(
                new NavigateTo()
        );
    }

    @When("he puts username and password")
    public void typeCredentials() {
        theActorInTheSpotlight().attemptsTo(
                new Login()
        );
    }

    @Then("it will be login")
    public void verifiesLogin() {
        String expectedText = "You are logged in as user1";
        theActorInTheSpotlight().should(
                seeThat("The welcome text", LoggedInQuestions.value(),
                        equalTo(expectedText))
        );
    }
}
