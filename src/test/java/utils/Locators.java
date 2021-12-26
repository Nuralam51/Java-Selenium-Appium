package utils;

import org.openqa.selenium.By;

public class Locators {

    public static By getStartedBtn = By.id("flipboard.app:id/first_launch_cover_continue");

    public static By topicOne = By.xpath("//android.widget.TextView[@text='# NEWS']");
    public static By topicTwo = By.xpath("//android.widget.TextView[@text='# SPORTS']");
    public static By topicThree = By.xpath("//android.widget.TextView[@text='# TECHNOLOGY']");

    public static By continueBtn = By.id("flipboard.app:id/topic_picker_continue_button");

    public static By profileBtn = By.xpath("//android.widget.ImageView[@content-desc='Profile']");
    public static By signUp = By.xpath("//android.widget.Button[@text='Sign Up']");

    public static By skipLogin = By.xpath("//android.widget.TextView[@text='Skip for Now']");

    // home
    public static By dailyEdition = By.xpath("(//android.widget.FrameLayout)[20]");
    public static By topicExplore = By.xpath("(//android.view.ViewGroup)[3]");
    public static By searchField = By.id("flipboard.app:id/search_box_place_holder");
    public static By searchInput = By.id("flipboard.app:id/search_view_input");
    public static By cyberSecurity = By.xpath("(//android.widget.TextView[@text='# CYBER MONDAY'])[1]");
    public static By whatsYourPassion = By.id("flipboard.app:id/sliding_title_text_view");

    public static By following = By.xpath("(//android.view.ViewGroup)[23]");
    public static By search = By.xpath("(//android.view.ViewGroup)[9]");
    public static By settings = By.xpath("//android.widget.ImageView[@content-desc='Settings']");

    //    post
    public static By threeDots = By.xpath("//android.widget.ImageView[@content-desc='More']");
    public static By anotherThreeDots = By.xpath("(//android.widget.ImageView[@content-desc='Flip into Magazine'])[2]");
    public static By LikeOrDislike = By.xpath("(//android.widget.LinearLayout)[4]");
    public static By muteProfile = By.xpath("(//android.widget.LinearLayout)[8]");
    public static By flip = By.xpath("(//android.widget.LinearLayout)[10]");
    public static By share = By.xpath("(//android.widget.LinearLayout)[12]");
    public static By copyLink = By.xpath("(//android.widget.LinearLayout)[16]");

}
