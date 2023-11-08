package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.Dropdown;
import net.serenitybdd.screenplay.ui.InputField;
import net.serenitybdd.screenplay.ui.Link;

public class LoginActions extends UIInteractionSteps {
    @Step("Log in with {0} email and {1} password")
    public void using(String email, String password) {
        find(Link.withText("Sign In")).click();
        find(InputField.withLabel("Email")).type(email);
        find(InputField.withLabel("Password")).type(password);
        find(Button.withText("Sign In")).click();
    }
    @Step("Sign-Out from the system")
    public void signOut() {
        $("[data-action = customer-menu-toggle]").click();
        $(Link.withText("Sign Out")).click();
    }
}
