package cofre;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

/**
 *
 * @author utfpr
 */
public class ValidacaoSteps {
    
    String senha;
    int bool;

    @Given("^entrei com a senha \"([^\"]*)\"$")
    public void entrei_com_a_senha(String senha) throws Exception {
        this.senha = senha;
    }

    @When("^eu verificar se ehNumero$")
    public void eu_verificar_se_ehNumero() throws Exception {
        if(ValidacaoHelper.ehNumero(senha)){
            bool = 1;
        }else{
            bool = 0;
        }
    }

    @Then("^o resultado deve ser (\\d+)$")
    public void o_resultado_deve_ser(int bool) throws Exception {
        assertEquals(this.bool, bool);
    }

    @When("^eu verificar se ehSenhaValida$")
    public void eu_verificar_se_ehSenhaValida() throws Exception {
        if(ValidacaoHelper.ehSenhaValida(senha)){
            bool = 1;
        }else{
            bool = 0;
        }
    }
    
   
}
