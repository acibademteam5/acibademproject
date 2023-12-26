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

    @FindBy (xpath = "(//*[@title='DOKTORLAR'])[1]")
    public WebElement doktorlarSekmesi;

    @FindBy (xpath = "//span[text()='Doktorlar']")
    public WebElement doktorlarSayfasi;
    //span[@class='m-nav__link-text']

    @FindBy( id = "doctorType")
    public WebElement unvanSecme;
}
