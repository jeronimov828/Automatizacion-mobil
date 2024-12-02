package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.prueba.login;

public class InciarSesion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("alice").into(login.campoUsuario),
                SendKeys.of("mypassword").into(login.campoCalve),
                Click.on(login.botonLogin)
        );
    }
}
