package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.sql.Driver;

public class CommonMethods {

    AndroidDriver<AndroidElement> androidDriver;
    TimeOut timeOut = new TimeOut();

    public CommonMethods(AndroidDriver<AndroidElement> androidDriver) {
        this.androidDriver = androidDriver;
    }

    public void start() {
        btnClick(Locators.getStartedBtn);
        timeOut.timeOut();
        btnClick(Locators.topicOne);
        timeOut.timeOut();
        btnClick(Locators.topicTwo);
        timeOut.timeOut();
        btnClick(Locators.topicThree);
        timeOut.timeOut();
        btnClick(Locators.continueBtn);
    }

    public void skipLogin() {
        btnClick(Locators.skipLogin);
        timeOut.timeOut();
        btnClick(Locators.profileBtn);
        timeOut.timeOut();
        btnClick(Locators.signUp);
    }

    public void btnClick(By btn) {
        androidDriver.findElement(btn).click();
    }

    public void sendKeysToField(By field, String content) {
        androidDriver.findElement(field).click();
        timeOut.timeOut();
        androidDriver.getKeyboard().sendKeys(content);
    }

    public void back() {
        androidDriver.navigate().back();
    }

}
