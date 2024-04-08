package com.example.appiumproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ActivityPage extends BasePage{

    //locators
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Custom Title']")
    public WebElement customTitleBtn;

    //page factory constructor
    public ActivityPage(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    //methods
    public void clickOnCustomTitleBtn(){
        click(customTitleBtn);
    }
}
