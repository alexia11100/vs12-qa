package dataFactory;

import client.ProdutoClient;
import model.Produto;
import net.datafaker.Faker;
import org.apache.http.HttpStatus;

import java.util.Locale;

public class ProdutoDataFactory {

    private static ProdutoClient produtoClient = new ProdutoClient();
    private static Faker faker = new Faker(new Locale("PT-BR"));

    public static Produto produtoValido() {
        return novoProduto();
    }

    public static Produto produtoCadastradoAPI() {
        // cadastrando produto
        String _id = produtoClient.cadastrarProduto(produtoValido())
                .then()
                    .statusCode(HttpStatus.SC_CREATED)
                    .extract().jsonPath().getString("_id");

        // retornando classe do produto cadastrado
        Produto produto = produtoClient.verProduto(_id)
                .then()
                    .statusCode(HttpStatus.SC_OK)
                    .extract()
                    .as(Produto.class);

        return produto;
    }

    public static Produto produtoComDadosAtualizados() {
        Produto produtoAtualizado = produtoCadastradoAPI();

        produtoAtualizado.setNome(faker.commerce().productName());
        produtoAtualizado.setDescricao(faker.lorem().sentence());

        return produtoAtualizado;
    }


    public static Produto produtoComPrecoInvalido(){
        Produto produtoPrecoInvalido = novoProduto();
        produtoPrecoInvalido.setPreco(faker.random().nextInt(-1000, -1));

        return produtoPrecoInvalido;
    }

    private static Produto novoProduto() {
        Produto novoProduto = new Produto();
        novoProduto.setNome(faker.commerce().productName());
        novoProduto.setPreco(faker.random().nextInt(1, 1000));
        novoProduto.setDescricao(faker.lorem().sentence());
        novoProduto.setQuantidade(faker.random().nextInt(0, 100));

        return novoProduto;
    }
}