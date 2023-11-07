package com.serenitydojo.ecommerce.acceptancetests.cart;

import com.serenitydojo.ecommerce.actions.CartActions;
import com.serenitydojo.ecommerce.actions.NavigationActions;
import com.serenitydojo.ecommerce.actions.ProductDetailsActions;
import com.serenitydojo.ecommerce.actions.ProductItemActions;
import com.serenitydojo.ecommerce.pageobjects.ProductItemPanel;
import com.serenitydojo.ecommerce.pageobjects.ShoppingCartComponent;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class DisplayingItemsInTheCartTest extends UIInteractionSteps {

    @AfterEach
    public void tearDown()
    {
        getDriver().quit();
    }

   @Steps
    NavigationActions navigate;
   @Steps
    CartActions cart;
   @Steps
    ProductItemActions productItem;

    @Test
    void shouldDisplayNoItemsMessageIfThereAreNoItems() {
        navigate.openTheApplication();
        cart.showCartSummary();
        waitForTextToAppear("You have no items in your shopping cart.");
    }
    @Test
    void shouldBeAbleToAddASingleItemToTheCart() {
        navigate.openTheApplication();
        productItem.addItemToCart("Radiant Tee", "S", "Orange");

        assertThat(cart.itemsInTheCart()).contains("Radiant Tee");
    }

    @Test
    void shouldBeAbleToAddSeveralItemsToTheCart() {
        navigate.openTheApplication();
        productItem.addItemToCart("Argus All-Weather Tank", "M", "Gray");

        navigate.openTheApplication();
        productItem.addItemToCart("Hero Hoodie", "XL", "Green");

        assertThat(cart.itemsInTheCart()).containsExactlyInAnyOrder("Argus All-Weather Tank","Hero Hoodie" );
    }
}
