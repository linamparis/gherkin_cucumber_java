package co.dlacademy.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class RegisterSteps {

    @When("the user fill out the form")
    public void fillOutForm(DataTable userInfo) {
        List<Map<String, String>> userRegisterInfo = userInfo.asMaps();
        System.out.println("The user use this info to register");
        for (int i = 0; i < userRegisterInfo.size(); i++){
            System.out.println(userRegisterInfo.get(i).get("user"));
            System.out.println(userRegisterInfo.get(i).get("name") + " " + userRegisterInfo.get(i).get("lastname"));
            System.out.println(userRegisterInfo.get(i).get("address"));
            System.out.println(userRegisterInfo.get(i).get("phone"));
            System.out.println(userRegisterInfo.get(i).get("mail"));
            System.out.println(userRegisterInfo.get(i).get("country"));
            System.out.println(userRegisterInfo.get(i).get("state"));

        }
    }

    @Then("the {word} will have a new account to login")
    public void userRegistered(String username){
        System.out.println("The user " + username + "was  registered \n \n");
    }


}
