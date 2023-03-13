package org.qpros.modules;

import org.openqa.selenium.WebElement;
import org.qpros.actions.WebActions;
import org.qpros.pages.CheckListPage;
import org.qpros.pages.LoginPage;
import org.testng.annotations.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class CheckListItems extends BaseTest {

    @Test
    void checkListItems() {
        WebActions.open(getDriver(), url);
        WebActions.waitForVisibility(getDriver(), CheckListPage.CARDS.getBy(), 30);
        List<WebElement> cards = getDriver().findElements(CheckListPage.CARDS.getBy());
        int cardCount = cards.size();
        assertTrue(cardCount > 0);
    }
}
