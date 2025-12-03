package automationfe.certificacion.FleetGuard360.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectTheR implements Interaction {

    private final Target trigger;
    private final Target option;
    private final String value;

    public SelectTheR(Target trigger, Target option, String value) {
        this.trigger = trigger;
        this.option = option;
        this.value = value;
    }

    public static Performable option(Target trigger, Target option, String value) {
        return Tasks.instrumented(SelectTheR.class, trigger, option, value);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(trigger),
                WaitUntil.the(option.of(value), isVisible())
                        .forNoMoreThan(10).seconds(),
                Click.on(option.of(value)));}
}
