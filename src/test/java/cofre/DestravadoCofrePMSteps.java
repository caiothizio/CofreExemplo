/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cofre;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import static org.mockito.Mockito.when;

/**
 *
 * @author caiot
 */
public class DestravadoCofrePMSteps extends CofrePMTest{
    
    @Given("^porta destravada$")
    public void porta_destravada() throws Exception {
        when(sensorMock.travada()).thenReturn(Boolean.FALSE);
    }

    @Then("^o texto deve ser \"([^\"]*)\"$")
    public void o_texto_deve_ser(String arg1) throws Exception {
        assertEquals(arg1, cofrePM.getDisplay());
    }

    @Then("^a porta deve destravar$")
    public void a_porta_deve_destravar() throws Exception {
        when(sensorMock.travada()).thenReturn(Boolean.FALSE);
    }

    @Given("^eu uso limpar$")
    public void eu_uso_limpar() throws Exception {
        cofrePM.clear();
    }

    @Given("^porta aberta$")
    public void porta_aberta() throws Exception {
        when(sensorMock.fechada()).thenReturn(Boolean.FALSE);
    }

    @When("^eu digitar (\\d+)$")
    public void eu_digitar(int arg1) throws Exception {
        cofrePM.pressButton(arg1);
    }

    @Given("^porta fechada$")
    public void porta_fechada() throws Exception {
        when(sensorMock.fechada()).thenReturn(Boolean.TRUE);
    }

    @When("^eu apertar ok$")
    public void eu_apertar_ok() throws Exception {
        cofrePM.ok();
    }

    @Then("^a porta deve ser travada$")
    public void a_porta_deve_ser_travada() throws Exception {
        when(sensorMock.travada()).thenReturn(Boolean.TRUE);
    }

    @Then("^a senha deve ser salva como \"([^\"]*)\"$")
    public void a_senha_deve_ser_salva_como(String arg1) throws Exception {
        memoriaMock.salvarSenha(arg1);
    }
}
