package org.qpros.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qpros.actions.WebActions;
import org.qpros.pages.GoToCartPage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.Random;

public class BaseTest {
    static WebDriver driver;
    final String url = "https://www.demoblaze.com/";
    static Random random = new Random();
    static int randomNumber = random.nextInt(100000);
    static String testdataUser = "valueqpros1" + randomNumber;

    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/seceng/Web app from github/qtask/qpros/drivers/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    protected void goToCart() {
        WebActions.open(getDriver(), url);
        WebActions.click(getDriver(), GoToCartPage.CART_PAGE.getBy());
    }
}
