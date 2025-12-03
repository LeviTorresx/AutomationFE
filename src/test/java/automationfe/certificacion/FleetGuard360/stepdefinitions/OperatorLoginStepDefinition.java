package automationfe.certificacion.FleetGuard360.stepdefinitions;

import automationfe.certificacion.FleetGuard360.questions.DashboardPath;
import automationfe.certificacion.FleetGuard360.questions.LoginFailed;
import automationfe.certificacion.FleetGuard360.tasks.ClickOn;
import automationfe.certificacion.FleetGuard360.tasks.EnterEmailAndPassword;
import automationfe.certificacion.FleetGuard360.tasks.GoToHomePage;
import automationfe.certificacion.FleetGuard360.utils.WaitTime;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;


import static automationfe.certificacion.FleetGuard360.stepdefinitions.Hooks.user;
import static automationfe.certificacion.FleetGuard360.userinterfaces.SingInPage.*;

public class OperatorLoginStepDefinition {

    @Given("the operator is on the login page")
    public void theOperatorIsOnTheLoginPage() {
        user.attemptsTo(
                GoToHomePage.open()
        );
        WaitTime.putWaitTimeOf(1000);
    }
    @When("the operator enters a valid {string} and a valid {string}")
    public void theOperatorEntersAValidUsernameAndAValidPassword(String username, String password) {
        WaitTime.putWaitTimeOf(1000);
        user.attemptsTo(EnterEmailAndPassword.with(username, password, EMAIL_TEXT_BOX, PASSWORD_TEXT_BOX));
        WaitTime.putWaitTimeOf(1000);
    }
    @When("clicks the login button")
    public void clicksTheLoginButton() {
        user.attemptsTo(ClickOn.button(ENTER_BUTTON));
        WaitTime.putWaitTimeOf(3000);
    }
    @Then("the operator is redirected to the dashboard")
    public void theOperatorIsRedirectedToTheDashboard() {
        user.should(
                seeThat("La URL debe ser del dashboard",
                        DashboardPath.isCorrect(),
                        is(true)
                )
        );
    }

    @When("the operator enters an invalid {string} and {string}")
    public void theOperatorEntersAnInvalidUsernameOrPassword(String username, String password) {
        WaitTime.putWaitTimeOf(1000);
        user.attemptsTo(EnterEmailAndPassword.with(username, password, EMAIL_TEXT_BOX, PASSWORD_TEXT_BOX));
        WaitTime.putWaitTimeOf(1000);
    }

    @Then("an error message {string} is displayed")
    public void anErrorMessageIsDisplayed(String expectedMessage) {
        user.should(
                seeThat(LoginFailed.successfully())
        );
    }

}
