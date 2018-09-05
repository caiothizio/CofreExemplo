# language: en
Feature: Validar Senha
Quero testar se as validacoes estao ok

  Scenario Outline: Testar se eh numero
    Given entrei com a senha <senha>
    When eu verificar se ehNumero
    Then o resultado deve ser <saida>

    Examples: 
      | senha     | saida |
      | "123"     |   1   |
      | "1234444" |   1   |
      | ""        |   0   |
      | "123aaaa" |   0   |

  Scenario Outline: Testar se eh senha valida
    Given entrei com a senha <senha>
    When eu verificar se ehSenhaValida
    Then o resultado deve ser <saida>

    Examples: 
      | senha     | saida |
      | "123"     |   0   |
      | "1"       |   0   |
      | "12345"   |   0   |
      | "12345a"  |   0   |
      | "123999"  |   1   |