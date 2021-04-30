package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;

public class BuscarTrabajoPalabra implements Task {

    private String Palabra;
    public BuscarTrabajoPalabra(String Palabra){
        this.Palabra = Palabra;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(Palabra).into(Input_Buscar_Ciudad),
                Hit.the(Keys.ENTER).into(Input_Buscar_Trabajo)//oprimir enter para iniciar la busqueda
        );
    }

    public static BuscarTrabajoPalabra conDescripcion(String Palabra) {
        return instrumented(BuscarTrabajoPalabra.class, Palabra);
    }
}
