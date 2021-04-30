package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;

public class BuscarTrabajo implements Task {

    private String descripcion;
    private String ciudad;
    public BuscarTrabajo(String descripcion, String ciudad){
        this.descripcion = descripcion;
        this.ciudad = ciudad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(descripcion).into(Input_Buscar_Trabajo), //Diligenciar el nombre del trabajo
                Enter.theValue(ciudad).into(Input_Buscar_Ciudad),
                //SelectFromOptions.byVisibleText(ciudad).from(),
                Hit.the(Keys.ENTER).into(Input_Buscar_Trabajo)//oprimir enter para iniciar la busqueda
                //Click.on(Input_Seleccionado)//seleccionar buscar
        );
    }

    public static BuscarTrabajo conDescripcion(String descripcion, String ciudad) {
        return instrumented(BuscarTrabajo.class, descripcion, ciudad);
    }
}
