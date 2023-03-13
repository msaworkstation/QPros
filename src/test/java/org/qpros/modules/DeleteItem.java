package org.qpros.modules;

import org.qpros.actions.WebActions;
import org.qpros.pages.DeleteItemPage;
import org.qpros.pages.LoginPage;
import org.testng.annotations.Test;

public class DeleteItem extends BaseTest {

    @Test
    void deleteItem() {
        goToCart();
        WebActions.waitForVisibility(getDriver(), DeleteItemPage.DELETE_BUTTON.getBy(), 30);
        WebActions.click(getDriver(), DeleteItemPage.DELETE_BUTTON.getBy());
        WebActions.pause(2);
    }
}
