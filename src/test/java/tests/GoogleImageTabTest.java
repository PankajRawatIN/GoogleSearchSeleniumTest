package tests;

import org.junit.Test;

import Base.BaseTest;
import pages.GoogleHomePage;

public class GoogleImageTabTest extends BaseTest {
    @Test
    public void testImageTab() {
        GoogleHomePage google = new GoogleHomePage(driver);
        google.goTo();
        google.search("Cat memes");
        google.clickImages();
        System.out.println("Switched to Images tab.");
    }
}
