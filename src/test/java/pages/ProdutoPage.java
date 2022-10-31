package pages;

import core.BasePage;

public class ProdutoPage extends BasePage {


    public void campoPesquisa(){
        clicarBotaoPeloId("twotabsearchtextbox");

    }

    public void inserirProduto(String texto){
        escreverPeloXpath("//*[@id=\"twotabsearchtextbox\"]", texto);

    }
    public void botaoPesquisar(){
        clicarBotaoPeloId("nav-search-submit-button");
    }

    public void botaoSelecionarProduto(){
        clicarBotaoPeloXpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div[3]/div[1]/h2/a/span");
    }
    public String obterValidacaoProduto() {
        return obterTextoPeloXpath("//*[@id=\"productTitle\"]");
    }
    public void botaoAdicionarNoCarrinho(){
        clicarBotaoPeloXpath("//*[@id=\"add-to-cart-button\"]");
    }

    public String obterTextoSucesso() {
        return obterTextoPeloXpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/span");
    }

    public void botaoCarrinho(){
        clicarBotaoPeloXpath("/html/body/div[1]/div[2]/div/div[1]/div[2]/div/div[3]/div/div[1]/span/span/a");

    }
    public void botaoRemoverDoCarrinho() {
        clicarBotaoPeloXpath("/html/body/div[1]/div[2]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[1]/div/div/div[2]/div[1]/span[2]/span/input");
    }
    public String obterTextoCarrinhoVazio() {
        return obterTextoPeloXpath("/html/body/div[1]/div[2]/div[3]/div[4]/div/div[2]/div[1]/div/div/div/h1");
    }


}
