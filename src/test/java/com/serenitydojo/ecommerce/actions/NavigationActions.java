package com.serenitydojo.ecommerce.actions;

import com.serenitydojo.ecommerce.pageobjects.LumaHomePage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class NavigationActions extends UIInteractionSteps {
    LumaHomePage lumaHomePage;
    @Step
    public void openTheApplication() {
        lumaHomePage.open();
    }
}
