Feature: TC01_Kullanici_Doktorlar_Sekmesine_Gider

  Background: https://www.acibadem.com.tr sayfasinda doktor secimi
    Given kullanici_tibbi_birim_kutusuna_tiklar
    Then kullanici_tibbi_birim_secer
    And kullanici_sayfa_acilana_kadar_bekler
    And kullanici_sayfayi_asagi_kaydirir