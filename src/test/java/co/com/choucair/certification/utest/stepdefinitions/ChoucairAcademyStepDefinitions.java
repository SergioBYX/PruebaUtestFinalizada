package co.com.choucair.certification.utest.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.AcademyChoucairData;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Task_LlenadoFormulario;
import tasks.Task_Login;
import tasks.OpenUp;
import tasks.Task_OpenChrome;

import java.util.List;


public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^correctly the information in the alphanumeric fields$")
    public void correctlyTheInformationInTheAlphanumericFields() {
        OnStage.theActorCalled("Sergio").wasAbleTo(Task_OpenChrome.onThePage());

    }

    @When("^Click on the Sign in button$")
    public void clickOnTheSignInButton() {
        OnStage.theActorCalled("Sergio").wasAbleTo(Task_Login.onThePage());
    }

    @Then("^you can fill the login fields for the start of$")
    public void youCanFillTheLoginFieldsForTheStartOf(List<AcademyChoucairData> academychoucairData) throws Exception{
        OnStage.theActorCalled("Sergio").wasAbleTo(Task_LlenadoFormulario.onThePage(
                academychoucairData.get(0).getSrtUser(),
                academychoucairData.get(0).getSrtUser2(),
                academychoucairData.get(0).getCorreo(),
                academychoucairData.get(0).getDia(),
                academychoucairData.get(0).getMes(),
                academychoucairData.get(0).getAno(),
                academychoucairData.get(0).getLenguaje(),
                academychoucairData.get(0).getCiudad(),
                academychoucairData.get(0).getPostal(),
                academychoucairData.get(0).getContrasena(),
                academychoucairData.get(0).getContrasena(),
                academychoucairData.get(0).getSistemaoperativo(),
                academychoucairData.get(0).getSistemaversion(),
                academychoucairData.get(0).getSistemalenguaje()

                ));
    }

}
