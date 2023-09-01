package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


//@DefaultUrl("https://google.com")
public class UserInt_Login extends PageObject {

    public static final Target JOINTODAY_BUTTON = Target.the("Boton para ingreso").located(By.linkText("Join Today"));

}
