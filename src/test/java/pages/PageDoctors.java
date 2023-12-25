package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageDoctors {
    public PageDoctors() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[text()='DOKTORLAR']")
    public WebElement doktorlarSekmesi;

    @FindBy (xpath = "//span[@class='m-nav__link-text']")
    public WebElement doktorlarSayfasi;

}
