package pages;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageLiveSupport {
    public PageLiveSupport(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "//iframe[@id='launcher']")
    public WebElement iframeLiveSupport;

    @FindBy (xpath="//img[@alt='Bizimle sohbet edin']")  //         //button[@data-testid='launcher']
    public WebElement liveSupportButton;

    @FindBy (id = "webWidget")            //  xpath = "//iframe[@id='webWidget']"
    public WebElement iframeMessageBox;


    @FindBy (xpath = "//button[@class='sc-htpNat cKUwht']")
    public WebElement startLiveSupport;

    @FindBy (xpath = "html/body/div//form/main/div//input")      //       xpath = "//input[@id='26val-field_1.3.10--input']"
    public WebElement adBox;

    @FindBy (xpath = "html/body/div//form/main/div//input[@name='email']")
    public WebElement epostaBox;


    @FindBy (xpath = "html/body/div//form/main/div//textarea")
    public WebElement mesajBox;

    @FindBy (xpath = "html/body/div//main/div/div/div[@class='styles__Message-sc-46lcwk-0 cobzBX]")
    public WebElement mesajGonderildi;

    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void verifyElementDisplayed(WebElement element) {
        try {
            Assert.assertTrue("Element not visible: " + element, element.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            Assert.fail("Element not found: " + element);
        }
    }
}
