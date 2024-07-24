package com.example.appiumproject.tests;

import com.example.appiumproject.pages.ActivityPage;
import com.example.appiumproject.pages.AlertsDialoguePage;
import com.example.appiumproject.pages.AppPage;
import com.example.appiumproject.pages.BaseTest;
import com.example.appiumproject.pages.CustomTitlePage;
import com.example.appiumproject.pages.HomePage;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class CustomTitleLeftTest extends BaseTest {

    HomePage homePage;
    AppPage appPage;
    ActivityPage activityPage;
    CustomTitlePage customTitlePage;
    AlertsDialoguePage alertsDialoguePage;


    @BeforeMethod
    public void setUp() throws MalformedURLException {
        initialization();
        homePage = new HomePage();
        appPage = new AppPage();
        activityPage = new ActivityPage();
        customTitlePage = new CustomTitlePage();
        alertsDialoguePage = new AlertsDialoguePage();
    }

    @Test
    public void customTitleLeftTest() throws InterruptedException {
        homePage.clickOnAppBtn();
        appPage.clickOnActivityBtn();
        activityPage.clickOnCustomTitleBtn();
        customTitlePage.clearLeftTextField();
        customTitlePage.SetLeftTextField("Hello My Dear");
        customTitlePage.clickLeftChangeBtn();

        String actualLeftHeader = customTitlePage.changeLeftHeader.getText();
        System.out.println(actualLeftHeader);
        String expectedLeftHeader = "Hello My Dear";
        Assert.assertEquals(actualLeftHeader, expectedLeftHeader, "titles do not match");

    }

    @Test
    public void handleAlertsTest(){
        homePage.clickOnAppBtn();
        appPage.clickOnAlertDialogsBtn();
        alertsDialoguePage.clickOkCancelMsg();
        alertsDialoguePage.clickOkAlertBtn();


    }
}
