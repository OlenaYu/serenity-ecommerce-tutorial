package com.serenitydojo.ecommerce.actions;

import com.serenitydojo.ecommerce.pageobjects.ShoppingCartComponent;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

import java.util.List;

public class CartActions extends UIInteractionSteps {
    ShoppingCartComponent shoppingCart;
    @Step("Show the shopping cart summary")
    public void showCartSummary() {
        shoppingCart.showCartSummary();
    }
    @Step("Show the list of items in the cart")
    public List<String> itemsInTheCart() {
        shoppingCart.showCartSummary();
        return shoppingCart.getItems();
    }
}
