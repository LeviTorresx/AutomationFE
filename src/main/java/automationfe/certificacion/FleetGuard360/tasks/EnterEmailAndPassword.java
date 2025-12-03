package automationfe.certificacion.FleetGuard360.tasks;

import automationfe.certificacion.FleetGuard360.interactions.EnterThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class EnterEmailAndPassword implements Task {
    private final String email;
    private final String password;
    private final Target emailField;
    private final Target passwordField;

    public EnterEmailAndPassword(String email, String password, Target emailField, Target passwordField) {
        this.email = email;
        this.password = password;
        this.emailField = emailField;
        this.passwordField = passwordField;
    }

    public static EnterEmailAndPassword with(String name, String email,
                                         Target nameField, Target emailField) {
        return Tasks.instrumented(
                EnterEmailAndPassword.class,
                name, email, nameField, emailField
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EnterThe.text(email, emailField),
                EnterThe.text(password, passwordField)
        );
    }
}
