package pages;

import base.BaseDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import utils.CommonMethods;
import utils.Locators;
import utils.TimeOut;

import java.net.MalformedURLException;

public class LoginPage extends BaseDriver {

    By inputLogin = By.id("flipboard.app:id/account_login_email_button");
    By googleLogin = By.id("flipboard.app:id/account_login_google_button");
    By facebookLogin = By.id("flipboard.app:id/account_login_facebook_button");
    By twitterLogin = By.id("flipboard.app:id/account_login_twitter_button");

    By okButton = By.xpath("//android.widget.Button[@text='OK']");

    AndroidDriver<AndroidElement> androidDriver = setup();
    CommonMethods commonMethods = new CommonMethods(androidDriver);
    TimeOut timeOut = new TimeOut();

    public LoginPage() throws MalformedURLException {
    }

    public void start() {
        commonMethods.start();
    }

    public void skipLoginBtn() {
        commonMethods.skipLogin();
    }

    public void clickInputLoginBtn() {
        commonMethods.btnClick(inputLogin);
    }

    public void clickGoogleBtn() {
        commonMethods.btnClick(googleLogin);
    }

    public void clickFacebookBtn() {
        commonMethods.btnClick(facebookLogin);
    }

    public void clickTwitterBtn() {
        commonMethods.btnClick(twitterLogin);
    }

    public void clickOkBtn() {
        commonMethods.btnClick(okButton);
    }

    public void back() {
        commonMethods.back();
    }
}
