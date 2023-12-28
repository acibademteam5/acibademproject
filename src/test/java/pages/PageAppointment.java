package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageAppointment {
    public PageAppointment() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@id='search']")
    public WebElement searchboxSA;

   @FindBy (xpath = "//*[@id='howCanWeHelpYou']")
    public WebElement searchbox2SA;

    @FindBy (xpath = "//*[@class='searchResultLink']")
    public WebElement randevuLinki;

@FindBy (xpath = "//*[@id='mat-input-0']")
    public WebElement emailSA;

@FindBy (xpath = "(//*[@class='mat-stroked-button'])[1]")
    public WebElement randevuSA;
@FindBy (xpath = "//*[@id='mat-input-2']")
    public WebElement doktor;


}
