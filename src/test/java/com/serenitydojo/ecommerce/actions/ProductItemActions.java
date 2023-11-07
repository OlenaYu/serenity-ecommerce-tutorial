package com.serenitydojo.ecommerce.actions;

import com.serenitydojo.ecommerce.pageobjects.ProductItemPanel;
import com.serenitydojo.ecommerce.pageobjects.ProductDetailsPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class ProductItemActions extends UIInteractionSteps {
    ProductItemPanel productItemPanel;
    ProductDetailsPage productDetails;
    @Step("Add {0} with size {1} and {color} to the shopping cart")
    public void addItemToCart(String itemName, String size, String color) {
        productItemPanel.selectItem(itemName, size, color);
        productDetails.addToCart();
    }
}
