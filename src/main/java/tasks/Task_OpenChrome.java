package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.UserInt_OpenChrome;


public class Task_OpenChrome implements Task {
    private UserInt_OpenChrome UserInt_OpenChrome;

    public static Performable onThePage() {

        return Tasks.instrumented(Task_OpenChrome.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(UserInt_OpenChrome));
    }
}


/*
*
* package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class Task_OpenChrome implements Task {
    public static Performable onThePage() {
        return Tasks.instrumented(Task_OpenChrome.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}

*
* */