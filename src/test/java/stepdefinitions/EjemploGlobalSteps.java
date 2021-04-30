package stepdefinitions;

import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.BuscarTrabajo;
import tasks.BuscarTrabajoCiudad;
import tasks.BuscarTrabajoPalabra;
import userinterfaces.HomePage;

public class EjemploGlobalSteps {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Global");
    private HomePage homePage = new HomePage();

    @Given("^que la persona busca algo en concreto$")
    public void queLaPersonaBuscaAlgoEnConcreto() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn( homePage ));
    }

    @When("^Ingresa una palabra clave del trabajo (.*),(.*)")
    public void ingresaUnaPalabraClaveDelTrabajoDesarrollador(String descripcion, String ciudad) {
        actor.wasAbleTo(
                BuscarTrabajo.conDescripcion(descripcion, ciudad)
        );

    }

    @Then("^Puede ver las ofertas laborales disponibles$")
    public void puedeVerLasOfertasLaboralesDisponibles() {

    }

    @Given("^que la persona busca trabajo en la ciudad que vive$")
    public void queLaPersonaBuscaTrabajoEnLaCiudadQueVive() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn( homePage ));

    }

    @When("^Ingresa una locacion (.*) y busca$")
    public void IngresaUnaPalabraClaveYBusca(String ciudad) {///////
        actor.wasAbleTo(
                BuscarTrabajoCiudad.conDescripcion(ciudad)
        );
    }

    @Given("^Que la persona quiere ver todas las ofertas por Analista$")
    public void queLaPersonaQuiereVerTodasLasOfertasPorAnalista() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn( homePage ));

    }

    @When("^Busca por (.*)$")
    public void buscaPorAnalista(String Palabra) {
        actor.wasAbleTo(
                BuscarTrabajoPalabra.conDescripcion(Palabra)
        );
    }

    @Then("^Se muestran todas las ofertas disponibles en la empresa$")
    public void seMuestranTodasLasOfertasDisponiblesEnLaEmpresa() {

    }

}
