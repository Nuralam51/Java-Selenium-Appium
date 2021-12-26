package pages;

import base.BaseDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.CommonMethods;
import utils.Locators;

import java.net.MalformedURLException;

public class HomePage extends BaseDriver {

    AndroidDriver<AndroidElement> androidDriver = setup();
    CommonMethods commonMethods = new CommonMethods(androidDriver);

    public HomePage() throws MalformedURLException {
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

    public void clickTopicExplore() {
        commonMethods.btnClick(Locators.topicExplore);
    }

    public void clickSearchField() {
        commonMethods.btnClick(Locators.searchField);
    }

    public void interSearchInput() {
        commonMethods.btnClick(Locators.searchInput);
    }

    public void clickCyberMonday() {
        commonMethods.btnClick(Locators.cyberSecurity);
    }

    public void clickYourPassion() {
        commonMethods.btnClick(Locators.whatsYourPassion);
    }

    public void clickFollowing() {
        commonMethods.btnClick(Locators.following);
    }

    public void clickSearch() {
        commonMethods.btnClick(Locators.search);
    }

    public void clickProfile() {
        commonMethods.btnClick(Locators.profileBtn);
    }

    public void clickSettings() {
        commonMethods.btnClick(Locators.settings);
    }

    public void back() {
        commonMethods.back();
    }

}
