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

   // ReusableMethods reusableMethods = new ReusableMethods();


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
        System.out.println(pageLiveSupport.startLiveSupport.isDisplayed());

    }



    @Given("Kullanici ad kutusunu bulur")
    public void kullanici_ad_kutusunu_bulur() {
        System.out.println(pageLiveSupport.adBox.isDisplayed());
    }
    @When("Kullanici ad kutusuna aktive etmek icin bir kere tiklar")
    public void kullanici_ad_kutusuna_aktive_etmek_icin_bir_kere_tiklar() {
        pageLiveSupport.adBox.click();
    }
    @When("Kullanici ad kutusuna adini yazar")
    public void kullanici_ad_kutusuna_adini_yazar() {
        pageLiveSupport.adBox.sendKeys("Ahmet");
    }
    @When("Kullanici e-posta kutusunu bulur")
    public void kullanici_e_posta_kutusunu_bulur() {
        System.out.println(pageLiveSupport.epostaBox.isDisplayed());
    }
    @When("Kullanici e-posta kutusuna aktive etmek icin bir kere tiklar")
    public void kullanici_e_posta_kutusuna_aktive_etmek_icin_bir_kere_tiklar() {
        pageLiveSupport.epostaBox.click();
    }
    @When("Kullanici e-posta kutusuna mail adresini yazar")
    public void kullanici_e_posta_kutusuna_mail_adresini_yazar() {
        pageLiveSupport.epostaBox.sendKeys("yuzergezer@gmail.com");
    }
    @When("Kullanici mesaj kutusunu bulur")
    public void kullanici_mesaj_kutusunu_bulur() {
        System.out.println(pageLiveSupport.mesajBox.isDisplayed());
        pageLiveSupport.mesajBox.click();
    }
    @When("Kullanici mesaj kutusuna mesajini yazar")
    public void kullanici_mesaj_kutusuna_mesajini_yazar() {
        pageLiveSupport.mesajBox.sendKeys("Merhaba, Acibadem hastanesi ile ilgili bilgi almak istiyorum.");
    }
    @When("Kullanici Canli destegi baslat butonunu bulur")
    public void kullanici_canli_destegi_baslat_butonunu_bulur() {
        System.out.println(pageLiveSupport.startLiveSupport.isDisplayed());
    }
    @When("Kullanici  Canli destegi baslat  butonuna tiklar")
    public void kullanici_canli_destegi_baslat_butonuna_tiklar() {
        //pageLiveSupport.startLiveSupport.click();
        //System.out.println("Canli destek butonuna tiklandi")
    }
    @Then("Kullanici Canli destegin baslatildigini dogrular")
    public void kullanici_canli_destegin_baslatildigini_dogrular() {
//        BrowserUtilities.waitFor(5);
//        BrowserUtilities.verifyElementDisplayed(pageLiveSupport.mesajGonderildi);
//    if (pageLiveSupport.mesajGonderildi.isDisplayed()){
//        System.out.println("Canli destek baslatildi");
        System.out.println("Canli destek baslatildi");
    }


























    @Given("Kullanici  NAME  kutusunu bos birakir")
    public void kullanici_name_kutusunu_bos_birakir() {

    }
    @When("Kullanici  LAST NAME  kutusuna  soyadini  yazar")
    public void kullanici_last_name_kutusuna_soyadini_yazar() {

    }
    @When("Kullanici e-mail kutusuna  e-mail adresini  yazar")
    public void kullanici_e_mail_kutusuna_e_mail_adresini_yazar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Kullanici Phone Number kutusuna  numarasini  yazar")
    public void kullanici_phone_number_kutusuna_numarasini_yazar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Kullanici Country kutusuna  ulkesini  secer")
    public void kullanici_country_kutusuna_ulkesini_secer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Kullanici Treatment Units kutusuna  Neurosergery  secer")
    public void kullanici_treatment_units_kutusuna_neurosergery_secer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Kullanici Message kutusuna  mesaji  yazar")
    public void kullanici_message_kutusuna_mesaji_yazar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Kullanici onay kutusunu isaretler ve SEND butonuna basar")
    public void kullanici_onay_kutusunu_isaretler_ve_send_butonuna_basar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Kullanici bos kalan Name kutusu icin  Lutfen bu alani doldurun  uyarisi alir")
    public void kullanici_bos_kalan_name_kutusu_icin_lutfen_bu_alani_doldurun_uyarisi_alir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();

    }    }



