package tufirma.tests.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.TuFirma.AdminPage;
import org.TuFirma.LandingPage;
import org.TuFirma.LoginPage;
import tufirma.tests.hooks.Hooks;

public class Login {
    private LandingPage landingPage;
    private LoginPage loginPage;
    private AdminPage adminPage;

    public Login(){
        this.loginPage = new LoginPage(Hooks.getDriver());
        this.landingPage = new LandingPage(Hooks.getDriver());
        this.adminPage = new AdminPage(Hooks.getDriver());
    }
    @Dado("el usuario se encuentra en la pagina landing")
    public void elUsuarioSeEncuentraEnLaPaginaLanding (){
        landingPage.levantarPagina("https://staging-tufirma.web.app/");
            }


    @Y("se dirige a la seccion de login")
    public void seDirigeALaSeccionDeLogin() {
        landingPage.clickarIniciarSesionLP();
    }

    @Cuando("agrega las credenciales validadas")
    public void agregaLasCredencialesValidadas() {
        loginPage.login("abelboggetti@gmail.com","123456");
            }

    @Entonces("se valida el login")
    public void seValidaElLogin() {
        adminPage.validarAdminPage1();
        adminPage.validarAdminPage2();
    }
}
