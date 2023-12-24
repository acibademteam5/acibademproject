Feature: TC01_Kullanici_Doktorlar_Sekmesine_Gider

  Background: https://www.acibadem.com.tr sayfasinda doktor secimi
    Given kullanici_acibadem_sayfasina_gider
    When kullanici_doktorlar_sekmesine_tiklar
    Then kullanici_doktorlar_sayfasini_gorur
    And kullanici_sayfayi_asagi_kaydirir