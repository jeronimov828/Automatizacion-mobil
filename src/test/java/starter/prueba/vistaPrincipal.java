package starter.prueba;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.targets.TargetBuilder;

public class vistaPrincipal {
    public static Target boonLogin = Target
            .the("boonLogin")
            .located(AppiumBy.accessibilityId("Login Screen"));
;}
