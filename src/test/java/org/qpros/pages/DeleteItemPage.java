package org.qpros.pages;

import org.openqa.selenium.By;

public enum DeleteItemPage {

    DELETE_BUTTON(By.xpath("//*[contains(text(),'Delete')]"));


    private By by;

    DeleteItemPage(By by) {
        this.by = by;
    }

    public By getBy() {
        return by;
    }
}
