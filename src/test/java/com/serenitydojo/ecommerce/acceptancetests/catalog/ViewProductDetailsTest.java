package com.serenitydojo.ecommerce.acceptancetests.catalog;

import com.serenitydojo.ecommerce.actions.CatalogActions;
import com.serenitydojo.ecommerce.actions.NavigationActions;
import com.serenitydojo.ecommerce.actions.ProductDetailsActions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(SerenityJUnit5Extension.class)
class ViewProductDetailsTest {
    NavigationActions navigation;
    CatalogActions fromTheCatalog;
    ProductDetailsActions productDetails;

    @Test
    void shouldShowProductDetails() {
        navigation.openTheApplication();
        fromTheCatalog.showProductDetails("Breathe-Easy Tank");

        assertThat(productDetails.getProductTitle()).isEqualTo("Breathe-Easy Tank");

    }
}
