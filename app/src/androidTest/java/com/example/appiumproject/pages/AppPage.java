package com.example.appiumproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AppPage extends BasePage {

    //locators
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Activity']")
    public WebElement activityBtn;

    //page factory constructor
    public AppPage(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    //methods
    public void clickOnActivityBtn(){
        click(activityBtn);
    }
}
