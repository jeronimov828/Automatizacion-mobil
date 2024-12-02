package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.tasks.InciarSesion;
import starter.tasks.navegar;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LogInStepDefinitions {


    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que estoy en el incio de sesion")
    public void que_estoy_en_el_inicio_de_sesion(){
        theActorCalled("jhon").attemptsTo(
                new navegar()
        );
    }

    @When("llene los campos y di click en iniciar")
    public void llene_los_campos_y_di_click_en_iniciar() {
        theActorInTheSpotlight().attemptsTo(
                new InciarSesion()
        );
    }
}
