package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

    public class UserInt_LlenadoFormulario extends PageObject {
        public static final Target FIRSTNAME_INPUT = Target.the("Nombre del usuario").located(By.id("firstName"));
        public static final Target LAST_NAME_INPUT = Target.the("Apellidos del usuario").located(By.id("lastName"));
        public static final Target EMAIL_INPUT = Target.the("correo electronico del usuario").located(By.id("email"));
        public static final Target BMONTH_INPUT = Target.the("Fecha de nacimiento: Mes").located(By.name("birthMonth"));
        public static final Target BDAY_INPUT = Target.the("Fecha de nacimiento: Dia").located(By.id("birthDay"));
        public static final Target BYEAR_INPUT = Target.the("Fecha de nacimiento: Año").located(By.id("birthYear"));
        public static final Target L_SPOKEN_INPUT = Target.the("Añadir idiomas hablados").located(By.cssSelector("input.ui-select-search"));
        public static final Target L_SPOKEN_INPUT2 = Target.the("Añadir idiomas hablados").located(By.cssSelector("span.ui-select-highlight"));
        public static final Target PRESS_NEXT_LOCATION = Target.the("Boton ir a ubicacion").located(By.cssSelector("a.btn.btn-blue"));
        public static final Target INPUT_CITY = Target.the("Ciudad del usuario").located(By.id("city"));
        public static final Target CITY_SELECTOR = Target.the("Seleccion ciudad del usuario").located(By.cssSelector("span.pac-matched"));
        public static final Target INPUT_ZIP = Target.the("Codigo postal del usuario").located(By.id("zip"));
        public static final Target PRESS_NEXT_DEVICES = Target.the("Clic en boton ir a Dispositivos").located(By.cssSelector("a.btn.btn-blue.pull-right"));



        public static final Target IMPUT_WIN = Target.the("sistema operativo").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));
        public static final Target IMPUT_select = Target.the("sistema operativo").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));


        public static final Target IMPUT_VER = Target.the("sistema operativo").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
        public static final Target IMPUT_select_VER= Target.the("sistema operativo").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));



        public static final Target IMPUT_LENG = Target.the("sistema operativo").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
        public static final Target IMPUT_select_LENG= Target.the("sistema operativo").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));




        public static final Target PRESS_LASTSTEP_BUTTON = Target.the("Clic en boton ir a ultimos pasos").located(By.cssSelector("a.btn.btn-blue.pull-right"));
        public static final Target PASSWORD = Target.the("Contraseña").located(By.id("password"));
        public static final Target CONFIRMPASSWORD = Target.the("Confirmar contraseña").located(By.id("confirmPassword"));
        public static final Target CHECK_BOX = Target.the("campo de seleccion 1").located(By.id("laddaBtn"));
        public static final Target CHECK_BOX_ERROR = Target.the("campo de seleccion 2").located(By.cssSelector("span.checkmark.signup-consent__checkbox.error"));
        public static final Target PRESS_COMPLETE_BUTTON = Target.the("Clic en boton completar registro").located(By.cssSelector("a#laddaBtn.btn-blue"));
        public static final Target LOG_IN = Target.the("Clic en boton Unete Hoy creacion usuario").located(By.linkText("Log In"));
        public static final Target USER = Target.the("Nombre del usuario").located(By.id("username"));
        public static final Target USER_PASS = Target.the("Apellidos del usuario").located(By.id("password"));
        public static final Target SIGN_IN = Target.the("Clic en boton Unete Hoy creacion usuario").located(By.id("kc-login"));


    }

    // //INPUT[@id='firstName']