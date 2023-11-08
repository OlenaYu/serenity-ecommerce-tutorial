package com.serenitydojo.ecommerce.acceptancetests.accounts;

import com.serenitydojo.ecommerce.actions.LoginActions;
import com.serenitydojo.ecommerce.actions.RegisterAccountAction;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.junit.jupiter.api.Test;



public class CreateAnAccountTest extends UIInteractionSteps {
    @Steps
    RegisterAccountAction registerAccount;
    @Steps
    LoginActions login;
    @Test
    void shouldCreateANewCustomerAccount() {
        registerAccount.forNewCustomer("Jonny", "Donny", randomEmail(), "Secret123#");
        waitForTextToAppear("Thank you for registering with Main Website Store.");
    }
    @Test
    void userShouldBeAbleToLogOnWithTheRegisteredAccount() {
        String email = randomEmail();
        registerAccount.forNewCustomer("Izabella", "Ray", randomEmail(), "Secret123#");
        waitForTextToAppear("Welcome, Izabella Ray!");
        login.signOut();
        login.using(email, "Secret123#");


    }
    private String randomEmail() {
        return "any_random_address" + System.currentTimeMillis() + "@random.com";
    }
}
