package automationfe.certificacion.FleetGuard360.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SelectThe implements Interaction {

    private final String value;
    private final Target target;

    public SelectThe(String value, Target target) {
        this.value = value;
        this.target = target;
    }

    public static SelectThe option(String value, Target target) {
        return Tasks.instrumented(SelectThe.class, value, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(target),
                WaitUntil.the(target, isVisible()).forNoMoreThan(10).seconds(),
                WaitUntil.the(target, isEnabled()).forNoMoreThan(10).seconds()
        );

        target.resolveFor(actor).selectByVisibleText(value);
    }
}

