package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import pages.IletisimPage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US_06_Butun_Testler extends BrowserUtilities {

    IletisimPage iletisimPage = new IletisimPage();

    Actions actions = new Actions(Driver.getDriver());

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();


    @When("Kullanici Iletisim butonuna tiklar")
    public void kullanici_iletisim_butonuna_tiklar() {
        IletisimPage.iletisimsekmesi.click();
    }

    @And("kullanici sayfayi asagiya indirir")
    public void kullaniciSayfayiAsagiyaIndirir() {
        jse.executeScript("window.scrollTo(0,100)");

        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).build().perform();
        scrollUp();


    }

    @When("Kullanici Iletisim Formlari butonuna tiklar")
    public void kullanici_iletisim_formlari_butonuna_tiklar() {
        waitFor(2);
        clickWithJS(IletisimPage.bireyselsekmesi);
    }
    @And("Kullanici bireysel bolumune tiklar")
    public void kullaniciBireyselBolumuneTiklar() {
        waitFor(2);
        clickWithJS(IletisimPage.bireyselsekmesi);
    }

    @And("Kullanici ad bolumundeki{string}kutucugunu doldurur")
    public void kullaniciAdBolumundekiKutucugunuDoldurur(String arg0) {
        waitFor(1);
        IletisimPage.adiniz.sendKeys("Bulut"+Keys.ENTER);
    }

    @And("Kullanici soyad bolumundeki{string}kutucugunu doldurur")
    public void kullaniciSoyadBolumundekiKutucugunuDoldurur(String arg0) {
        waitFor(1);
        IletisimPage.soyadiniz.sendKeys("Ak"+Keys.ENTER);
    }

    @And("Kullanici E-Posta Adresi bolumuneki  {string} kutucugunu doldurur")
    public void kullaniciEPostaAdresiBolumunekiKutucugunuDoldurur(String arg0) {
        waitFor(1);
        IletisimPage.email.sendKeys("bulutak@gmail.com"+Keys.ENTER);
    }

    @And("Kullanici Telefon numarasi bolumundeki {string}kutucugunu doldurur")
    public void kullaniciTelefonNumarasiBolumundekiKutucugunuDoldurur(String arg0) {
        waitFor(1);
        IletisimPage.telno.sendKeys("5437798655"+Keys.ENTER);
    }

    @And("Kullanici mesaj kutucugundaki {string}kismini doldurur")
    public void kullaniciMesajKutucugundakiKisminiDoldurur(String arg0) {
        IletisimPage.mesaj.sendKeys("Merhaba Ortadonti bolumune erisim saglaymiyorum "+Keys.ENTER);
        waitFor(1);
    }
    @And("Kullanici kendisine verilen Guvenlik Kodunu girer")
    public void kullaniciKendisineVerilenGuvenlikKodunuGirer() throws InterruptedException {

        Thread.sleep(9999);
    }
    @When("Kullanici Gonder butonuna tiklar")
    public void kullaniciGonderButonunaTiklar() {
        clickWithJS(IletisimPage.gonder);
    }

    @Then("Kullanici basarili bi sekilde mesajini gonderdigini gorur")
    public void kullaniciBasariliBiSekildeMesajiniGonderdiginiGorur() {
//     String gondermeBasarili=Driver.getDriver().switchTo().window().getText();
//     String beklenenMesaj="Teşekkürler!" ;
//     Assert.assertEquals(gondermeBasarili,beklenenMesaj);
    }

    @And("Kullanici ad bolumundeki{string}kutucugunu bos birakir")
    public void kullaniciAdBolumundekiKutucugunuBosBirakir(String arg0) {
        IletisimPage.adiniz.sendKeys(""+Keys.ENTER);
    }

    @Then("Kullanici ad kutucugunda uyari mesaji aldigini gorur")
    public void kullaniciAdKutucugundaUyariMesajiAldiginiGorur() {

    }

    @And("Kullanici soyad bolumundeki{string}kutucugunu bos birakir")
    public void kullaniciSoyadBolumundekiKutucugunuBosBirakir(String arg0) {
        IletisimPage.soyadiniz.sendKeys(""+Keys.ENTER);
    }

    @Then("Kullanici soyad kutucugunda uyari mesaji aldigini gorur")
    public void kullaniciSoyadKutucugundaUyariMesajiAldiginiGorur() {

    }

    @And("Kullanici E-Posta Adresi bolumuneki  {string} kutucugunu bos birakir")
    public void kullaniciEPostaAdresiBolumunekiKutucugunuBosBirakir(String arg0) {
        IletisimPage.email.sendKeys(""+Keys.ENTER);
    }

    @Then("Kullanici eposta kutucugunda uyari mesaji aldigini gorur")
    public void kullaniciEpostaKutucugundaUyariMesajiAldiginiGorur() {

    }

    @And("Kullanici Telefon numarasi bolumundeki {string}kutucugunu bos birakir")
    public void kullaniciTelefonNumarasiBolumundekiKutucugunuBosBirakir(String arg0) {
        IletisimPage.telno.sendKeys(""+Keys.ENTER);
    }

    @Then("Kullanici telefon kutucugunda uyari mesaji aldigini gorur")
    public void kullaniciTelefonKutucugundaUyariMesajiAldiginiGorur() {

    }

    @And("Kullanici mesaj kutucugundaki {string}kismini bos birakir")
    public void kullaniciMesajKutucugundakiKisminiBosBirakir(String arg0) {
        IletisimPage.mesaj.sendKeys(""+Keys.ENTER);
    }

    @Then("Kullanici mesaj kutucugunda uyari mesaji aldigini gorur")
    public void kullaniciMesajKutucugundaUyariMesajiAldiginiGorur() {

    }

    @And("Kullanici kendisine verilen Guvenlik Kodunu bos birakir")
    public void kullaniciKendisineVerilenGuvenlikKodunuBosBirakir() {
        IletisimPage.kod.sendKeys(""+Keys.ENTER);
    }

    @Then("Kullanici guvenlik kodu kutucugunda uyari mesaji aldigini gorur")
    public void kullaniciGuvenlikKoduKutucugundaUyariMesajiAldiginiGorur() {

    }

    @And("Kullanici Telefon numarasi bolumundeki telefon kutucugun {int} rakamini yazar")
    public void kullaniciTelefonNumarasiBolumundekiTelefonKutucugunRakaminiYazar(int arg0) {
        IletisimPage.telno.sendKeys("05467385566"+Keys.ENTER);
    }


    @Then("Kullanici kapat butonuna tiklar")
    public void kullaniciKapatButonunaTiklar() {
        clickWithJS(IletisimPage.kapatbuton);
    }
}


