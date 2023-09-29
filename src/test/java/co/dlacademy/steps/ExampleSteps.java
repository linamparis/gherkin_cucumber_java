package co.dlacademy.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleSteps {

    @Given("que el {word} esta en la pagina web")
    public void UsuarioEstaPaginaWeb(String nombre) {
        System.out.println(nombre + " esta en la pagina con sus credenciales");
    }

    @When("ingresa las credenciales")
    public void ingresaLasCredenciales() {
        System.out.println("Usuario ingresa sus credenciales");
        System.out.println("Da click en Login");
    }

    @Then("el deberia ingresar al home de la pagina")
    public void elDeberiaIngresarAlHomeDeLaPagina() {
        System.out.println("El usuario se autentico");
    }
}
