package com.serenitydojo.ecommerce.acceptancetests.navigation;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.ui.PageElement;
import org.junit.jupiter.api.Test;
import net.serenitybdd.screenplay.ui.Button;
import static org.assertj.core.api.Assertions.assertThat;

public class DisplayYogaShopTest extends UIInteractionSteps {
    @Test
    void shouldDisplayYogaShop() {
        openUrl("https://magento.softwaretestingboard.com/");
        find((Button.withText("Shop New Yoga"))).click();
       // elementWithText("Shop New Yoga").click();
        String pageTitle = $("//h1[@id='page-title-heading']").getText();
        assertThat(pageTitle).isEqualTo("New Luma Yoga Collection");
    }
    @Test
    void shouldDisplayEcoFriendlySection() {
        openUrl("https://magento.softwaretestingboard.com/");
        find(PageElement.containingText("Eco-Friendly")).click();
        //elementWithText("Eco-Friendly").click();
        String pageTitle = $("//h1[@id='page-title-heading']").getText();
        assertThat(pageTitle).isEqualTo("Eco Friendly");
    }

    private WebElementFacade elementWithText(String text) {
        return findBy("//span[contains(.,'{0}')]", text);//text refers to the text inside the element only, while dot - to the nested structure as well
    }
}
