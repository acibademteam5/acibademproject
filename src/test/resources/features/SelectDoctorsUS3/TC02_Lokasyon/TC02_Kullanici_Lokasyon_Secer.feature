Feature: TC01_Kullanici_Doktorlar_Sekmesine_Gider

  Background: https://www.acibadem.com.tr sayfasinda lokasyon secimi
    Given kullanici_lokasyon_kutusuna_tiklar
    Then kullanici_istedigi_lokasyonu_secer
    Then kullanici_sayfa_acilana_kadar_bekler
    And kullanici_sayfayi_asagi_kaydirir
