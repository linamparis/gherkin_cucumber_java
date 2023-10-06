Feature: Shooping cart
  As normal user
  I want to add a product to a cart
  To buy the product

  #Agregar 3 productos usando Datatable
  Scenario: Add product to the cart 1
    Given Alejandra is on the main page
    When the user add a product to the cart
      | shirt  |
      | jean   |
      | tennis |
    Then the user can see the product and the price

    #Uso de Example pero con los parametros a nivel de paso de manera individual.
  Scenario Outline: Add product to cart per user
    Given <user> is on the home page
    When the user add the <product> to the cart
    Then the user can see the <price> of the product based on the <quantity>
    Examples:
      | user      | product | price  | quantity |
      | Alejandra | jean    | 200000 | 2        |
      | Hernan    | tenis   | 500000 | 1        |
      | Santiago  | shirt   | 120000 | 3        |
