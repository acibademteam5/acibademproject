Feature: US01
  Scenario: TC01 Kullanıcı search box butonundan doktor ismi ile randevu alabilmeli.
    Given Acibadem sitesine gidilirSA
    Then Arama butonuna tiklanirSA
    And Arama kutusuna 'Randevu' yazilirSA
    And Altta cikan Hastane Randevusu yazisina tiklanirSA
    And Yeni acilan sayfada uye girisi icin e-mail bolumu doldurulurSA
    And Sifre girilirSA
    And Hastane randevusu almak icin doktor ara' yazisina tiklanirSA
    And  Doktor ara' kismina doktor ismi yazilirSA
    And Tarih secilirSA
    And Onayla butonuna basilirSA
    And Randevu olustugu dogrulanirSA
    And Sayfayi kapatirSA