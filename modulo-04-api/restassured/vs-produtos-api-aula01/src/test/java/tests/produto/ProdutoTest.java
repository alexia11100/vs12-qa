package tests.produto;

import client.ProdutoClient;
import dataFactory.ProdutoDataFactory;
import model.Produto;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class ProdutoTest {
    private ProdutoClient produtoClient = new ProdutoClient();

    // LISTAR PRODUTOS
    // POSITIVO
    @Test
    public void testDeveListarProdutosComSucesso() {
        // validando
        produtoClient.listarProdutos()
        .then()
            .assertThat()
                .statusCode(HttpStatus.SC_OK)
        ;
    }

    // NEGATIVO 1
    @Test
    public void testNaoDeveListarProdutosComPrecoNegativo() {
        // validando
        produtoClient.listarProdutosPorPreco(-40)
        .then()
            .assertThat()
                .statusCode(HttpStatus.SC_BAD_REQUEST)
        ;
    }

    // NEGATIVO 2
    @Test
    public void testNaoDeveListarProdutosComQuantidadeNegativa() {
        // validando
        produtoClient.listarProdutosPorQuantidade(-2)
        .then()
            .assertThat()
                .statusCode(HttpStatus.SC_BAD_REQUEST)
        ;
    }

    // CADASTRAR PRODUTO
    // POSITIVO
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

    // NEGATIVO 1
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

    // NEGATIVO 2
    @Test
    public void testNaoDeveCadastrarProdutoComNomeInvalido() {
        // gerando massa de dados
        Produto produto = ProdutoDataFactory.produtoComNomeInvalido();

        // cadastrando produto com nome inválido
        produtoClient.cadastrarProduto(produto)
        .then()
            .statusCode(HttpStatus.SC_BAD_REQUEST)
        ;
    }

    // BUSCAR PRODUTO
    // POSITIVO
    @Test
    public void testDeveBuscarProdutoComSucesso() {
        // gerando massa de dados
        Produto produto = ProdutoDataFactory.produtoValido();

        // cadastrando produto
        String _id = produtoClient.cadastrarProduto(produto)
                .then()
                    .statusCode(HttpStatus.SC_CREATED)
                    .extract().jsonPath().getString("_id")
                ;

        produto.set_id(_id);

        // verificando produto
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

    // NEGATIVO 1
    @Test
    public void testNaoDeveBuscarProdutoComIdInvalido() {
        produtoClient.verProduto("teste")
                .then()
                    .assertThat()
                        .statusCode(HttpStatus.SC_BAD_REQUEST)
        ;
    }

    // ATUALIZAR
    // POSITIVO
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

    // NEGATIVO 1
    @Test
    public void testNaoDeveAtualizarProdutoComMesmoNome() {
        // gerando massa de dados
        Produto produto = ProdutoDataFactory.produtoValido();

        // cadastrando produto
        String _id = produtoClient.cadastrarProduto(produto)
                .then()
                    .statusCode(HttpStatus.SC_CREATED)
                    .extract().jsonPath().getString("_id")
                ;

        produto.set_id(_id);

        // gerando massa de dados
        Produto produtoDois = ProdutoDataFactory.produtoComMesmoNome(produto.getNome());

        // atualizando produto
        produtoClient.atualizarProduto(produtoDois.get_id(), produtoDois)
        .then()
            .statusCode(HttpStatus.SC_BAD_REQUEST)
        ;

        // excluindo massa de dados
        produtoClient.excluirProduto(produto.get_id())
        .then()
            .statusCode(HttpStatus.SC_OK)
        ;

        produtoClient.excluirProduto(produtoDois.get_id())
        .then()
            .statusCode(HttpStatus.SC_OK)
        ;
    }

    // NEGATIVO 2
    @Test
    public void testNaoDeveAtualizarProdutoComQuantidadeNegativa() {
        // gerando massa de dados
        Produto produto = ProdutoDataFactory.produtoComQuantidadeNegativa();

        // atualizando produto
        produtoClient.atualizarProduto(produto.get_id(), produto)
        .then()
            .statusCode(HttpStatus.SC_BAD_REQUEST)
        ;

        // excluindo massa de dados
        produtoClient.excluirProduto(produto.get_id())
        .then()
            .statusCode(HttpStatus.SC_OK)
        ;
    }

    //DELETAR
    //POSITIVO
    @Test
    public void testDeletarProdutoComSucesso(){
        // gerando massa de dados
        Produto produto = ProdutoDataFactory.produtoValido();

        // cadastrando produto
        String _id = produtoClient.cadastrarProduto(produto)
                .then()
                    .statusCode(HttpStatus.SC_CREATED)
                    .extract().jsonPath().getString("_id")
                ;

        produto.set_id(_id);

        // excluindo massa de dados
        produtoClient.excluirProduto(produto.get_id())
        .then()
            .statusCode(HttpStatus.SC_OK)
        ;
    }

    //NEGATIVO 1
    @Test
    public void testDeletarProdutoNaoExistente(){

        // excluindo massa de dados
        produtoClient.excluirProduto("teste")
                .then()
                    .assertThat()
                        .statusCode(HttpStatus.SC_OK)
                        .body("message", equalTo("Nenhum registro excluído"))
                ;
    }

    //NEGATIVO 2
    @Test
    public void testNaoDeletarOMesmoProdutoDoisVezes(){
        // gerando massa de dados
        Produto produto = ProdutoDataFactory.produtoValido();

        // cadastrando produto
        String _id = produtoClient.cadastrarProduto(produto)
                .then()
                    .statusCode(HttpStatus.SC_CREATED)
                    .extract().jsonPath().getString("_id")
                ;

        produto.set_id(_id);

        // excluindo massa de dados
        produtoClient.excluirProduto(produto.get_id())
                .then()
                    .assertThat()
                        .statusCode(HttpStatus.SC_OK)
                        .body("message", equalTo("Registro excluído com sucesso"))
        ;

        // excluindo massa de dados pela segunda vez
        produtoClient.excluirProduto(produto.get_id())
                .then()
                    .assertThat()
                        .statusCode(HttpStatus.SC_OK)
                        .body("message", equalTo("Nenhum registro excluído"))
        ;
    }
}