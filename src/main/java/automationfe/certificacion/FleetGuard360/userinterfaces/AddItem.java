package automationfe.certificacion.FleetGuard360.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AddItem {

    public static final Target ADD_ITEM_BUTTON = Target.the("Enter Add Item Button")
            .locatedBy("//*[@id='root']/div[2]/main/div[1]/button");
}
