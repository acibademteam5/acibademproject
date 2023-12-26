Feature: TC02_Kullanici_Medical_Tech_Sekmesinde_Lokasyon_Secer

  Scenario: https://www.acibadem.com.tr sayfasinda medical tech secimi
    Given kullanici_acibadem_sayfasina_gider
    When kullanici_medical_tech_sekmesine_tiklar
    Then kullanici_medical_tech_sayfasini_gorur
    And kullanici_sayfayi_asagi_kaydirir
    Then kullanici_lokasyon_kutusuna_tiklar
    Then kullanici_istedigi_lokasyonu_secer
    And kullanici_sayfa_acilana_kadar_bekler
    And kullanici_sayfayi_asagi_kaydirir

