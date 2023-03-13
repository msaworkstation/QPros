package org.qpros.pages;

import org.openqa.selenium.By;

public enum PlaceOrderPage {

    PLACE_ORDER_BUTTON(By.xpath("//*[contains(text(),'Place Order')]")),
    NAME(By.id("name")),
    COUNTRY(By.id("country")),
    CITY(By.id("city")),
    CARD(By.id("card")),
    MONTH(By.id("month")),
    YEAR(By.id("year")),
    PURCHASE(By.xpath("//*[contains(text(),'Purchase')]")),
    THANK_YOU_TEXT(By.xpath("//h2[contains(text(),'Thank you for your purchase!')]")),
    OK_BUTTON(By.xpath("//button[contains(text(),'OK')]"));



    private By by;

    PlaceOrderPage(By by) {
        this.by = by;
    }

    public By getBy() {
        return by;
    }
}
