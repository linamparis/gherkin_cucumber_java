Feature: Autenticacion en Banco
  Yo como usuario
  Quiero autenticarme
  Para estar en el home

  Scenario: Login exitoso
    Given que el Lina esta en la pagina web
    When ingresa las credenciales
    Then el deberia ingresar al home de la pagina