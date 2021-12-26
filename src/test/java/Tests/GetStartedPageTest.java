package Tests;

import base.BaseDriver;
import org.testng.annotations.Test;
import pages.GetStartedPage;
import utils.TimeOut;

import java.net.MalformedURLException;

public class GetStartedPageTest extends BaseDriver {

    GetStartedPage getStartedPage = new GetStartedPage();
    TimeOut timeOut = new TimeOut();

    public GetStartedPageTest() throws MalformedURLException {
    }

    @Test(priority = 1)
    public void clickGetStarted() {
        getStartedPage.clickGetStarted();
        timeOut.timeOut();
        System.out.println("Successfully start page test");
    }

    @Test(priority = 2)
    public void clickTopics() {
        getStartedPage.clickChooseTopics();
        timeOut.timeOut();
        getStartedPage.clickContinueBtn();
        System.out.println("Successful Choose Topic Test");
    }
}
