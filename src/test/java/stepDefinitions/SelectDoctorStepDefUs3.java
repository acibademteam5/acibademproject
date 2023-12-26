package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.PageDoctors;
import utilities.Driver;
import utilities.ReusableMethods;


import java.util.List;
import java.util.Random;


public class SelectDoctorStepDefUs3 extends ReusableMethods {

    PageDoctors pageDoctors=new PageDoctors();
    Actions actions = new Actions(Driver.getDriver());

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();


    @When("kullanici_doktorlar_sekmesine_tiklar")
    public void kullanici_doktorlar_sekmesine_tiklar() {


  //  pageDoctors.doktorlarSekmesi.click();
       ReusableMethods.clickWithTimeOut(pageDoctors.doktorlarSekmesi,2);


       ReusableMethods.clickWithTimeOut(pageDoctors.doktorlarSekmesi,5);

    }

    @Then("kullanici_doktorlar_sayfasini_gorur")
    public void kullanici_doktorlar_sayfasini_gorur() {

        System.out.println(pageDoctors.doktorlarSayfasi.getText());
        Assert.assertEquals("Doktorlar",pageDoctors.doktorlarSayfasi.getText());

        Assert.assertEquals(pageDoctors.doktorlarSayfasi.getText(),"Doktorlar");

    }

    @And("kullanici_sayfayi_asagi_kaydirir")
    public void kullanici_sayfayi_asagi_kaydirir() {

        //actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).build();
       // jse.executeScript();
       // scroll(pageDoctors.unvanSecme);
        jse.executeScript("window.scrollTo(0,600)");


        //actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).build().perform();

        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).build().perform();

    }


    @Given("kullanici_lokasyon_kutusuna_tiklar")
    public void kullanici_lokasyon_kutusuna_tiklar() {

        clickWithTimeOut(pageDoctors.DoktorLokasyonSecme,2);

    }

    @Then("kullanici_istedigi_lokasyonu_secer")
    public void kullanici_istedigi_lokasyonu_secer() {

        // selectRandomTextFromDropdown();
        Select select =new Select(pageDoctors.DoktorLokasyonSecme);
        List<WebElement> lokasyonlarListe= select.getOptions();
        Random random = new Random();
        int optionIndex = 1 + random.nextInt(lokasyonlarListe.size()-1);
        select.selectByIndex(optionIndex);
        select.getFirstSelectedOption().click();
        clickWithTimeOut(pageDoctors.doktorlarSayfasi,2);
    }

    @Then("kullanici_sayfa_acilana_kadar_bekler")
    public void kullanici_sayfa_acilana_kadar_bekler(){
        bekle(15);
    }

    @Given("kullanici_tibbi_birim_kutusuna_tiklar")
    public void kullanici_tibbi_birim_kutusuna_tiklar() {

        clickWithTimeOut(pageDoctors.DoktorlarTibbiBirimSecme,2);
    }


    @Then("kullanici_tibbi_birim_secer")
    public void kullanici_tibbi_birim_secer() {
        Select select =new Select(pageDoctors.DoktorlarTibbiBirimSecme);
        List<WebElement> lokasyonlarListe= select.getOptions();
        Random random = new Random();
        int optionIndex = 1 + random.nextInt(lokasyonlarListe.size()-1);
        select.selectByIndex(optionIndex);
        select.getFirstSelectedOption().click();
        clickWithTimeOut(pageDoctors.doktorlarSayfasi,2);

    }

    @Given("kullanici_unvan_kutusuna_tiklar")
    public void kullanici_unvan_kutusuna_tiklar() {
        clickWithTimeOut(pageDoctors.DoktorUnvanSecme,2);
    }

    @Then("kullanici_unvan_secer")
    public void kullanici_unvan_secer() {
        Select select =new Select(pageDoctors.DoktorUnvanSecme);
        List<WebElement> lokasyonlarListe= select.getOptions();
        Random random = new Random();
        int optionIndex = 1 + random.nextInt(lokasyonlarListe.size()-1);
        select.selectByIndex(optionIndex);
        select.getFirstSelectedOption().click();
        clickWithTimeOut(pageDoctors.doktorlarSayfasi,2);
    }

    @Given("kullanici_istedigi_doktora_tiklar")
    public void kullanici_istedigi_doktora_tiklar() {

        clickWithTimeOut(pageDoctors.DoktorFotoSecme,2);
    }
}

