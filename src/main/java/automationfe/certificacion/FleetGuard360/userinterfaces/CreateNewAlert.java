package automationfe.certificacion.FleetGuard360.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CreateNewAlert {
    public static final Target ALERT_NAME = Target.the("Name of the alert")
        .locatedBy("//*[@id='alert-name']");
    public static final Target SHORT_DESCRIPTION = Target.the("Description of the alert")
            .locatedBy("//*[@id='alert-description']");
    public static final Target AREA_OPTION = Target.the("opción de área")
            .locatedBy("//div[@data-radix-popper-content-wrapper']//div[@role='option'][1]");
    public static final Target AREA_DROPDOWN =
            Target.the("Area dropdown trigger")
                    .locatedBy("//button[@role='combobox']");
    public static final Target PRIORITY_OPTION=
            Target.the("Area dropdown trigger")
                    .locatedBy("//*[@id='radix-:r9:']/div/div[2]");


}

