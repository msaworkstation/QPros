package org.qpros.modules;

import org.openqa.selenium.WebElement;
import org.qpros.actions.WebActions;
import org.qpros.pages.AddItemsPage;
import org.qpros.pages.LoginPage;
import org.testng.annotations.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AddItem extends BaseTest {

    @Test
    void addItem() {
        WebActions.open(getDriver(), url);
        WebActions.waitForVisibility(getDriver(), AddItemsPage.CARDS.getBy(), 30);
        List<WebElement> cards = getDriver().findElements(AddItemsPage.CARDS.getBy());
        WebActions.click(getDriver(), cards.get(0));

        WebActions.waitForVisibility(getDriver(), AddItemsPage.ADD_TO_CARD.getBy(), 30);
        WebActions.click(getDriver(), AddItemsPage.ADD_TO_CARD.getBy());

        WebActions.pause(3);
        String alertText = WebActions.handleAlert(getDriver(), true, true);
        assertEquals("Product added.", alertText);
    }
}
