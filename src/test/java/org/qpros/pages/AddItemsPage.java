package org.qpros.pages;

import org.openqa.selenium.By;

public enum AddItemsPage {

    CARDS(By.xpath("//*[@class='card h-100']")),
    ADD_TO_CARD(By.xpath("//a[contains(text(),'Add to cart')]"));


    private By by;

    AddItemsPage(By by) {
        this.by = by;
    }

    public By getBy() {
        return by;
    }
}
