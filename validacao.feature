# language: en
Feature: Validar Senha
Quero testar se as validacoes estao ok

  Scenario Outline: Testar se eh numero
    Given entrei com a senha <senha>
    When eu verificar se ehNumero
    Then o resultado deve ser <saida>

    Examples: 
      | senha     | saida |
      | "123"     | true  |
      | "1234444" | true  |
      | ""        | false |
      | "123aaaa" | false |

  Scenario Outline: Testar se eh senha valida
    Given entrei com a senha <senha>
    When eu verificar se ehSenhaValida
    Then o resultado deve ser <saida>

    Examples: 
      | senha     | saida |
      | "123"     | false |
      | "1"       | false |
      | "12345"   | false |
      | "12345a"  | false |
      | "123999"  | true  |