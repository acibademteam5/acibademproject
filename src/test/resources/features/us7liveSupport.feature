@US_07
Feature: US_07 Acibadem Web Sayfasinda Canli Destege Mesaj Gonderebilmeli
@TC_07_01
  Scenario: TC_01_Kullanici_sayfada_Merhaba_Yardim_yazisina_tiklar_ve_bilgi_sayfasi_acilir
    Given Kullanici url adresine gider
    When  Kullanici sayfanin alt kosesindeki Merhaba ya da Yardim yazisina tiklar
    Then  Kullanici ad e-posta ve mesaj yazacagi sayfa acildigini dogrular

@TC_07_02
  Scenario: TC_02_Kullanici mesaji gondermek icin ad gecerli e-posta ve mesaj girer
    Given Kullanici ad kutusunu bulur
    When Kullanici ad kutusuna aktive etmek icin bir kere tiklar
    And  Kullanici ad kutusuna adini yazar
    And Kullanici e-posta kutusunu bulur
    And Kullanici e-posta kutusuna aktive etmek icin bir kere tiklar
    And Kullanici e-posta kutusuna mail adresini yazar
    And Kullanici mesaj kutusunu bulur
    And Kullanici mesaj kutusuna mesajini yazar
    And Kullanici Canli destegi baslat butonunu bulur
    And Kullanici  Canli destegi baslat  butonuna tiklar
    Then Kullanici Canli destegin baslatildigini dogrular























