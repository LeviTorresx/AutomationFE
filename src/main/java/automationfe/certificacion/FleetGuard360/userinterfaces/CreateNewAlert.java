package automationfe.certificacion.FleetGuard360.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CreateNewAlert {
    public static final Target ALERT_NAME = Target.the("Name of the alert")
        .locatedBy("//*[@id='alert-name']");
    public static final Target SHORT_DESCRIPTION = Target.the("Description of the alert")
            .locatedBy("//*[@id='alert-description']");

    public static final Target MANAGER_DROPDOWN =
            Target.the("Responsible dropdown trigger")
                    .locatedBy("//button[@role='combobox'][1]");

    public static final Target RESPONSIBLE_OPTION =
            Target.the("Responsible option")
                    .locatedBy("//div[@role='option']//span[normalize-space()='{0}']");
    public static final Target PRIORITY_DROPDOWN =
            Target.the("Priority dropdown trigger")
                    .locatedBy("(//button[@role='combobox'])[2]");

    public static final Target PRIORITY_OPTION =
            Target.the("Priority option")
                    .locatedBy("//div[@role='option']//span[normalize-space()='{0}']");


    public static final Target SAVE_ALERT_BUTTON =
            Target.the("Agregar alerta button")
                    .locatedBy("//button[normalize-space()='Agregar Alerta']");




}

