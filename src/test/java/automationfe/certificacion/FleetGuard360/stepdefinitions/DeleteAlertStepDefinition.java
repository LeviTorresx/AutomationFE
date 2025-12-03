package automationfe.certificacion.FleetGuard360.stepdefinitions;

import automationfe.certificacion.FleetGuard360.questions.AlertWasDeleted;
import automationfe.certificacion.FleetGuard360.tasks.ClickOn;
import automationfe.certificacion.FleetGuard360.utils.WaitTime;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static automationfe.certificacion.FleetGuard360.stepdefinitions.Hooks.user;
import static automationfe.certificacion.FleetGuard360.userinterfaces.AlertListPage.DELETE_BUTTON_IN_ROW;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;


public class DeleteAlertStepDefinition {


    @When("the operator selects an existing alert named {string} for delete")
    public void theOperatorSelectsTheAlert(String alertName) {
        WaitTime.putWaitTimeOf(1000);
        user.attemptsTo(ClickOn.button(
                        DELETE_BUTTON_IN_ROW.of(alertName)
                )
        );
        WaitTime.putWaitTimeOf(1000);
    }

    @Then("the operator sees the message that the alert has been deleted.")
    public void heOperatorSeesTheMessageThatTheAlertHasBeenDeleted() {
        user.should(
                seeThat("La alerta debe haber sido actualizada",
                        AlertWasDeleted.successfully(),
                        is(true)
                )
        );
        WaitTime.putWaitTimeOf(3000);
    }

}
