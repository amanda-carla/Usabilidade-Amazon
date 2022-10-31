package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;
import pages.ProdutoPage;

public class ProdutoTestes extends BaseTest {
    ProdutoPage produto = new ProdutoPage();

    @Test
    public void buscarProduto(){
        produto.campoPesquisa();
        produto.inserirProduto("o poder do agora");
        produto.botaoPesquisar();
        produto.botaoSelecionarProduto();
        Assert.assertEquals("O poder do agora: Um guia para a iluminação espiritual", produto.obterValidacaoProduto());


    }

    @Test
    public void adicionarProdutoNoCarrinho() {
        produto.campoPesquisa();
        produto.inserirProduto("o poder do agora");
        produto.botaoPesquisar();
        produto.botaoSelecionarProduto();
        produto.botaoAdicionarNoCarrinho();
        Assert.assertEquals("Adicionado ao carrinho", produto.obterTextoSucesso());


    }
    @Test
    public void removerProdutoDoCarrinho() {
        produto.campoPesquisa();
        produto.inserirProduto("o poder do agora");
        produto.botaoPesquisar();
        produto.botaoSelecionarProduto();
        produto.botaoAdicionarNoCarrinho();
        produto.botaoCarrinho();
        produto.botaoRemoverDoCarrinho();
        Assert.assertEquals("Seu carrinho de compras da Amazon está vazio", produto.obterTextoCarrinhoVazio());

    }
}
