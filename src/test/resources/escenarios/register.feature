Feature: Register a user

  #Implementación del Scenario Outline con Example. Tiene la posibilidad de ejecutar 1 solo escenario sin tener que repetirlo
  #n cantidad de veces.
  Scenario Outline: Register a user successful
    Given <user> is on the home page
    When the user fill out the form
      | user   | name   | lastname   | id   | address   | phone   | mail   | isActive   | country   | state   |
      | <user> | <name> | <lastname> | <id> | <address> | <phone> | <mail> | <isActive> | <country> | <state> |
    Then the <user> will have a new account to login
    Examples:
      | user       | name      | lastname  | id   | address  | phone      | mail                 | isActive | country  | state        |
      | alegomez   | Alejandra | Gomez     | 2018 | Sabaneta | 3453232525 | alejandra@gmail.com  | true     | Colombia | Antioquia    |
      | juanfg     | Juan      | Fernandez | 2098 | Pereira  | 32542525   | juanfg@gmail.com     | true     | Colombia | Risaralda    |
      | satiosorio | Santiago  | Osorio    | 2028 | Bogota   | 326762525  | satiosorio@gmail.com | true     | Colombia | Cundinamarca |
      | bryandiaz  | Bryan     | Diaz      | 2038 | Cali     | 323212312  | bryandiaz@gmail.com  | true     | Colombia | Valle        |