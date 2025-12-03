package automationfe.certificacion.FleetGuard360.tasks;

import automationfe.certificacion.FleetGuard360.interactions.EnterThe;
import automationfe.certificacion.FleetGuard360.interactions.SelectTheR;
import automationfe.certificacion.FleetGuard360.models.NewAlertData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static automationfe.certificacion.FleetGuard360.userinterfaces.CreateNewAlert.*;

public class EditAlertData implements Task {

    private final NewAlertData newData;

    public EditAlertData(NewAlertData newData) {
        this.newData = newData;
    }

    public static EditAlertData with(NewAlertData newData) {
        return Tasks.instrumented(EditAlertData.class, newData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EnterThe.text(newData.getName(), ALERT_NAME),
                EnterThe.text(newData.getDescription(), SHORT_DESCRIPTION),
                SelectTheR.option(MANAGER_DROPDOWN, RESPONSIBLE_OPTION, newData.getManager()),
                SelectTheR.option(PRIORITY_DROPDOWN, PRIORITY_OPTION, newData.getPriority())
        );
    }
}
