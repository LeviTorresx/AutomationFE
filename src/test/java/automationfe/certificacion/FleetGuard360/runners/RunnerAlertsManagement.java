package automationfe.certificacion.FleetGuard360.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/02_AlertsManagement.feature",
        glue = "automationfe.certificacion.FleetGuard360.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RunnerAlertsManagement {


}
