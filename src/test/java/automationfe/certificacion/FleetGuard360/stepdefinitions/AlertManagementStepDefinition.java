package automationfe.certificacion.FleetGuard360.stepdefinitions;

import automationfe.certificacion.FleetGuard360.models.NewAlertData;
import automationfe.certificacion.FleetGuard360.tasks.ClickOn;
import automationfe.certificacion.FleetGuard360.tasks.EnterEmailAndPassword;
import automationfe.certificacion.FleetGuard360.tasks.FillAlertData;
import automationfe.certificacion.FleetGuard360.userinterfaces.AddItem;
import automationfe.certificacion.FleetGuard360.utils.WaitTime;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static automationfe.certificacion.FleetGuard360.stepdefinitions.Hooks.user;
import static automationfe.certificacion.FleetGuard360.userinterfaces.AddItem.ADD_ITEM_BUTTON;
import static automationfe.certificacion.FleetGuard360.userinterfaces.SingInPage.*;

public class AlertManagementStepDefinition {

    public final String EMAIL_GLOBAL = "juan.perez@example.com";
    public final String PASSWORD_GLOBAL = "juan";

    @When("the operator creates a new alert")
    public void theOperatorCreatesANewAlert() {
        WaitTime.putWaitTimeOf(1000);
        user.attemptsTo(EnterEmailAndPassword.with(EMAIL_GLOBAL, PASSWORD_GLOBAL, EMAIL_TEXT_BOX, PASSWORD_TEXT_BOX));
        WaitTime.putWaitTimeOf(1000);
        user.attemptsTo(ClickOn.button(ENTER_BUTTON));
        WaitTime.putWaitTimeOf(1000);
        user.attemptsTo(ClickOn.button(ADD_ITEM_BUTTON));
    }
    @When("assigns a priority level to the alert")
    public void assignsAPriorityLevelToTheAlert() {
        NewAlertData newAlertData;
        newAlertData = new NewAlertData("Motor", "Alta","MECANICO","Cambio de aceite");
        WaitTime.putWaitTimeOf(1000);
        user.attemptsTo(FillAlertData.with(newAlertData));
        WaitTime.putWaitTimeOf(1000);
    }
    @When("assigns a responsible party to handle it")
    public void assignsAResponsiblePartyToHandleIt() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("saves the alert")
    public void savesTheAlert() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the system confirms the creation of the alert")
    public void theSystemConfirmsTheCreationOfTheAlert() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
