package org.qpros.modules;

import org.qpros.actions.WebActions;
import org.qpros.pages.RegisterPage;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class Register extends BaseTest {

    @Test
    void register() {
        WebActions.open(getDriver(), url);
        WebActions.click(getDriver(), RegisterPage.Register.getBy());
        WebActions.waitForVisibility(getDriver(), RegisterPage.USERNAME.getBy(), 30);
        WebActions.type(getDriver(), RegisterPage.USERNAME.getBy(), testdataUser);
        WebActions.type(getDriver(), RegisterPage.PASSWORD.getBy(), testdataUser);
        WebActions.click(getDriver(), RegisterPage.SIGN_UP_BUTTON.getBy());
        WebActions.pause(3);
        String alertText = WebActions.handleAlert(getDriver(), true, true);
        assertEquals( "Sign up successful.",alertText);
    }
}
