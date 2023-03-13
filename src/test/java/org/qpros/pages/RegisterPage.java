package org.qpros.pages;

import org.openqa.selenium.By;

public enum RegisterPage {

    Register(By.id("signin2")),
    USERNAME(By.id("sign-username")),
    PASSWORD(By.id("sign-password")), SIGN_UP_BUTTON(By.xpath("//button[contains(text(),'Sign up')]")), LOG_IN(By.id("login2"));




    private By by;

    RegisterPage(By by) {
        this.by = by;
    }

    public By getBy() {
        return by;
    }
}
