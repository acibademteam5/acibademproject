package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PageLiveSupport;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;
import static utilities.Driver.timeout;

public class LiveSupportSD {

    BrowserUtilities browserUtilities= new BrowserUtilities();
    PageLiveSupport pageLiveSupport = new PageLiveSupport();

    ReusableMethods reusableMethods = new ReusableMethods();


    @Given("Kullanici url adresine gider")
    public void kullanici_url_adresine_gider() throws InterruptedException {
        Driver.getDriver().get("https://www.acibadem.com.tr");
        Thread.sleep(9999);
        String hendle1 = Driver.getDriver().getWindowHandle();
        System.out.println(hendle1);

    }
    @When("Kullanici sayfanin alt kosesindeki Merhaba ya da Yardim yazisina tiklar")
    public void kullanici_sayfanin_alt_kosesindeki_Merhaba_ya_da_Yardim_yazisina_tiklar() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, );
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(pageLiveSupport.liveSupportButton));
        driver.switchTo().frame(pageLiveSupport.iframeLiveSupport);
        pageLiveSupport.liveSupportButton.click();
        String hendle2 = Driver.getDriver().getWindowHandle();
        System.out.println(hendle2);


    }
    @Then("Kullanici ad e-posta ve mesaj yazacagi sayfa acildigini dogrular")
    public void kullanici_ad_e_posta_ve_mesaj_yazacagi_sayfa_acildigini_dogrular() throws InterruptedException {
        Thread.sleep(9999);
       driver.switchTo().defaultContent();
        Thread.sleep(9999);
        String hendle3 = Driver.getDriver().getWindowHandle();
        System.out.println(hendle3);
        driver.switchTo().frame(pageLiveSupport.iframeMessageBox);

      //  System.out.println(pageLiveSupport.iframeLiveSupport.isDisplayed());
pageLiveSupport.startLiveSupport.isDisplayed();
        pageLiveSupport.messageBox.click();
    pageLiveSupport.messageBox.sendKeys("bravo");

    }
}
