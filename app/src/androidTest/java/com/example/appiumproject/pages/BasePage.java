package com.example.appiumproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class BasePage {

    public static AndroidDriver driver = BaseTest.driver;

    public WebDriver getDriver() { return driver; }

    //methods to be reused by all pages
    protected WebElement elementBy(By locator) {
        return getDriver().findElement(locator);
    }

    protected void clearAndType(By locator, String input) {
        WebElement element = elementBy(locator);
        element.clear();
        element.sendKeys(input);
    }

    protected void sendKey(By locator, String input) {
        elementBy(locator).sendKeys(input);
    }

    public void click(WebElement e) {
        e.click();
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

}
