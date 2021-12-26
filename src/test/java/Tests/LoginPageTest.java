package Tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import utils.TimeOut;

import java.net.MalformedURLException;

public class LoginPageTest {

    LoginPage loginPage = new LoginPage();
    TimeOut timeOut = new TimeOut();

    public LoginPageTest() throws MalformedURLException {
    }

    @Test(priority = 1)
    public void start() {
        loginPage.start();
        timeOut.timeOut();
        loginPage.skipLoginBtn();
        timeOut.timeOut();
        System.out.println("Successful get start and skip login");
    }

    @Test(priority = 3)
    public void inputLogin() {
        loginPage.clickInputLoginBtn();
        loginPage.back();
        timeOut.timeOut();
        System.out.println("Successfully gmail login");
    }

    @Test(priority = 4)
    public void GoogleLogin() {
        loginPage.clickGoogleBtn();
        timeOut.timeOut();
        loginPage.back();
        System.out.println("Successfully google login");
    }

    @Test(priority = 5)
    public void FacebookLogin() {
        loginPage.clickFacebookBtn();
        timeOut.timeOut();
        loginPage.back();
        System.out.println("Successfully facebook login");
    }

    @Test(priority = 6)
    public void twitterLogin() {
        loginPage.clickTwitterBtn();
        timeOut.timeOut();
        loginPage.back();
        loginPage.clickOkBtn();
        System.out.println("Successfully twitter login");
    }

}
