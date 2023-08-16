package tests.produto;

import client.ProdutoClient;
import dataFactory.ProdutoDataFactory;
import model.Produto;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProdutoTest {
    private ProdutoClient produtoClient = new ProdutoClient();

    @Test
    public void testDeveListarProdutosComSucesso() {
        // validando
        produtoClient.listarProdutos()
        .then()
            .assertThat()
                .statusCode(HttpStatus.SC_OK)
        ;
    }

    @Test
    public void testDeveCadastrarProdutoComSucesso() {
        // gerando massa de dados
        Produto produto = ProdutoDataFactory.produtoValido();

        // cadastrando produto
        String _id = produtoClient.cadastrarProduto(produto)
                .then()
                    .statusCode(HttpStatus.SC_CREATED)
                    .extract().jsonPath().getString("_id")
                ;

        produto.set_id(_id);

        // validando
        Produto produtoResult = produtoClient.verProduto(_id)
                        .then()
                            .statusCode(HttpStatus.SC_OK)
                            .extract()
                            .as(Produto.class)
                        ;

        Assertions.assertAll("Asserções agrupadas de Produto",
                () -> Assertions.assertEquals(produto.getNome(), produtoResult.getNome()),
                () -> Assertions.assertEquals(produto.getPreco(), produtoResult.getPreco()),
                () -> Assertions.assertEquals(produto.getDescricao(), produtoResult.getDescricao()),
                () -> Assertions.assertEquals(produto.getQuantidade(), produtoResult.getQuantidade()),
                () -> Assertions.assertEquals(produto.get_id(), produtoResult.get_id())
        );

        // excluindo massa de dados
        produtoClient.excluirProduto(produtoResult.get_id())
        .then()
            .statusCode(HttpStatus.SC_OK)
        ;
    }


    @Test
    public void testDeveAtualizarProdutoComSucesso(){
        // gerando massa de dados
        Produto produto = ProdutoDataFactory.produtoComDadosAtualizados();

        // atualizando produto
        produtoClient.atualizarProduto(produto.get_id(), produto)
        .then()
            .statusCode(HttpStatus.SC_OK)
        ;

        // validando
        Produto produtoResult = produtoClient.verProduto(produto.get_id())
                        .then()
                            .statusCode(200)
                            .extract()
                            .as(Produto.class)
                        ;

        Assertions.assertAll("Asserções agrupadas de Produto",
                () -> Assertions.assertEquals(produto.getNome(), produtoResult.getNome()),
                () -> Assertions.assertEquals(produto.getPreco(), produtoResult.getPreco()),
                () -> Assertions.assertEquals(produto.getDescricao(), produtoResult.getDescricao()),
                () -> Assertions.assertEquals(produto.getQuantidade(), produtoResult.getQuantidade()),
                () -> Assertions.assertEquals(produto.get_id(), produtoResult.get_id())
        );

        // excluindo massa de dados
        produtoClient.excluirProduto(produtoResult.get_id())
        .then()
            .statusCode(HttpStatus.SC_OK)
        ;
    }

    @Test
    public void testNaoDeveCadastrarProdutoComPrecoInvalido() {
        // gerando massa de dados
        Produto produto = ProdutoDataFactory.produtoComPrecoInvalido();

        // cadastrando produto com preço inválido
        produtoClient.cadastrarProduto(produto)
        .then()
            .statusCode(HttpStatus.SC_BAD_REQUEST)
        ;
    }
}