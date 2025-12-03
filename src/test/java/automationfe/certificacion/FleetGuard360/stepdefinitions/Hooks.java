package automationfe.certificacion.FleetGuard360.stepdefinitions;
import io.cucumber.java.Before;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class Hooks {

    public static Actor user;

    @Managed(driver = "chrome")
    public WebDriver theDriver;

    @Before
    public void setUp() {
        if (user == null) {
            user = Actor.named("Junior");
        }
        user.can(BrowseTheWeb.with(theDriver));
    }
}
