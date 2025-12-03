package automationfe.certificacion.FleetGuard360.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class AlertListPage {
    public static final Target EDIT_BUTTON_IN_ROW = Target.the("edit button for alert")
            .locatedBy("//tr[td[1][normalize-space()='{0}']]//button[1]");

    public static final Target DELETE_BUTTON_IN_ROW = Target.the("delete button for alert")
            .locatedBy("//tr[td[1][normalize-space()='{0}']]//button[2]");

    public static final Target EDIT_ALERT_BUTTON =
            Target.the("Agregar alerta button")
                    .locatedBy("//button[normalize-space()='Guardar Cambios']");



}
