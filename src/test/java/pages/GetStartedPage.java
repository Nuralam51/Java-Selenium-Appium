package pages;

import base.BaseDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import utils.CommonMethods;
import utils.Locators;
import utils.TimeOut;

import java.net.MalformedURLException;

public class GetStartedPage extends BaseDriver {

    AndroidDriver<AndroidElement> androidDriver = setup();
    CommonMethods commonMethods = new CommonMethods(androidDriver);
    TimeOut timeOut = new TimeOut();

    public GetStartedPage() throws MalformedURLException {
    }

    public void clickGetStarted() {
        commonMethods.btnClick(Locators.getStartedBtn);
    }

    public void clickChooseTopics() {
        commonMethods.btnClick(Locators.topicOne);
        timeOut.timeOut();
        commonMethods.btnClick(Locators.topicTwo);
        timeOut.timeOut();
        commonMethods.btnClick(Locators.topicThree);
        timeOut.timeOut();
    }

    public void clickContinueBtn() {
        commonMethods.btnClick(Locators.continueBtn);
    }

}
