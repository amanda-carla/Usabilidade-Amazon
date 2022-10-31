package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;

public class LoginTestes extends BaseTest {
    LoginPage login = new LoginPage();

    @Test
    public void realizarLoginComSucesso(){
        login.botaoCriarConta();
        login.escreverEmail("amandacarlatest@gmail.com");
        login.botaoContinue();
        login.escreverSenha("Desafio.test");
        login.botaoLogin();
        Assert.assertEquals("Esquenta Black Friday", login.obterTextoLogin());
    }

    @Test
    public void realizarLoginEmailIncorreto(){
        login.botaoCriarConta();
        login.escreverEmail("amandacarlatest3@gmail.com");
        login.botaoContinue();
        Assert.assertEquals("Houve um problema", login.obterTextoErro());
    }


    @Test
    public void realizarLoginSenhaInCorreta(){
        login.botaoCriarConta();
        login.escreverEmail("amandacarlatest@gmail.com");
        login.botaoContinue();
        login.escreverSenha("Desafio.test3");
        login.botaoLogin();
        Assert.assertEquals("Houve um problema", login.obterTextoErro());
    }
    @Test
    public void realizarLoginSenhaComCaracteresInCorreta(){
        login.botaoCriarConta();
        login.escreverEmail("amandacarlatest@gmail.com");
        login.botaoContinue();
        login.escreverSenha("#@Desafio.@test.#");
        login.botaoLogin();
        Assert.assertEquals("Houve um problema", login.obterTextoErro());
    }

    @Test
    public void realizarLoginSemEmail(){
        login.botaoCriarConta();
        login.botaoContinue();
        Assert.assertEquals("Digite seu e-mail ou número de telefone celular", login.obterTextoErroCampoEmailVazio());
    }

}
