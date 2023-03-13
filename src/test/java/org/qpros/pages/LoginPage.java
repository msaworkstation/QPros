package org.qpros.pages;

import org.openqa.selenium.By;

public enum LoginPage {

    USERNAME(By.id("loginusername")),
    PASSWORD(By.id("loginpassword")),
    LOG_IN_BUTTON(By.xpath("//button[contains(text(),'Log in')]")),
    LOG_IN(By.id("login2")), WELCOME_LINK(By.id("nameofuser"));




    private By by;

    LoginPage(By by) {
        this.by = by;
    }

    public By getBy() {
        return by;
    }
}
