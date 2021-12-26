package Tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.TimeOut;

import java.net.MalformedURLException;

public class HomePageTest {

    HomePage homePage = new HomePage();
    TimeOut timeOut = new TimeOut();

    public HomePageTest() throws MalformedURLException {
    }

    @Test(priority = 1)
    public void start() {
        homePage.start();
        timeOut.timeOut();
        homePage.skipLogin();
        timeOut.timeOut();
        System.out.println("Successful get start and skip login");
    }

    @Test(priority = 2)
    public void openPassion() {
        homePage.clickYourPassion();
        timeOut.timeOut();
        System.out.println("Success open passion");
    }

    @Test(priority = 3)
    public void openDailyEdition() {
        homePage.clickDailyEdition();
        timeOut.timeOut();
        homePage.back();
        System.out.println("Success open daily edition");
    }

    @Test(priority = 4)
    public void openFollowingTab() {
        homePage.clickFollowing();
        timeOut.timeOut();
        System.out.println("Success open following");
    }

    @Test(priority = 5)
    public void openSearchTab() {
        homePage.clickSearch();
        timeOut.timeOut();
        System.out.println("success open search tab");
    }

    @Test(priority = 6)
    public void openProfileTab() {
        homePage.clickProfile();
        timeOut.timeOut();
        System.out.println("success profile tab");
    }

    @Test(priority = 7)
    public void openSettings() {
        homePage.clickSettings();
        homePage.back();
        timeOut.timeOut();
        System.out.println("success open settings");
    }
}
