package Tests;

import org.testng.annotations.Test;
import pages.PostPage;
import utils.TimeOut;

import java.net.MalformedURLException;

public class PostPageTest {

    PostPage postPage = new PostPage();
    TimeOut timeOut = new TimeOut();

    public PostPageTest() throws MalformedURLException {
    }

    @Test(priority = 1)
    public void start() {
        postPage.start();
        timeOut.timeOut();
        postPage.skipLogin();
        timeOut.timeOut();
        System.out.println("Successful get start and skip login");
    }

    @Test(priority = 2)
    public void like() {
        postPage.clickThreeDots();
        timeOut.timeOut();
        postPage.clickLike();
        postPage.back();
        timeOut.timeOut();
        System.out.println("Success Like");
    }

    @Test(priority = 3)
    public void MuteProfile() {
        postPage.clickThreeDots();
        timeOut.timeOut();
        postPage.clickMuteProfile();
        timeOut.timeOut();
        System.out.println("Success mute profile");
    }

    @Test(priority = 4)
    public void flip() {
        postPage.clickAnotherThreeDots();
        timeOut.timeOut();
        postPage.clickFlip();
        timeOut.timeOut();
        postPage.back();
        timeOut.timeOut();
        System.out.println("Success flip");
    }

    @Test(priority = 5)
    public void share() {
        postPage.clickAnotherThreeDots();
        timeOut.timeOut();
        postPage.clickShare();
        timeOut.timeOut();
        postPage.back();
        System.out.println("Success share");
    }

    @Test(priority = 6)
    public void copyLink() {
        postPage.clickAnotherThreeDots();
        timeOut.timeOut();
        postPage.clickCopyLink();
        timeOut.timeOut();
        System.out.println("success copy link");
    }

}
