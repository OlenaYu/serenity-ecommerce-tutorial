package com.serenitydojo.ecommerce.actions;

import com.serenitydojo.ecommerce.pageobjects.ProductDetailsPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class ProductDetailsActions extends UIInteractionSteps {
    ProductDetailsPage productDetailsPage;
    public String getProductTitle() {
        return $(".page-title").getText();
    }
    @Step
    public void addToCart() {
        productDetailsPage.addToCart();
    }
}
