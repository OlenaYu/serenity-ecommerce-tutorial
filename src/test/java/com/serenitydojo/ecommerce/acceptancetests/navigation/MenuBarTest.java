package com.serenitydojo.ecommerce.acceptancetests.navigation;

import com.serenitydojo.ecommerce.actions.HomePageActions;
import com.serenitydojo.ecommerce.actions.MenuBarActions;
import com.serenitydojo.ecommerce.actions.NavigationActions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(SerenityJUnit5Extension.class)
class MenuBarTest {

    NavigationActions navigate;
    MenuBarActions menuBar;
    HomePageActions homePage;
    @Test
    void ShouldDisplayTheCorrectTitle() {
        navigate.openTheApplication();
        assertThat(homePage.getTitle()).isEqualToIgnoringCase("Home Page");
    }

    @Test
    void shouldDisplayTheTopLevelMenuItemsOnTheHomePage() {
        navigate.openTheApplication();
        assertThat(menuBar.topLevelMenuItems()).contains("What's New", "Women", "Men", "Gear", "Training", "Sale");
    }
}
