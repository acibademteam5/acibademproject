Feature: TC03_Kullanici_Tibbi_Birim_Secer

  Scenario: : https://www.acibadem.com.tr sayfasinda doktor secimi
    Given kullanici_acibadem_sayfasina_gider
    When kullanici_doktorlar_sekmesine_tiklar
    And kullanici_sayfayi_asagi_kaydirir
    Then kullanici_lokasyon_kutusuna_tiklar
    Then kullanici_istedigi_lokasyonu_secer
    And kullanici_sayfa_acilana_kadar_bekler
    And kullanici_sayfayi_asagi_kaydirir
    Given kullanici_tibbi_birim_kutusuna_tiklar
    Then kullanici_tibbi_birim_secer
    And kullanici_sayfa_acilana_kadar_bekler
    And kullanici_sayfayi_asagi_kaydirir
