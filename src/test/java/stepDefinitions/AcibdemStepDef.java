package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utilities.Driver;
import utilities.ConfigurationReader;

import static utilities.ReusableMethods.bekle;

public class AcibdemStepDef {

    @Given("kullanici_acibadem_sayfasina_gider")
    public void kullanici_acibadem_sayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.getDriver().close();
    }


    @And("{int} saniye bekle")
    public void saniyeBekle(int saniye) {
        bekle(saniye);
    }
}