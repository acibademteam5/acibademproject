package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.PageDoctors;
import utilities.Driver;
import utilities.ReusableMethods;

public class SelectDoctorStepDefUs3 extends ReusableMethods {

    PageDoctors pageDoctors=new PageDoctors();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    @When("kullanici_doktorlar_sekmesine_tiklar")
    public void kullanici_doktorlar_sekmesine_tiklar() {

  //  pageDoctors.doktorlarSekmesi.click();
       ReusableMethods.clickWithTimeOut(pageDoctors.doktorlarSekmesi,2);
    }

    @Then("kullanici_doktorlar_sayfasini_gorur")
    public void kullanici_doktorlar_sayfasini_gorur() {
        System.out.println(pageDoctors.doktorlarSayfasi.getText());
        Assert.assertEquals("Doktorlar",pageDoctors.doktorlarSayfasi.getText());
    }

    @And("kullanici_sayfayi_asagi_kaydirir")
    public void kullanici_sayfayi_asagi_kaydirir() {
        //actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).build();
       // jse.executeScript();
       // scroll(pageDoctors.unvanSecme);
        jse.executeScript("window.scrollTo(0,600)");
    }


    @Given("kullanici_lokasyon_kutusuna_tiklar")
    public void kullanici_lokasyon_kutusuna_tiklar() {
    }

    @Then("kullanici_istedigi_lokasyonu_secer")
    public void kullanici_istedigi_lokasyonu_secer() {
    }

    @Then("kullanici_sayfa_acilana_kadar_bekler")
    public void kullanici_sayfa_acilana_kadar_bekler() {
    }

    @Given("kullanici_tibbi_birim_kutusuna_tiklar")
    public void kullanici_tibbi_birim_kutusuna_tiklar() {
    }

    @Then("kullanici_tibbi_birim_secer")
    public void kullanici_tibbi_birim_secer() {

    }

    @Given("kullanici_unvan_kutusuna_tiklar")
    public void kullanici_unvan_kutusuna_tiklar() {
    }

    @Then("kullanici_unvan_secer")
    public void kullanici_unvan_secer() {
    }

    @Given("kullanici_istedigi_doktora_tiklar")
    public void kullanici_istedigi_doktora_tiklar() {
    }
}
