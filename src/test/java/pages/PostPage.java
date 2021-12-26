package pages;

import base.BaseDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.CommonMethods;
import utils.Locators;

import java.net.MalformedURLException;

public class PostPage extends BaseDriver {

    AndroidDriver<AndroidElement> androidDriver = setup();
    CommonMethods commonMethods = new CommonMethods(androidDriver);

    public PostPage() throws MalformedURLException {
    }

    public void start() {
        commonMethods.start();
    }

    public void skipLogin() {
        commonMethods.btnClick(Locators.skipLogin);
    }

    public void clickDailyEdition() {
        commonMethods.btnClick(Locators.dailyEdition);
    }

    public void clickLike() {
        commonMethods.btnClick(Locators.LikeOrDislike);
    }

    public void clickThreeDots() {
        commonMethods.btnClick(Locators.threeDots);
    }

    public void clickAnotherThreeDots() {
        commonMethods.btnClick(Locators.anotherThreeDots);
    }

    public void clickMuteProfile() {
        commonMethods.btnClick(Locators.muteProfile);
    }

    public void clickFlip() {
        commonMethods.btnClick(Locators.flip);
    }

    public void clickShare() {
        commonMethods.btnClick(Locators.share);
    }

    public void clickCopyLink() {
        commonMethods.btnClick(Locators.copyLink);
    }

    public void back() {
        commonMethods.back();
    }

}
