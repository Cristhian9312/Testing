package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;

public class BuscarTrabajoCiudad implements Task {

    private String ciudad;
    public BuscarTrabajoCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(ciudad).into(Input_Buscar_Ciudad),
                Hit.the(Keys.ENTER).into(Input_Buscar_Trabajo)//oprimir enter para iniciar la busqueda
        );
    }

    public static BuscarTrabajoCiudad conDescripcion(String ciudad) {
        return instrumented(BuscarTrabajoCiudad.class, ciudad);
    }
}