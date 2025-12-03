package automationfe.certificacion.FleetGuard360.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static automationfe.certificacion.FleetGuard360.userinterfaces.ToastComponents.TOAST_ALERT_CREATED;

public class AlertWasCreated implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return TOAST_ALERT_CREATED.resolveFor(actor).isVisible();
    }

    public static AlertWasCreated successfully() {
        return new AlertWasCreated();
    }
}
