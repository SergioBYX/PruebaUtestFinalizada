package tasks;

import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;
import userinterface.UserInt_LlenadoFormulario;

public class Task_LlenadoFormulario implements Task {
    //________________VARIABLES____________________________________________________________
    private String srtUser;
    private String srtUser2;
    private String correo;
    private String dia;
    private String mes;
    private String ano;
    private String lenguaje;
    private String ciudad;
    private String postal;
    private String contrasena;
    private String contrasenaRe;

    public Task_LlenadoFormulario(String srtUser, String srtUser2, String correo, String dia, String mes, String ano, String lenguaje, String ciudad, String postal, String contrasena, String contrasenaRe) {
        this.srtUser = srtUser;
        this.srtUser2 = srtUser2;
        this.correo = correo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.lenguaje = lenguaje;
        this.ciudad = ciudad;
        this.postal = postal;
        this.contrasena = contrasena;
        this.contrasenaRe = contrasenaRe;
    }

    //_____________________________________________________________________________________
    public static Task_LlenadoFormulario onThePage(String srtUser, String srtUser2, String correo, String dia, String mes, String ano, String lenguaje, String ciudad, String postal, String contrasena, String contrasenaRe) {
        return Tasks.instrumented(Task_LlenadoFormulario.class, srtUser,srtUser2, correo, dia, mes, ano, lenguaje, ciudad, postal, contrasena, contrasenaRe);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(UserInt_LlenadoFormulario.FIRSTNAME_INPUT),
                Enter.theValue(srtUser).into(UserInt_LlenadoFormulario.FIRSTNAME_INPUT),
                Enter.theValue(srtUser2).into(UserInt_LlenadoFormulario.LAST_NAME_INPUT),
                Enter.theValue(correo).into(UserInt_LlenadoFormulario.EMAIL_INPUT),
                Click.on(UserInt_LlenadoFormulario.BMONTH_INPUT),
                Enter.theValue(mes).into(By.name("birthMonth")),
                Click.on(UserInt_LlenadoFormulario.BDAY_INPUT),
                Enter.theValue(dia).into(By.name("birthDay")),
                Click.on(UserInt_LlenadoFormulario.BYEAR_INPUT),
                Enter.theValue(ano).into(By.name("birthYear")),
                Click.on(UserInt_LlenadoFormulario.L_SPOKEN_INPUT),
                Enter.theValue(lenguaje).into(By.cssSelector("input.ui-select-search")),
                Click.on(UserInt_LlenadoFormulario. L_SPOKEN_INPUT2)
        );
        actor.attemptsTo(Click.on(UserInt_LlenadoFormulario.PRESS_NEXT_LOCATION),
                Enter.theValue(ciudad).into(UserInt_LlenadoFormulario.INPUT_CITY),
                Click.on(UserInt_LlenadoFormulario.CITY_SELECTOR),
                Enter.theValue(postal).into(UserInt_LlenadoFormulario.INPUT_ZIP),
                Click.on(UserInt_LlenadoFormulario.PRESS_NEXT_DEVICES),
                Click.on(UserInt_LlenadoFormulario.PRESS_LASTSTEP_BUTTON),
                Enter.theValue(contrasena).into(UserInt_LlenadoFormulario.PASSWORD),
                Enter.theValue(contrasenaRe).into(UserInt_LlenadoFormulario.CONFIRMPASSWORD),
                Click.on(UserInt_LlenadoFormulario.CHECK_BOX),
                Click.on(UserInt_LlenadoFormulario.CHECK_BOX),
                Click.on(UserInt_LlenadoFormulario.CHECK_BOX_ERROR),
                Click.on(UserInt_LlenadoFormulario.CHECK_BOX_ERROR),
                Click.on(UserInt_LlenadoFormulario.PRESS_COMPLETE_BUTTON)
                );

        actor.attemptsTo(Click.on(UserInt_LlenadoFormulario.LOG_IN),
                Click.on(UserInt_LlenadoFormulario.USER),
                Enter.theValue(correo).into(UserInt_LlenadoFormulario.USER),
                Click.on(UserInt_LlenadoFormulario.USER_PASS),
                Enter.theValue(contrasena).into(UserInt_LlenadoFormulario.USER_PASS)

        );

        actor.attemptsTo(Click.on(UserInt_LlenadoFormulario.SIGN_IN)

        );
    }
}




/*

package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;
import userinterface.UserInt_LlenadoFormulario;

public class Task_LlenadoFormulario implements Task {
    private UserInt_LlenadoFormulario llenadoformulario;

    public static Performable onThePage() {
    return Tasks.instrumented(Task_LlenadoFormulario.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(llenadoformulario.FIRSTNAME_INPUT),
                Enter.theValue("SergioSergioSergio").into(llenadoformulario.FIRSTNAME_INPUT),
                Enter.theValue("Salas").into(llenadoformulario.LAST_NAME_INPUT),
                Enter.theValue("Sergio9999@gmail.com").into(llenadoformulario.EMAIL_INPUT),
                Click.on(llenadoformulario.BMONTH_INPUT),
                Enter.theValue("July").into(By.name("birthMonth")),
                Click.on(llenadoformulario.BDAY_INPUT),
                Enter.theValue("9").into(By.name("birthDay")),
                Click.on(llenadoformulario.BYEAR_INPUT),
                Enter.theValue("2000").into(By.name("birthYear")),
                Click.on(llenadoformulario.L_SPOKEN_INPUT),
                Enter.theValue("spa").into(By.cssSelector("input.ui-select-search")),
                Click.on(llenadoformulario. L_SPOKEN_INPUT2)
        );
        actor.attemptsTo(Click.on(llenadoformulario.PRESS_NEXT_LOCATION),
                Enter.theValue("Bogot").into(llenadoformulario.INPUT_CITY),
                Click.on(llenadoformulario.CITY_SELECTOR),
                Enter.theValue("50001").into(llenadoformulario.INPUT_ZIP),
                Click.on(llenadoformulario.PRESS_NEXT_DEVICES),
                Click.on(llenadoformulario.PRESS_LASTSTEP_BUTTON),
                Enter.theValue("FxhDJvkZqT8KfPB").into(llenadoformulario.PASSWORD),
                Enter.theValue("FxhDJvkZqT8KfPB").into(llenadoformulario.CONFIRMPASSWORD),
                Click.on(llenadoformulario.CHECK_BOX),
                Click.on(llenadoformulario.CHECK_BOX),
                Click.on(llenadoformulario.CHECK_BOX_ERROR),
                Click.on(llenadoformulario.CHECK_BOX_ERROR),
                Click.on(llenadoformulario.PRESS_COMPLETE_BUTTON)
        );

        actor.attemptsTo(Click.on(llenadoformulario.LOG_IN),
                Click.on(llenadoformulario.USER),
                Enter.theValue("Sergio9994@gmail.com").into(llenadoformulario.USER),
                Click.on(llenadoformulario.USER_PASS),
                Enter.theValue("FxhDJvkZqT8KfPB").into(llenadoformulario.USER_PASS)

        );

        actor.attemptsTo(Click.on(llenadoformulario.SIGN_IN)

        );
    }
}

*/