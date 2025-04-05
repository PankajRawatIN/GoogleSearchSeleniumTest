package tests;

import Base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.GoogleHomePage;

public class GoogleSearchTest extends BaseTest {
    @Test
    public void testSearchFunctionality() {
        GoogleHomePage google = new GoogleHomePage(driver);
        google.goTo();
        google.search("OpenAI");
        Assert.assertTrue(google.getTitle().contains("OpenAI"));
    }
}
