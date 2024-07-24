package com.example.appiumproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AlertsDialoguePage extends BasePage{

    //locators
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='OK Cancel dialog with a message']")
    public WebElement okCancelMsgBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
    public WebElement alertOkBtn;



    //page factory constructor
    public AlertsDialoguePage(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    //methods
    public void clickOkCancelMsg(){
        click(okCancelMsgBtn);
    }

    public void clickOkAlertBtn(){
        click(alertOkBtn);
    }
}

