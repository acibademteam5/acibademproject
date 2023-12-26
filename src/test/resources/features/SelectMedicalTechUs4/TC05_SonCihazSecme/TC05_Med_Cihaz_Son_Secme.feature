Feature: TC05_Kullanici_Medical_Tech_Sekmesinde_Son_Cihaz_Turu_Secer

  Scenario: https://www.acibadem.com.tr sayfasinda medical tech secimi
    Given kullanici_acibadem_sayfasina_gider
    When kullanici_medical_tech_sekmesine_tiklar
    Then kullanici_medical_tech_sayfasini_gorur
    And kullanici_sayfayi_asagi_kaydirir
    Then kullanici_lokasyon_kutusuna_tiklar
    And kullanici_istedigi_lokasyonu_secer
    And kullanici_sayfa_acilana_kadar_bekler
    And kullanici_sayfayi_asagi_kaydirir
    Given kullanici_tibbi_birim_kutusuna_tiklar
    Then kullanici_tibbi_birim_secer
    And kullanici_sayfa_acilana_kadar_bekler
    And kullanici_sayfayi_asagi_kaydirir
    Then kullanici_cihaz_turu_kutusuna_tiklar
    And kullanici_cihaz_turu_secer
    And kullanici_sayfa_acilana_kadar_bekler
    And kullanici_sayfayi_asagi_kaydirir
    Then kullanici_son_cihaz_turu_secer
