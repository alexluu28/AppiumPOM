package com.example.appiumproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends BasePage{

    //locators
    @AndroidFindBy (xpath = "//android.widget.TextView[@content-desc='App']")
    public WebElement appBtn;

    @AndroidFindBy (xpath = "//android.widget.TextView[@content-desc='Accessibility Service']")
    public WebElement accessibilityServiceBtn;

    @AndroidFindBy (xpath = "//android.widget.TextView[@content-desc='Accessibility']")
    public WebElement accessibilityBtn;

    //page factory constructor
    public HomePage(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    //methods
    public void clickOnAppBtn(){
        click(appBtn);
    }
}
