Feature: US07_Acibadem_Task
  @Acibadem_US_07
  Scenario: TC_01_Kullanici_sayfada_Merhaba_Yardim_yazisina_tiklar_ve_bilgi_sayfasi_acilir
    Given Kullanici url adresine gider
    When  Kullanici sayfanin alt kosesindeki Merhaba ya da Yardim yazisina tiklar
    Then  Kullanici ad e-posta ve mesaj yazacagi sayfa acildigini dogrular