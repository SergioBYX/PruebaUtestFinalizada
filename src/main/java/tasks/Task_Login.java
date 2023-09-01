package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.UserInt_Login;

public class Task_Login implements Task {
    private UserInt_Login Login;

    public static Task_Login onThePage() {
        return Tasks.instrumented(Task_Login.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(Login.JOINTODAY_BUTTON));

    }
}



/*
*
* package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.UserInt_Login;

public class Task_Login implements Task {
    private UserInt_Login Login;

    public static Task_Login onThePage() {
        return Tasks.instrumented(Task_Login.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(Login.JOINTODAY_BUTTON));

    }
}
*
* */