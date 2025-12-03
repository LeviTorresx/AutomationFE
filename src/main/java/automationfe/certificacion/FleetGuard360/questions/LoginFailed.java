package automationfe.certificacion.FleetGuard360.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static automationfe.certificacion.FleetGuard360.userinterfaces.ToastComponents.TOAST_FAILED_LOGIN;

public class LoginFailed implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return TOAST_FAILED_LOGIN.resolveFor(actor).isVisible();
    }

    public static LoginFailed successfully() {
        return new LoginFailed();
    }
}
