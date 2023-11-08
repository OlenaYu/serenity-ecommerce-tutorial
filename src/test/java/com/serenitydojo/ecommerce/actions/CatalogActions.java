package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.ui.Link;
import org.openqa.selenium.By;

public class CatalogActions extends UIInteractionSteps {
    @Step("Show product details for '{0}'")
    public void showProductDetails(String productName) {
        $(Link.withText(productName)).click();
    }
}
