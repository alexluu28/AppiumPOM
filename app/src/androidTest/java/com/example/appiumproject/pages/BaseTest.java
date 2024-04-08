package com.example.appiumproject.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {

    public static AndroidDriver driver;

    @BeforeMethod
    public void initialization() throws MalformedURLException {
        //create capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel 6");
        options.setApp("C:\\Users\\alexa\\AndroidStudioProjects\\appiumProject\\app\\src\\androidTest\\java\\resources\\ApiDemos-debug.apk");

        //automation drivers
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    }
}
