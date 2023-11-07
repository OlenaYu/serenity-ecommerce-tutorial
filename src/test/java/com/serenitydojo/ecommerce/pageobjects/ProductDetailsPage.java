package com.serenitydojo.ecommerce.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageObject {
    /* @FindBy
    used to direct the WebDriver to locate that element on a page. It takes the locating mechanism
    (that is, by Id , Name , or Class Name ) and the value of the element for that locating mechanism as input.
     */
    @FindBy(css = "button[title='Add to Cart']")
    //@FindBy(id = "product-addtocart-button") - does not work for me
    WebElementFacade addToCartButton;

    @FindBy(css = ".loader")
    WebElementFacade spinner;
    public void addToCart() {
        addToCartButton.click();
        spinner.waitUntilVisible();
        spinner.waitUntilNotVisible();
    }



}
