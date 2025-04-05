package tests;

import org.junit.Test;

import Base.BaseTest;
import pages.GoogleHomePage;

public class GoogleLanguageChangeTest extends BaseTest {
    @Test
    public void testLanguageChange() {
        GoogleHomePage google = new GoogleHomePage(driver);
        google.goTo();
        google.changeLanguageToHindi();
        System.out.println("Language changed to Hindi.");
    }
}
