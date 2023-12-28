package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.PageDoctors;
import pages.PageMedicalTechnologies;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Random;

public class SelectMedicalTechStepDefUs4 extends ReusableMethods {

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    PageMedicalTechnologies PageMedTech=new PageMedicalTechnologies();
    PageDoctors doctorsLocate=new PageDoctors();
    @When("kullanici_medical_tech_sekmesine_tiklar")
    public void kullanici_medical_tech_sekmesine_tiklar() {
        clickWithTimeOut(PageMedTech.MedicalTechSecme,2);
    }
    @Then("kullanici_medical_tech_sayfasini_gorur")
    public void kullanici_medical_tech_sayfasini_gorur() {
        System.out.println(PageMedTech.MedTechYazi.getText());
        Assert.assertEquals("Medikal Teknolojiler",PageMedTech.MedTechYazi.getText());

    }

    @Then("kullanici_cihaz_turu_kutusuna_tiklar")
    public void kullanici_cihaz_turu_kutusuna_tiklar() {
        clickWithTimeOut(PageMedTech.CihazTuruSecme,2);
    }

    @And("kullanici_cihaz_turu_secer")
    public void kullanici_cihaz_turu_secer() {
        Select select =new Select(PageMedTech.CihazTuruSecme);
        List<WebElement> lokasyonlarListe= select.getOptions();
        Random random = new Random();
        int optionIndex = 1 + random.nextInt(lokasyonlarListe.size()-1);
        select.selectByIndex(optionIndex);
        select.getFirstSelectedOption().click();

    }

    @Then("kullanici_son_cihaz_turu_secer")
    public void kullanici_son_cihaz_turu_secer() {
        clickWithTimeOut(PageMedTech.MedCihazSecme,2);

    }
}
