package pages;

import core.BasePage;

public class LoginPage extends BasePage {
    public void botaoCriarConta() {
        clicarBotaoPeloXpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[1]/span");
    }

    public void escreverEmail(String texto) {
        escreverPeloId("ap_email", texto);

    }

    public void escreverSenha(String texto) {
        escreverPeloXpath("//*[@id=\"ap_password\"]", texto);

    }

    public void botaoContinue() {
        clicarBotaoPeloId("continue");
    }

    public String obterTextoLogin() {
        return obterTextoPeloXpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div/div[1]/h2");

    }

    public void botaoLogin() {
        clicarBotaoPeloXpath("//*[@id=\"signInSubmit\"]");

    }

    public String obterTextoErro() {
        return obterTextoPeloXpath("/html/body/div[1]/div[1]/div[2]/div/div[1]/div/div/div/h4");

    }
    public String obterTextoErroCampoEmailVazio() {
        return obterTextoPeloXpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[1]/div/div/div");
    }
}
