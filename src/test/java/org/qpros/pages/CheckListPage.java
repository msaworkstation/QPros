package org.qpros.pages;

import org.openqa.selenium.By;

public enum CheckListPage {

    CARDS(By.xpath("//*[@class='card h-100']"));


    private By by;

    CheckListPage(By by) {
        this.by = by;
    }

    public By getBy() {
        return by;
    }
}
