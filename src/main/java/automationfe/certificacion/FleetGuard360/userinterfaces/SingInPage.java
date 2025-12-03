package automationfe.certificacion.FleetGuard360.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SingInPage {

    public static final Target EMAIL_TEXT_BOX = Target.the("Sing In Text Box")
            .locatedBy("//*[@id='email']");
    public static final Target PASSWORD_TEXT_BOX = Target.the("Sing In Text Box")
            .locatedBy("//*[@id='password']");
    public static final Target ENTER_BUTTON = Target.the("Enter Button")
            .locatedBy("//*[@id='root']/div[2]/div[2]/div/div[2]/form/button");
}

