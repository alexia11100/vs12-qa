package client;

import model.Produto;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.Auth;

import static io.restassured.RestAssured.*;

public class ProdutoClient extends BaseClient {

    private static String token = Auth.tokenAdmin();
    private static String PRODUTO = "/produtos";

    public ProdutoClient() {
        BaseClient.initConfig();
    }

    public Response listarProdutos() {
        return
                given()
                .when()
                    .get(PRODUTO)
                ;
    }

    public Response verProduto(String _id) {
        return
                given()
                        .pathParam("_id", _id)
                .when()
                        .get(PRODUTO+"/{_id}")
                ;
    }

    public Response cadastrarProduto(Produto produto) {
        return
                given()
                        .header("Authorization", token)
                        .contentType(ContentType.JSON)
                        .body(produto.toString())
                .when()
                        .post(PRODUTO)
                ;
    }

    public Response atualizarProduto(String _id, Produto produto) {
        return
                given()
                        .header("Authorization", token)
                        .contentType(ContentType.JSON)
                        .body(produto.toString())
                        .pathParam("_id", _id)
                 .when()
                        .put(PRODUTO+"/{_id}")
                ;
    }

    public Response excluirProduto(String _id){
        return
                given()
                        .header("Authorization", token)
                        .pathParam("_id", _id)
                .when()
                        .delete(PRODUTO+"/{_id}")
                ;
    }
}