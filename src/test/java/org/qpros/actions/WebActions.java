package org.qpros.actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class WebActions {

    public static void click(WebDriver webDriver, By by){
        getElement(webDriver, by).click();
    }

    public static void click(WebDriver webDriver, WebElement webElement){
        webElement.click();
    }

    public static void open(WebDriver webDriver, String url){
        webDriver.get(url);
        webDriver.manage().window().maximize();
    }
    public static void waitForVisibility(WebDriver webDriver, By by, int timeout){
        WebDriverWait wait = new WebDriverWait(webDriver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void type(WebDriver webDriver, By by, String value){
        getElement(webDriver, by).sendKeys(value);
    }

    public static void assertText(WebDriver webDriver, By by, String value){
        assertEquals(getElement(webDriver, by).getText(),value);
    }

    private static WebElement getElement(WebDriver webDriver, By by) {
        return webDriver.findElement(by);
    }

    //Debug Action
    public static void pause(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static String handleAlert(WebDriver driver, boolean getText, boolean acceptOrDeny) {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        if(acceptOrDeny){
            alert.accept();
        } else{
            alert.dismiss();
        }
        return (getText)? alertText : "" ;
    }
}
