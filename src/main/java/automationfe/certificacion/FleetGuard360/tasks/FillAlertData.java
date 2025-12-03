package automationfe.certificacion.FleetGuard360.tasks;

import automationfe.certificacion.FleetGuard360.interactions.EnterThe;
import automationfe.certificacion.FleetGuard360.interactions.SelectTheR;
import automationfe.certificacion.FleetGuard360.models.NewAlertData;
import automationfe.certificacion.FleetGuard360.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static automationfe.certificacion.FleetGuard360.userinterfaces.CreateNewAlert.*;

public class FillAlertData implements Task {

    private final NewAlertData data;

    public FillAlertData(NewAlertData data) {
        this.data = data;
    }

    public static FillAlertData with(NewAlertData data) {
        return Tasks.instrumented(FillAlertData.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitTime.putWaitTimeOf(1000);
        actor.attemptsTo(
                EnterThe.text(data.getName(), ALERT_NAME),
                EnterThe.text(data.getDescription(), SHORT_DESCRIPTION)
        );
        WaitTime.putWaitTimeOf(2000);
        actor.attemptsTo(SelectTheR.option(
                MANAGER_DROPDOWN, RESPONSIBLE_OPTION, data.getManager()),
                SelectTheR.option(PRIORITY_DROPDOWN, PRIORITY_OPTION, data.getPriority())
        );
    }
}

