package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

import java.util.List;

public class MenuBarActions extends UIInteractionSteps {
    @Step("Read the top level menu items")
    public List<String> topLevelMenuItems() {
        return findAll(".navigation a.level-top").texts();
    }
}
