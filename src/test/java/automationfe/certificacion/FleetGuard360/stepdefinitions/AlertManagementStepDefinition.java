package automationfe.certificacion.FleetGuard360.stepdefinitions;

import automationfe.certificacion.FleetGuard360.models.NewAlertData;
import automationfe.certificacion.FleetGuard360.questions.AlertWasCreated;
import automationfe.certificacion.FleetGuard360.questions.AlertWasEdited;
import automationfe.certificacion.FleetGuard360.tasks.ClickOn;
import automationfe.certificacion.FleetGuard360.tasks.EnterEmailAndPassword;
import automationfe.certificacion.FleetGuard360.tasks.FillAlertData;
import automationfe.certificacion.FleetGuard360.utils.WaitTime;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

import static automationfe.certificacion.FleetGuard360.stepdefinitions.Hooks.user;
import static automationfe.certificacion.FleetGuard360.userinterfaces.AddItem.ADD_ITEM_BUTTON;
import static automationfe.certificacion.FleetGuard360.userinterfaces.CreateNewAlert.SAVE_ALERT_BUTTON;
import static automationfe.certificacion.FleetGuard360.userinterfaces.SingInPage.*;

public class AlertManagementStepDefinition {

    public final String EMAIL_GLOBAL = "juan.perez@example.com";
    public final String PASSWORD_GLOBAL = "juan";

    @When("the operator creates a new alert with {string} {string} {string} {string}")
    public void theOperatorCreatesANewAlertWith(String area, String priority, String responsible, String description) {
        WaitTime.putWaitTimeOf(1000);
        user.attemptsTo(EnterEmailAndPassword.with(EMAIL_GLOBAL, PASSWORD_GLOBAL, EMAIL_TEXT_BOX, PASSWORD_TEXT_BOX));
        WaitTime.putWaitTimeOf(1000);
        user.attemptsTo(ClickOn.button(ENTER_BUTTON));
        WaitTime.putWaitTimeOf(3000);

        NewAlertData data = new NewAlertData(area, priority, responsible, description);

        user.attemptsTo( ClickOn.button(ADD_ITEM_BUTTON),
                FillAlertData.with(data));
        WaitTime.putWaitTimeOf(1000);

    }
    @When("saves the alert")
    public void savesTheAlert() {
        WaitTime.putWaitTimeOf(1000);
        user.attemptsTo(ClickOn.button(SAVE_ALERT_BUTTON));
        WaitTime.putWaitTimeOf(1000);
    }
    @Then("the operator sees the newly created alert listed")
    public void theOperatorSeesTheNewlyCreatedAlertListed() {
        user.should(
                seeThat("La alerta debe haber sido creada",
                        AlertWasCreated.successfully(),
                        is(true)
                )
        );
        WaitTime.putWaitTimeOf(3000);
    }


}
