package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage {
    private WebDriver driver;

    private By searchBox = By.name("q");
    private By imageTab = By.linkText("Images");
    private By luckyButton = By.name("btnI");
    private By languageLink = By.xpath("//a[text()='हिन्दी']"); // change language to Hindi

    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goTo() {
        driver.get("https://www.google.com");
    }

    public void search(String query) {
        driver.findElement(searchBox).sendKeys(query + Keys.ENTER);
    }

    public void clickImages() {
        driver.findElement(imageTab).click();
    }

    public void clickLucky() {
        driver.findElement(searchBox).sendKeys("Google Doodles");
        driver.findElement(luckyButton).click();
    }

    public void changeLanguageToHindi() {
        driver.findElement(languageLink).click();
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
