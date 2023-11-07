package com.serenitydojo.ecommerce.acceptancetests.catalog;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.ui.Image;
import net.serenitybdd.screenplay.ui.Link;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.*;

public class DisplayProductTest extends UIInteractionSteps {
    @Test
    void shouldBeAbleToShowProductDetailsPageFromTheCatalog() {
        openUrl("https://magento.softwaretestingboard.com/");
        //$(By.linkText("Argus All-Weather Tank")).click(); //full match
        //find(Link.withText("Argus All-Weather Tank")).click();
        find(Image.withAltText("Argus All-Weather Tank")).shouldBeVisible();
        find(Image.withAltText("Argus All-Weather Tank")).click();

        String productName = $(By.className("page-title")).getText();

        assertThat(productName).isEqualTo("Argus All-Weather Tank");
    }
    @Test
    void shouldShowProductCollectionDetails() {
        openUrl("https://magento.softwaretestingboard.com/");
        $(By.partialLinkText("New Luma Yoga Collection")).click(); //partial match
        String productName = $(By.className("page-title")).getText();

        assertThat(productName).isEqualTo("New Luma Yoga Collection");




    }
}
