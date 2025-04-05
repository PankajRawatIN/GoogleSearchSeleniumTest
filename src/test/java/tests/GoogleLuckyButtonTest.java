package tests;

import Base.BaseTest;
import org.junit.Test;
import pages.GoogleHomePage;

public class GoogleLuckyButtonTest extends BaseTest {
    @Test
    public void testFeelingLucky() {
        GoogleHomePage google = new GoogleHomePage(driver);
        google.goTo();
        google.clickLucky();
        System.out.println("Clicked 'I'm Feeling Lucky'");
    }
}
