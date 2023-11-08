package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends PageObject {
    @FindBy(css = ".page-title" )//if use this more than 1 time
    WebElementFacade searchResultsTitle;//if use this more than 1 time
     public String getSearchResultTitle() {
         return searchResultsTitle.getText();//if use this more than 1 time
        //return $(".page-title").getText();//simple option
    }

}
