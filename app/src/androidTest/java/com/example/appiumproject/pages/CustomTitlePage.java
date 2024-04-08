package com.example.appiumproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CustomTitlePage extends BasePage {

    //locators
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Left is best']")
    public WebElement changeLeftTextField;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Change Left']")
    public WebElement changeLeftBtn;

    @AndroidFindBy(id = "io.appium.android.apis:id/left_text")
    public WebElement changeLeftHeader;

    //page factory constructor
    public CustomTitlePage(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    //methods
    public void clearLeftTextField(){
        changeLeftTextField.clear();
    }

    public void SetLeftTextField(String text){
        changeLeftTextField.sendKeys(text);
    }

    public void clickLeftChangeBtn(){
        click(changeLeftBtn);
    }
}
