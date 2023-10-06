package co.dlacademy.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutenticacionSteps {

    @Given("que {word} esta en la pagina web")
    public void AdminEstaPaginaWeb(String nombreUsuario) {
        System.out.println(nombreUsuario + " esta en la pagina esperando autenticarse");
    }

    @Given("que {string} esta en la pagina inicial")
    public void ManagerEstaPaginaWeb(String nombreUsuario) {
        System.out.println(nombreUsuario + " esta en la pagina esperando autenticarse");
    }

    @Given("que {} esta en la pagina")
    public void UserEstaPaginaWeb(String nombreUsuario) {
        System.out.println(nombreUsuario + " esta en la pagina esperando autenticarse");
    }


    @When("ingresa las credenciales y su id {int}")
    public void ingresaLasCredenciales(int idUsuario) {
        System.out.println("Usuario ingresa sus credenciales");
        System.out.println("Da click en Login");
        System.out.println("Id del usuario= " + idUsuario);
    }


    @Then("el deberia ingresar al home de la pagina")
    public void elDeberiaIngresarAlHomeDeLaPagina() {
        System.out.println("El usuario se autentico \n");
    }
}
