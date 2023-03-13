package org.qpros.pages;

import org.openqa.selenium.By;

public enum GoToCartPage {

    CART_PAGE(By.id("cartur"));


    private By by;

    GoToCartPage(By by) {
        this.by = by;
    }

    public By getBy() {
        return by;
    }
}
