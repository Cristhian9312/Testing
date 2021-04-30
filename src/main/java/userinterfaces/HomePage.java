package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.choucairtesting.com/empleos-testing/")
public class HomePage extends PageObject {

    public static final Target Input_Buscar_Trabajo = Target.the("Imput donde se realiza la busqueda del trabajo").located(By.id("search_keywords"));
    public static final Target Input_Buscar_Ciudad = Target.the("Imput donde se realiza la busqueda la ciudad").located(By.id("search_location"));
    public static final Target Input_Seleccionado = Target.the("Imput donde se realiza la busqueda la ciudad").located(By.className("post-7547 job_listing type-job_listing status-publish has-post-thumbnail hentry"));

}
