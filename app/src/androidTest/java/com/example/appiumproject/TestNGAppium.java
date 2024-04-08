//package com.example.appiumproject;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.time.Duration;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.options.UiAutomator2Options;
//
//import static com.example.appiumproject.Locators.*;
//
//public class TestNGAppium {

//WebDriver driver;

//    @BeforeTest(enabled = false)
//    public void setUp() throws MalformedURLException {
//        //create capabilities
//        UiAutomator2Options options = new UiAutomator2Options();
//        options.setDeviceName("Pixel 6");
//        options.setApp("C:\\Users\\alexa\\AndroidStudioProjects\\appiumProject\\app\\src\\androidTest\\java\\resources\\ApiDemos-debug.apk");
//
//        //automation drivers
//        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//
//    }
//
//    @Test(enabled = false)
//    public void appiumTest(){
//        //test
//        driver.findElement(By.xpath(appBtn)).click();
//
//        driver.findElement(By.xpath(activityBtn)).click();
//
//        driver.findElement(By.xpath(customTitleBtn)).click();
//
//        driver.findElement(By.xpath(changeLeftTextField)).clear();
//
//        driver.findElement(By.xpath(changeLeftTextField)).sendKeys("left right left right");
//
//        driver.findElement(By.xpath(changeLeftBtn)).click();
//
//        String actualLeftHeader = driver.findElement(By.id(changeLeftHeader)).getText();
//
//        String expectedLeftHeader = "left right left right";
//
//        System.out.println(actualLeftHeader);
//
//        Assert.assertEquals(actualLeftHeader, expectedLeftHeader, "titles do not match");
//
//    }
//}
