package automationfe.certificacion.FleetGuard360.stepdefinitions;

import automationfe.certificacion.FleetGuard360.models.NewAlertData;
import automationfe.certificacion.FleetGuard360.questions.AlertWasCreated;
import automationfe.certificacion.FleetGuard360.questions.AlertWasEdited;
import automationfe.certificacion.FleetGuard360.tasks.ClickOn;
import automationfe.certificacion.FleetGuard360.tasks.EditAlertData;
import automationfe.certificacion.FleetGuard360.tasks.EnterEmailAndPassword;
import automationfe.certificacion.FleetGuard360.tasks.GoToHomePage;
import automationfe.certificacion.FleetGuard360.utils.WaitTime;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static automationfe.certificacion.FleetGuard360.stepdefinitions.Hooks.user;
import static automationfe.certificacion.FleetGuard360.userinterfaces.AlertListPage.EDIT_ALERT_BUTTON;
import static automationfe.certificacion.FleetGuard360.userinterfaces.AlertListPage.EDIT_BUTTON_IN_ROW;
import static automationfe.certificacion.FleetGuard360.userinterfaces.SingInPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class EditAlertStepDefinition {

    public final String EMAIL_GLOBAL = "juan.perez@example.com";
    public final String PASSWORD_GLOBAL = "juan";

    @Given("I am logged into the Operators panel")
    public void iAmLoggedIntoTheOperatorsPanel() {
        user.attemptsTo(
                GoToHomePage.open()
        );
        WaitTime.putWaitTimeOf(1000);
        user.attemptsTo(EnterEmailAndPassword.with(EMAIL_GLOBAL, PASSWORD_GLOBAL, EMAIL_TEXT_BOX, PASSWORD_TEXT_BOX));
        WaitTime.putWaitTimeOf(1000);
        user.attemptsTo(ClickOn.button(ENTER_BUTTON));
        WaitTime.putWaitTimeOf(3000);
    }
    @Given("the operator selects an existing alert named {string}")
    public void theOperatorSelectsAnExistingAlertNamed(String alertName) {
        WaitTime.putWaitTimeOf(1000);
        user.attemptsTo(ClickOn.button(
                EDIT_BUTTON_IN_ROW.of(alertName)
            )
        );
        WaitTime.putWaitTimeOf(1000);
    }
    @When("the operator edits the alert with {string} {string} {string} {string}")
    public void theOperatorEditsTheAlertWith(String area, String priority, String responsible, String description) {

        NewAlertData update = new NewAlertData(area, priority, responsible, description);

        user.attemptsTo(
                EditAlertData.with(update)
        );
        WaitTime.putWaitTimeOf(1000);
    }
    @When("saves the alert changes")
    public void savesTheAlertChanges() {
        user.attemptsTo(ClickOn.button(EDIT_ALERT_BUTTON));
        WaitTime.putWaitTimeOf(1000);
    }
    @Then("the operator sees the alert updated with the new information")
    public void theOperatorSeesTheAlertUpdatedWithTheNewInformation() {
        user.should(
                seeThat("La alerta debe haber sido actualizada",
                        AlertWasEdited.successfully(),
                        is(true)
                )
        );
        WaitTime.putWaitTimeOf(3000);
    }

}
