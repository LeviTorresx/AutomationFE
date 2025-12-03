package automationfe.certificacion.FleetGuard360.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class ToastComponents {

    public static final Target TOAST_ALERT_CREATED =
            Target.the("Toast de alerta creada")
                    .locatedBy("//li[contains(., 'Alerta creada')]");

    public static final Target TOAST_UPDATE_ALERT = Target.the("alert updated toast")
            .locatedBy("//li[contains(., 'Alerta actualizada')]");

    public static final Target TOAST_DELETE_ALERT = Target.the("alert deleted toast")
            .locatedBy("//li[contains(., 'Alerta eliminada')]");

    public static final Target TOAST_FAILED_LOGIN = Target.the("alert deleted toast")
            .locatedBy("//li[contains(., 'Error de autenticación')]");

}
