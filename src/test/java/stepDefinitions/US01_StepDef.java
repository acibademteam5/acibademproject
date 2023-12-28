package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.message.ReusableMessage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.PageAppointment;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class US01_StepDef {
    PageAppointment pageAppointment=new PageAppointment();
    Random random= new Random();
    String anasayfaHandle;
    @Given("Acibadem sitesine gidilirSA")
    public void acibademSitesineGidilirSA() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        anasayfaHandle=Driver.getDriver().getWindowHandle();
    }

    @Then("Arama butonuna tiklanirSA")
    public void aramaButonunaTiklanirSA() {
        pageAppointment.searchbox2SA.click();
    }

    @And("Arama kutusuna {string} yazilirSA")
    public void aramaKutusunaRandevuYazilirSA(String word) {
        ReusableMethods.bekle(2);
        pageAppointment.searchboxSA.sendKeys(word);
    }

    @And("Altta cikan Hastane Randevusu yazisina tiklanirSA")
    public void alttaCikanHastaneRandevusuYazisinaTiklanirSA() {
        ReusableMethods.bekle(2);
        pageAppointment.randevuLinki.click();
    }

    @And("Yeni acilan sayfada uye girisi icin e-mail bolumu doldurulurSA")
    public void yeniAcilanSayfadaUyeGirisiIcinEMailBolumuDoldurulurSA() {
        Set<String> pencereler =Driver.getDriver().getWindowHandles();
        for (String w: pencereler) {
            if (!w.equals(anasayfaHandle)){
                Driver.getDriver().switchTo().window(w);
            }
        }
        ReusableMethods.bekle(3);
        pageAppointment.emailSA.sendKeys(ConfigurationReader.getProperty("emailSA"), Keys.TAB, ConfigurationReader.getProperty("sifreSA"),Keys.ENTER);

    }

    @And("Sifre girilirSA")
    public void sifreGirilirSA() {
    }

    @And("Hastane randevusu almak icin doktor ara' yazisina tiklanirSA")
    public void hastaneRandevusuAlmakIcinDoktorAraYazisinaTiklanirSA() {
        ReusableMethods.bekle(2);
        pageAppointment.randevuSA.click();
    }

    @And("Doktor ara' kismina doktor ismi yazilirSA")
    public void doktorAraKisminaDoktorIsmiYazilirSA() {
        pageAppointment.doktor.sendKeys("Uzm.Psk. SENA SİVRİ (Psikoloji)",Keys.ENTER, Keys.ENTER);
    }

    @And("Tarih secilirSA")
    public void tarihSecilirSA() {
        List<WebElement> tarihler= Driver.getDriver().findElements(By.xpath("//*[@class='fc-title']"));
        tarihler.get(random.nextInt(tarihler.size())).click();
    }



    @And("Randevu olustugu dogrulanirSA")
    public void randevuOlustuguDogrulanirSA() {
    }



    @And("Onayla butonuna basilirSA")
    public void onaylaButonunaBasilirSA() {
    }


    @And("Sayfayi kapatirSA")
    public void sayfayiKapatirSA() {
        ReusableMethods.bekle(2);
        Driver.closeDriver();
    }
}
