package automationfe.certificacion.FleetGuard360.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class EnterThe implements Interaction {

    private final String text;
    private final Target target;

    public EnterThe(String text, Target target) {
        this.text = text;
        this.target = target;
    }

    public static EnterThe text(String text, Target target) {
        return Tasks.instrumented(EnterThe.class, text, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        target.resolveFor(actor).clear();
        target.resolveFor(actor).sendKeys(text);
    }
}