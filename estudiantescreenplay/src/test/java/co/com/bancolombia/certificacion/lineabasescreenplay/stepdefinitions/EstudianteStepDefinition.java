package co.com.bancolombia.certificacion.lineabasescreenplay.stepdefinitions;

import co.com.bancolombia.certificacion.lineabasescreenplay.questions.ValidarInformacion;
import co.com.bancolombia.certificacion.lineabasescreenplay.tasks.AdicionarTareaTasks;
import co.com.bancolombia.certificacion.lineabasescreenplay.tasks.OpenTheBrowser;
import co.com.bancolombia.certificacion.lineabasescreenplay.userinterface.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.core.Is.is;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class EstudianteStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver herBrowser;

    private Actor lalis= Actor.named("lalis");
    private HomePage homePage;

    @Before
    public void setUp(){

        lalis.can(BrowseTheWeb.with(herBrowser));
    }

    @Given("^Adicionar una nueva tarea$")
    public void adicionarUnaNuevaTarea() throws Exception {
        lalis.wasAbleTo(OpenTheBrowser.on(homePage));
    }


    @When("^Ingreso al home de la pagina$")
    public void ingresoAlHomeDeLaPagina() throws Exception {

    }

    @When("^ingreso la nueva \"([^\"]*)\"$")
    public void ingresoLaNueva(String tarea) throws Exception {
        lalis.attemptsTo(AdicionarTareaTasks.adicionarTarea(tarea));
    }

    @Then("^ver ingresada la nueva tarea (.*)$")
    public void verIngresadaLaNuevaTarea(String respuesta) throws Exception {

        lalis.should(seeThat(ValidarInformacion.taskList(),is(respuesta)));
    }

}
