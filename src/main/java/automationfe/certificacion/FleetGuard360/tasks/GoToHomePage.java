package automationfe.certificacion.FleetGuard360.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class GoToHomePage implements Task {

    private static final String URL = "http://localhost:3000";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(URL)
        );
    }

    public static GoToHomePage open() {
        return new GoToHomePage();
    }
}
