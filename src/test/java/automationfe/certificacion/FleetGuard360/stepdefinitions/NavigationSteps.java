package automationfe.certificacion.FleetGuard360.stepdefinitions;
import automationfe.certificacion.FleetGuard360.tasks.GoToHomePage;
import io.cucumber.java.en.Given;

import static automationfe.certificacion.FleetGuard360.stepdefinitions.Hooks.user;


public class NavigationSteps {

    @Given("I am on the Operators login page.")
    public void iAmOnTheOperatorsLoginPage() {
        user.attemptsTo(
                GoToHomePage.open()
        );
    }
}
