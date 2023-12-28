@US_07
Feature: US_07 Acibadem Web Sayfasinda Canli Destege Mesaj Gonderebilmeli
@TC_07_01
  Scenario: TC_01_Kullanici_sayfada_Merhaba_Yardim_yazisina_tiklar_ve_bilgi_sayfasi_acilir
    Given Kullanici url adresine gider
    When  Kullanici sayfanin alt kosesindeki Merhaba ya da Yardim yazisina tiklar
    Then  Kullanici ad e-posta ve mesaj yazacagi sayfa acildigini dogrular

