package automationfe.certificacion.FleetGuard360.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class DashboardPath implements Question<Boolean> {

    private static final String EXPECTED_URL = "http://localhost:3000/dashboard";

    @Override
    public Boolean answeredBy(Actor actor) {
        String currentUrl = BrowseTheWeb.as(actor).getDriver().getCurrentUrl();
        return currentUrl.equals(EXPECTED_URL);
    }

    public static DashboardPath isCorrect() {
        return new DashboardPath();
    }
}
