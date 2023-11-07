package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.ui.InputField;
import org.openqa.selenium.Keys;

public class SearchActions extends UIInteractionSteps {
    @Step("Search for '{0}'")
    public void forProduct(String keywords) {
        $(InputField.withPlaceholder("Search entire store here...")).type(keywords, Keys.ENTER);

    }
}
