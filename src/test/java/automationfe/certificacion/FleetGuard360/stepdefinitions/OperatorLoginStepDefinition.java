package automationfe.certificacion.FleetGuard360.stepdefinitions;

import automationfe.certificacion.FleetGuard360.interactions.SelectThe;
import automationfe.certificacion.FleetGuard360.tasks.ClickOn;
import automationfe.certificacion.FleetGuard360.tasks.EnterEmailAndPassword;
import automationfe.certificacion.FleetGuard360.utils.WaitTime;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static automationfe.certificacion.FleetGuard360.stepdefinitions.Hooks.user;
import static automationfe.certificacion.FleetGuard360.userinterfaces.SingInPage.*;

public class OperatorLoginStepDefinition {

    public final String EMAIL_GLOBAL = "juan.perez@example.com";
    public final String PASSWORD_GLOBAL = "juan";


    @When("The operator enters a valid username and password.")
    public void theOperatorEntersAValidUsernameAndPassword() {
        WaitTime.putWaitTimeOf(1000);
        user.attemptsTo(EnterEmailAndPassword.with(EMAIL_GLOBAL, PASSWORD_GLOBAL, EMAIL_TEXT_BOX, PASSWORD_TEXT_BOX));
        WaitTime.putWaitTimeOf(1000);

    }
    @When("The operator has assigned permissions for alert management.")
    public void theOperatorHasAssignedPermissionsForAlertManagement() {
        user.attemptsTo(ClickOn.button(ENTER_BUTTON));
        WaitTime.putWaitTimeOf(1000);
    }
    @Then("The system grants access.")
    public void theSystemGrantsAccess() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The system displays only the alerts corresponding to the operator's role or assignment.")
    public void theSystemDisplaysOnlyTheAlertsCorrespondingToTheOperatorSRoleOrAssignment() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
}
}
