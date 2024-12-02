package starter.prueba;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class login {
    public static Target campoUsuario = Target
            .the("campo usuario")
            .located(AppiumBy.accessibilityId("username"));

    public static Target campoCalve = Target
            .the("campo calve")
            .located(AppiumBy.accessibilityId("password"));

    public static Target botonLogin = Target
            .the("boton iniciar")
            .located(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Login\").instance(1)"));
}
