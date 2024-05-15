Feature: Google Ana Sayfasi Baslik Dogrulama
  @Test
  Scenario: Google title dogrulama testi
    Given Google ana sayfasina git
    Then Basligin "Google" oldugunu dogrula
    And Sayfayi kapat