@US_06
Feature: TC_01 Kullanici Iletisim Formlari Kismindaki Bireysel Bolumdeki Butun Bilgileri Dogru Bir Sekilde
  Girip Gonder Islemini Yapabilmeli
  Background: Acibadem hastanesine giris yap
    Given kullanici_acibadem_sayfasina_gider

  Scenario : TC_01Pozitif_test_butun bilgiler doldurularak gonderme yapilir
    When Kullanici Iletisim butonuna tiklar
    And kullanici sayfayi asagiya indirir
    And Kullanici Iletisim Formlari butonuna tiklar
    And Kullanici bireysel bolumune tiklar
    And Kullanici ad bolumundeki"adiniz"kutucugunu doldurur
    And Kullanici soyad bolumundeki"soyadiniz"kutucugunu doldurur
    And Kullanici E-Posta Adresi bolumuneki  "eposta" kutucugunu doldurur
    And Kullanici Telefon numarasi bolumundeki "telefon"kutucugunu doldurur
    And Kullanici mesaj kutucugundaki "mesaj"kismini doldurur
    And Kullanici kendisine verilen Guvenlik Kodunu girer
    When Kullanici Gonder butonuna tiklar
    Then Kullanici basarili bi sekilde mesajini gonderdigini gorur
    Then Kullanici kapat butonuna tiklar


  Scenario: TC_02 Kullanici ad kutucugunu bos birakinca gonderme basarisiz olur
    When Kullanici Iletisim butonuna tiklar
    And kullanici sayfayi asagiya indirir
    And Kullanici Iletisim Formlari butonuna tiklar
    And Kullanici bireysel bolumune tiklar
    And Kullanici ad bolumundeki"adiniz"kutucugunu bos birakir
    And Kullanici soyad bolumundeki"soyadiniz"kutucugunu doldurur
    And Kullanici E-Posta Adresi bolumuneki  "eposta" kutucugunu doldurur
    And Kullanici Telefon numarasi bolumundeki "telefon"kutucugunu doldurur
    And Kullanici mesaj kutucugundaki "mesaj"kismini doldurur
    And Kullanici kendisine verilen Guvenlik Kodunu girer
    When Kullanici Gonder butonuna tiklar
    Then Kullanici ad kutucugunda uyari mesaji aldigini gorur

  Scenario: TC_03 Kullanici soyad kutucugunu bos birakinca gonderme basarisiz olur
    When Kullanici Iletisim butonuna tiklar
    And kullanici sayfayi asagiya indirir
    And Kullanici Iletisim Formlari butonuna tiklar
    And Kullanici bireysel bolumune tiklar
    And Kullanici ad bolumundeki"adiniz"kutucugunu doldurur
    And Kullanici soyad bolumundeki"soyadiniz"kutucugunu bos birakir
    And Kullanici E-Posta Adresi bolumuneki  "eposta" kutucugunu doldurur
    And Kullanici Telefon numarasi bolumundeki "telefon"kutucugunu doldurur
    And Kullanici mesaj kutucugundaki "mesaj"kismini doldurur
    And Kullanici kendisine verilen Guvenlik Kodunu girer
    When Kullanici Gonder butonuna tiklar
    Then Kullanici soyad kutucugunda uyari mesaji aldigini gorur

  Scenario: TC_04 Kullanici eposta kutucugunu bos birakinca gonderme basarisiz olur
    When Kullanici Iletisim butonuna tiklar
    And kullanici sayfayi asagiya indirir
    And Kullanici Iletisim Formlari butonuna tiklar
    And Kullanici bireysel bolumune tiklar
    And Kullanici ad bolumundeki"adiniz"kutucugunu doldurur
    And Kullanici soyad bolumundeki"soyadiniz"kutucugunu doldurur
    And Kullanici E-Posta Adresi bolumuneki  "eposta" kutucugunu bos birakir
    And Kullanici Telefon numarasi bolumundeki "telefon"kutucugunu doldurur
    And Kullanici mesaj kutucugundaki "mesaj"kismini doldurur
    And Kullanici kendisine verilen Guvenlik Kodunu girer
    When Kullanici Gonder butonuna tiklar
    Then Kullanici eposta kutucugunda uyari mesaji aldigini gorur


  Scenario: TC_05 Kullanici telefon kutucugunu bos birakina gonderme basarisiz olur
    When Kullanici Iletisim butonuna tiklar
    And kullanici sayfayi asagiya indirir
    And Kullanici Iletisim Formlari butonuna tiklar
    And Kullanici bireysel bolumune tiklar
    And Kullanici ad bolumundeki"adiniz"kutucugunu doldurur
    And Kullanici soyad bolumundeki"soyadiniz"kutucugunu doldurur
    And Kullanici E-Posta Adresi bolumuneki  "eposta" kutucugunu doldurur
    And Kullanici Telefon numarasi bolumundeki "telefon"kutucugunu bos birakir
    And Kullanici mesaj kutucugundaki "mesaj"kismini doldurur
    And Kullanici kendisine verilen Guvenlik Kodunu girer
    When Kullanici Gonder butonuna tiklar
    Then Kullanici telefon kutucugunda uyari mesaji aldigini gorur

  Scenario: TC_06 kullanici mesaj kutucugunu bos birakinca gonderme basarisiz olur
    When Kullanici Iletisim butonuna tiklar
    And kullanici sayfayi asagiya indirir
    And Kullanici Iletisim Formlari butonuna tiklar
    And Kullanici bireysel bolumune tiklar
    And Kullanici ad bolumundeki"adiniz"kutucugunu doldurur
    And Kullanici soyad bolumundeki"soyadiniz"kutucugunu doldurur
    And Kullanici E-Posta Adresi bolumuneki  "eposta" kutucugunu doldurur
    And Kullanici Telefon numarasi bolumundeki "telefon"kutucugunu doldurur
    And Kullanici mesaj kutucugundaki "mesaj"kismini bos birakir
    And Kullanici kendisine verilen Guvenlik Kodunu girer
    When Kullanici Gonder butonuna tiklar
    Then Kullanici mesaj kutucugunda uyari mesaji aldigini gorur

  Scenario: TC_07 Kullanici guvenlik kodu kutucugunu bos birakinca gonderme basarisiz olur
    When Kullanici Iletisim butonuna tiklar
    And kullanici sayfayi asagiya indirir
    And Kullanici Iletisim Formlari butonuna tiklar
    And Kullanici bireysel bolumune tiklar
    And Kullanici ad bolumundeki"adiniz"kutucugunu doldurur
    And Kullanici soyad bolumundeki"soyadiniz"kutucugunu doldurur
    And Kullanici E-Posta Adresi bolumuneki  "eposta" kutucugunu doldurur
    And Kullanici Telefon numarasi bolumundeki "telefon"kutucugunu doldurur
    And Kullanici mesaj kutucugundaki "mesaj"kismini doldurur
    And Kullanici kendisine verilen Guvenlik Kodunu bos birakir
    When Kullanici Gonder butonuna tiklar
    Then Kullanici guvenlik kodu kutucugunda uyari mesaji aldigini gorur

  Scenario: TC_08 Kullanici Telefon Numarasi kutucuguna bir rakam girdiginde gonderme islemi basarisiz olur
    When Kullanici Iletisim butonuna tiklar
    And kullanici sayfayi asagiya indirir
    And Kullanici Iletisim Formlari butonuna tiklar
    And Kullanici bireysel bolumune tiklar
    And Kullanici ad bolumundeki"adiniz"kutucugunu doldurur
    And Kullanici soyad bolumundeki"soyadiniz"kutucugunu doldurur
    And Kullanici E-Posta Adresi bolumuneki  "eposta" kutucugunu doldurur
    And Kullanici Telefon numarasi bolumundeki telefon kutucugun 9 rakamini yazar
    And Kullanici mesaj kutucugundaki "mesaj"kismini doldurur
    And Kullanici kendisine verilen Guvenlik Kodunu girer
    When Kullanici Gonder butonuna tiklar
    Then Kullanici telefon kutucugunda uyari mesaji aldigini gorur

  Scenario: TC_09 Kullanici telefon numarasi kutucuguna gereginden fazla rakam girdiginde islemi basarisiz olur
    When Kullanici Iletisim butonuna tiklar
    And kullanici sayfayi asagiya indirir
    And Kullanici Iletisim Formlari butonuna tiklar
    And Kullanici bireysel bolumune tiklar
    And Kullanici ad bolumundeki"adiniz"kutucugunu doldurur
    And Kullanici soyad bolumundeki"soyadiniz"kutucugunu doldurur
    And Kullanici E-Posta Adresi bolumuneki  "eposta" kutucugunu doldurur
    And Kullanici Telefon numarasi bolumundeki telefon kutucugun 12345678912345 rakamini yazar
    And Kullanici mesaj kutucugundaki "mesaj"kismini doldurur
    And Kullanici kendisine verilen Guvenlik Kodunu girer
    When Kullanici Gonder butonuna tiklar
    Then Kullanici telefon kutucugunda uyari mesaji aldigini gorur

  Scenario: TC_10 Kullanici telefon numarasi kutucuguna 0 ile baslayan numara girince gonderme basarisiz olur
    When Kullanici Iletisim butonuna tiklar
    And kullanici sayfayi asagiya indirir
    And Kullanici Iletisim Formlari butonuna tiklar
    And Kullanici bireysel bolumune tiklar
    And Kullanici ad bolumundeki"adiniz"kutucugunu doldurur
    And Kullanici soyad bolumundeki"soyadiniz"kutucugunu doldurur
    And Kullanici E-Posta Adresi bolumuneki  "eposta" kutucugunu doldurur
    And Kullanici Telefon numarasi bolumundeki telefon kutucugun 0543778453 rakamini yazar
    And Kullanici mesaj kutucugundaki "mesaj"kismini doldurur
    And Kullanici kendisine verilen Guvenlik Kodunu girer
    When Kullanici Gonder butonuna tiklar
    Then Kullanici telefon kutucugunda uyari mesaji aldigini gorur

  Scenario: TC_11 Kullanici mail adresinde @ iasaretini yazmayinca gonderme basarisiz olur
    When Kullanici Iletisim butonuna tiklar
    And kullanici sayfayi asagiya indirir
    And Kullanici Iletisim Formlari butonuna tiklar
    And Kullanici bireysel bolumune tiklar
    And Kullanici ad bolumundeki"adiniz"kutucugunu doldurur
    And Kullanici soyad bolumundeki"soyadiniz"kutucugunu doldurur
    And Kullanici E-Posta Adresi bolumuneki  "eposta" kutucugunu doldurur
    And Kullanici Telefon numarasi bolumundeki "telefon"kutucugunu doldurur
    And Kullanici mesaj kutucugundaki "mesaj"kismini doldurur
    And Kullanici kendisine verilen Guvenlik Kodunu girer
    When Kullanici Gonder butonuna tiklar
    Then Kullanici eposta kutucugunda uyari mesaji aldigini gorur

  Scenario: TC_12 Kullanici mail adresinde bosluk birakinca gonderme basarisiz olur
    When Kullanici Iletisim butonuna tiklar
    And kullanici sayfayi asagiya indirir
    And Kullanici Iletisim Formlari butonuna tiklar
    And Kullanici bireysel bolumune tiklar
    And Kullanici ad bolumundeki"adiniz"kutucugunu doldurur
    And Kullanici soyad bolumundeki"soyadiniz"kutucugunu doldurur
    And Kullanici E-Posta Adresi bolumuneki  "eposta" kutucugunu doldurur
    And Kullanici Telefon numarasi bolumundeki "telefon"kutucugunu doldurur
    And Kullanici mesaj kutucugundaki "mesaj"kismini doldurur
    And Kullanici kendisine verilen Guvenlik Kodunu girer
    When Kullanici Gonder butonuna tiklar
    Then Kullanici eposta kutucugunda uyari mesaji aldigini gorur

  Scenario: Sayfa kapatilir
    Given Kullanici sayfayi kapatir
