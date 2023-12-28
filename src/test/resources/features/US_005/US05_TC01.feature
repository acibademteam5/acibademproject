Feature: Kullanıcı menü butonundaki fiyat sor butonunu aktif olarak kullanma testi

  Scenario:TC01 Kullanıcı menü butonundaki fiyat sor butonunu aktif olarak kullanabilmeli

    Given kullanici_acibadem_sayfasina_gider
    Then KK kullanci menu butonuna ve fiyat sor butonuna tiklar
    And 2 saniye bekle
    And  KK kullanici ad,Soyad,E-posta,Telefon numarasi girer
    And 2 saniye bekle
    And  KK kullanici Rastgele bir sube secer
    And  KK kullanici Sigorta durumunu secer
    And  KK kullanci Sigorta bilginiz bolumune sigorta bilginizi girer
    And  KK kullanici mesajiniz bolunumune mesaj yazar
    And  KK kullanici KVKK metinini tiklayarak kabul eder
    And  KK kullanici Bilgilendirme metnini kabul eder
    And  KK kullanici Guvenlik kodunu girer
    And  KK kullanici Gonder butonuna tiklar
    And  2 saniye bekle
    And  KK kullanici Mesajin gonderildigini dogrular

