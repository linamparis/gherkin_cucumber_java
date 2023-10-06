Feature: Autenticacion en Banco
  Yo como usuario
  Quiero autenticarme
  Para estar en el home

  #Este escenario de autenticación nos muestra que al tener 3 escenarios iguales y su unica variación son los parametros
  #(valores en azul), estas lines de Gherkin van a ir a los mismos metodos siempre y cuando los reciba allí como parametro dentro del metodo.
  #Sin embargo el 4 escenario es la misma implementación usando EXAMPLE y Scenario Scenario Outline.

  #Escenarios usando {word} y {int} en los Steps
  Scenario: Login Admin exitoso
    Given que Juan esta en la pagina web
    When ingresa las credenciales y su id 1088
    Then el deberia ingresar al home de la pagina

  Scenario: Login Manager exitoso
    Given que Camilo esta en la pagina web
    When ingresa las credenciales y su id 1099
    Then el deberia ingresar al home de la pagina

  Scenario: Login User exitoso
    Given que Alejandra esta en la pagina web
    When ingresa las credenciales y su id 2000
    Then el deberia ingresar al home de la pagina

    #Este escenario reemplaza los 3 login iniciales.
  Scenario Outline: Login Usuarios exitoso
    Given que <nombre> esta en la pagina web
    When ingresa las credenciales y su id <id>
    Then el deberia ingresar al home de la pagina
    Examples:
      | nombre | id   |
      | Lina   | 1088 |
      | Carlos | 1099 |
      | Pedro  | 2000 |

#Escenarios usando {String} y {int} en los Steps
  Scenario: Login Manager exitoso
    Given que 'Julian Gomez' esta en la pagina inicial
    When ingresa las credenciales y su id 1088
    Then el deberia ingresar al home de la pagina