package org.qpros.modules;

import org.qpros.actions.WebActions;
import org.qpros.pages.LoginPage;
import org.testng.annotations.Test;

public class Login extends BaseTest {

    @Test
    void login() {
        WebActions.open(getDriver(), url);
        WebActions.click(getDriver(), LoginPage.LOG_IN.getBy());
        WebActions.waitForVisibility(getDriver(), LoginPage.USERNAME.getBy(), 30);
        WebActions.type(getDriver(), LoginPage.USERNAME.getBy(), testdataUser);
        WebActions.type(getDriver(), LoginPage.PASSWORD.getBy(), testdataUser);
        WebActions.click(getDriver(), LoginPage.LOG_IN_BUTTON.getBy());
        WebActions.waitForVisibility(getDriver(), LoginPage.WELCOME_LINK.getBy(), 30);
        WebActions.assertText(getDriver(), LoginPage.WELCOME_LINK.getBy(), "Welcome " + testdataUser);
    }
}
