Feature: TC01_Kullanici_Medical_Tech_Sekmesine_Gider

  Scenario: https://www.acibadem.com.tr sayfasinda medical tech secimi
    Given kullanici_acibadem_sayfasina_gider
    When kullanici_medical_tech_sekmesine_tiklar
    Then kullanici_medical_tech_sayfasini_gorur
    And kullanici_sayfayi_asagi_kaydirir