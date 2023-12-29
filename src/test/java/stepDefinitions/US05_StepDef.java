package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.PageFiyatSor;
import utilities.Driver;

import static utilities.Driver.driver;

public class US05_StepDef {

    PageFiyatSor pageFiyatSor = new PageFiyatSor();

    @Then("KK kullanci menu butonuna ve fiyat sor butonuna tiklar")
    public void kkKullanciMenuButonunaVeFiyatSorButonunaTiklar() {
        pageFiyatSor.menu.click();
        pageFiyatSor.fiyatSor.click();

    }

    @And("KK kullanici ad,Soyad,E-posta,Telefon numarasi girer")
    public void kkKullaniciAdSoyadEPostaTelefonNumarasiGirer() {
        pageFiyatSor.adinizButonu.sendKeys("kubra", Keys.TAB,"ozdemir",Keys.TAB,"kubraozdemir@gmail.com",Keys.TAB,"5305678890");
    }

    @And("KK kullanici Rastgele bir sube secer")
    public void kkKullaniciRastgeleBirSubeSecer() {

        WebElement ddm= Driver.getDriver().findElement(By.xpath("(//*[@class='dropdown form-control'])[1]"));
        Select select = new Select(ddm);
        select.selectByIndex(5);

    }

    @And("KK kullanici Sigorta durumunu secer")
    public void kkKullaniciSigortaDurumunuSecer() {
        WebElement ddm= Driver.getDriver().findElement(By.xpath("(//*[@id='selectSubject'])[1]"));
        Select select = new Select(ddm);
        select.selectByIndex(1);

    }

    @And("KK kullanci Sigorta bilginiz bolumune sigorta bilginizi girer")
    public void kkKullanciSigortaBilginizBolumuneSigortaBilginiziGirer() {
        pageFiyatSor.sigortaBilgisi.sendKeys("12345678");
    }

    @And("KK kullanici mesajiniz bolunumune mesaj yazar")
    public void kkKullaniciMesajinizBolunumuneMesajYazar() {
        pageFiyatSor.mesajinizKutusu.sendKeys("check up fiyati nedir");
    }

    @And("KK kullanici KVKK metinini tiklayarak kabul eder")
    public void kkKullaniciKVKKMetininiTiklayarakKabulEder() {
        pageFiyatSor.kvkkMetniButonu.click();
    }

    @And("KK kullanici Bilgilendirme metnini kabul eder")
    public void kkKullaniciBilgilendirmeMetniniKabulEder() {
       pageFiyatSor.bilgilendirmeMetni.click();
    }

    @And("KK kullanici Guvenlik kodunu girer")
    public void kkKullaniciGuvenlikKodunuGirer() {

    }

    @And("KK kullanici Gonder butonuna tiklar")
    public void kkKullaniciGonderButonunaTiklar() {
        pageFiyatSor.gonderButonu.click();
    }

    @And("KK kullanici Mesajin gonderildigini dogrular")
    public void kkKullaniciMesajinGonderildiginiDogrular() {

    }
}
