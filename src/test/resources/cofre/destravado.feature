# language: en
Feature: Testes de cofre destravado
    Quero inserir uma senha para travar o cofre

    Scenario: Verificar se display esta dispondo o texto correto
        Given porta destravada
        Then o texto deve ser "Entre com a senha 6 digitos"

    Scenario: Verificar se limpar funciona
        Given eu uso limpar
        Then o texto deve ser ""

    Scenario: Inserir senha com porta nao fechada
        Given porta aberta
        When eu digitar 0
        Then o texto deve ser "Feche a porta antes de digitar a senha"

    Scenario: Inserir numero com porta fechada
        Given porta fechada
        When eu digitar 0
        Then o texto deve ser "0"

    Scenario: Testar senha valida com porta fechada
        Given porta fechada
        When eu digitar 1
        And eu digitar 9
        And eu digitar 3
        And eu digitar 5
        And eu digitar 6
        And eu digitar 6
        And eu apertar ok
        Then o texto deve ser "Senha salva. Cofre trancado"
        And a porta deve ser travada
        And a senha deve ser salva como "193566"

    Scenario: Testar senha com menos de 6 digitos
        Given porta fechada 
        When eu digitar 1
        And eu apertar ok
        Then o texto deve ser "senha precisa de 6 digitos. Tente novamente"

    Scenario: Digitar senha com porta fechada, abrir a porta e digitar mais algo
        Given porta fechada
        When eu digitar 9
        And eu digitar 8
        Then o texto deve ser "98"
        When porta aberta
        And eu digitar 7
        Then o texto deve ser "Feche a porta antes de digitar a senha"

    
        