package automationfe.certificacion.FleetGuard360.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static automationfe.certificacion.FleetGuard360.userinterfaces.ToastComponents.TOAST_UPDATE_ALERT;


public class AlertWasEdited implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return TOAST_UPDATE_ALERT.resolveFor(actor).isVisible();
    }

    public static AlertWasEdited successfully() {
        return new AlertWasEdited();
    }
}
