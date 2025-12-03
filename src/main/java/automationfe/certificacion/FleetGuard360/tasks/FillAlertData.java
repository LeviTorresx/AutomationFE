package automationfe.certificacion.FleetGuard360.tasks;

import automationfe.certificacion.FleetGuard360.interactions.EnterThe;
import automationfe.certificacion.FleetGuard360.interactions.SelectThe;
import automationfe.certificacion.FleetGuard360.interactions.SelectTheR;
import automationfe.certificacion.FleetGuard360.models.NewAlertData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static automationfe.certificacion.FleetGuard360.userinterfaces.CreateNewAlert.*;

public class FillAlertData  implements Task {

    private final NewAlertData newAlertData;

    public FillAlertData(NewAlertData newAlertData) {
        this.newAlertData = newAlertData;
    }
    public static FillAlertData with(NewAlertData newAlertData) {
        return Tasks.instrumented(FillAlertData.class, newAlertData);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EnterThe.text(newAlertData.getName(), ALERT_NAME),
                EnterThe.text(newAlertData.getDescription(), SHORT_DESCRIPTION),
                SelectTheR.option(AREA_DROPDOWN,AREA_OPTION, "MECANICO"),
                SelectThe.option(newAlertData.getManager(),AREA_OPTION),
                SelectThe.option(newAlertData.getPriority(),PRIORITY_OPTION)
        );
    }
}
