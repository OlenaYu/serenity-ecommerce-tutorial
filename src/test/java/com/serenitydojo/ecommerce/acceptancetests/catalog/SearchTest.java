package com.serenitydojo.ecommerce.acceptancetests.catalog;

import com.serenitydojo.ecommerce.actions.NavigationActions;
import com.serenitydojo.ecommerce.actions.SearchActions;
import com.serenitydojo.ecommerce.actions.SearchResultsPage;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchTest extends UIInteractionSteps {
    NavigationActions navigation;
    SearchActions search;
    SearchResultsPage searchResultsPage;
    @Test
    void shouldDisplayTheSearchResults(){
        navigation.openTheApplication();
        search.forProduct("Hero Hoodie");
        String resultTitle = searchResultsPage.getSearchResultTitle();

        Assertions.assertThat(resultTitle).isEqualTo("Search results for: 'Hero Hoodie'");

    }
}
