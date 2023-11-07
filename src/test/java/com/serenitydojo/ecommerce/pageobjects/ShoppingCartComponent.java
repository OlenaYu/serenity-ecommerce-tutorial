package com.serenitydojo.ecommerce.pageobjects;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCartComponent extends PageComponent {
    //PageComponent is the same as PageObject in Serenity except the first means it's the part of the page but not the whole thing
    @FindBy(css = ".showcart")
    WebElementFacade showCartIcon;

    public final String MINI_CART_PRODUCT_ITEM_NAME = "#mini-cart .product-item-name";


    @FindBy(css = "#mini-cart .product-item-name")
    List<WebElementFacade> items;
    public void showCartSummary() {
        showCartIcon.click();
    }

    public List<String> getItems() {
        //return items.stream().map(item -> item.getText()).collect(Collectors.toList()); better not to use, there is a better option in Serenity
        return findAll(MINI_CART_PRODUCT_ITEM_NAME).texts();
    }


}
