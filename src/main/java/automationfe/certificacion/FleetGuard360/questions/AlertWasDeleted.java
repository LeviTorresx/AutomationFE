package automationfe.certificacion.FleetGuard360.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static automationfe.certificacion.FleetGuard360.userinterfaces.ToastComponents.TOAST_DELETE_ALERT;

public class AlertWasDeleted implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return TOAST_DELETE_ALERT.resolveFor(actor).isVisible();
    }

    public static AlertWasDeleted successfully() {
        return new AlertWasDeleted();
    }
}
