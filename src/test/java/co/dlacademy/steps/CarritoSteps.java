package co.dlacademy.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class CarritoSteps {
    @Given("{word} is on the main page")
    public void alejandra_is_on_the_main_page(String user) {
        System.out.println(user + " is logged in");
    }


    @When("the user add a product to the cart")
    public void the_user_add_some_product_to_the_cart(DataTable dataTable) {
        List<String> productsToBuy = dataTable.asList();
        for (int i = 0; i < productsToBuy.size(); i++) {
            System.out.println(productsToBuy.get(i));
        }
    }

    @Then("the user can see the product and the price")
    public void the_user_can_see_the_product_and_the_price() {
        System.out.println("The user sees the product into the cart \n");
    }

    @Given("{word} is on the home page")
    public void alejandra_is_on_the_main_page1(String user) {
        System.out.println(" The user is " + user);
    }


    @When("the user add the {word} to the cart")
    public void the_user_add_some_product_to_the_cart1(String product) {
        System.out.println(" The user are going to buy " + product);
    }

    @Then("the user can see the {int} of the product based on the {int}")
    public void the_user_can_see_the_product_and_the_price2(int price, int quantity) {
        System.out.println("The total price is " + price * quantity + "\n");
    }

}
