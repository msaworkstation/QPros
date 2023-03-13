package org.qpros.modules;

import org.qpros.actions.WebActions;
import org.qpros.pages.LoginPage;
import org.qpros.pages.PlaceOrderPage;
import org.testng.annotations.Test;

public class PlaceOrder extends BaseTest {

    @Test
    void placeOrder() {
        goToCart();
        WebActions.click(getDriver(), PlaceOrderPage.PLACE_ORDER_BUTTON.getBy());
        WebActions.waitForVisibility(getDriver(), PlaceOrderPage.NAME.getBy(), 30);
        WebActions.type(getDriver(), PlaceOrderPage.NAME.getBy(), testdataUser);
        WebActions.type(getDriver(), PlaceOrderPage.COUNTRY.getBy(), testdataUser);
        WebActions.type(getDriver(), PlaceOrderPage.CITY.getBy(), testdataUser);
        WebActions.type(getDriver(), PlaceOrderPage.CARD.getBy(), testdataUser);
        WebActions.type(getDriver(), PlaceOrderPage.MONTH.getBy(), testdataUser);
        WebActions.type(getDriver(), PlaceOrderPage.YEAR.getBy(), testdataUser);
        WebActions.click(getDriver(), PlaceOrderPage.PURCHASE.getBy());
        WebActions.assertText(getDriver(), PlaceOrderPage.THANK_YOU_TEXT.getBy(), "Thank you for your purchase!");
        WebActions.click(getDriver(), PlaceOrderPage.OK_BUTTON.getBy());
    }
}
