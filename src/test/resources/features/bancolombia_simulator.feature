Feature: free investment credit
  AS a Bancolombia user
  I want to complete the form
  To calculate the free investment credit

  @Scenario1
  Scenario: free investment credit calculate without entering data
    Given That I am in Bancolombia free investment credit
    When I enter the free investment credit simulator
    Then I hope to see warning messages, in each field "Este campo es obligatorio."

  @Scenario2
  Scenario Outline: free investment credit calculate with data not allowed in one field
    Given That I am in Bancolombia free investment credit simulator
    When I enter in the field What do you want to simulate <valueOne>, field birthdate <valueTwo> and field What type of rate do you want your loan with <valueThree>
    Then I hope to see warning messages "El campo no cumple con el valor mínimo 18 años."
    Examples:
      | valueOne          | valueTwo  | valueThree        |
      | "Simula tu Cuota" | "2019-08-24" | "Tasa Fija"   |



