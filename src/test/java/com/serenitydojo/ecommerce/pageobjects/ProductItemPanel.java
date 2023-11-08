package com.serenitydojo.ecommerce.pageobjects;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.screenplay.ui.Image;

public class ProductItemPanel extends PageComponent {

    public void selectItem(String itemName) {
        find(Image.withAltText(itemName)).click();
    }

    public void selectItem(String itemName, String size, String color) {
        find(Image.withAltText(itemName)).click();

        findBy(".swatch-option[option-label={0}]", size).click();//when we use findBy we can use the arguments, like here is {0}, size
        //findBy((".swatch-option[option-label=XS")).click();
        findBy(".swatch-option[option-label={0}]", color).click();
    }
}
