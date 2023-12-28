package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageFiyatSor {
    public PageFiyatSor() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='menu']")
    public WebElement menu;

    @FindBy(xpath = "(//div[@class='text'])[9]")
    public WebElement fiyatSor;

    @FindBy(xpath = "//*[@id='AskPriceContactForm_Firstname']")
    public WebElement adinizButonu;

    @FindBy(xpath = "(//*[@class='dropdown form-control'])[1]")
    public WebElement subeSecButonu;



}

