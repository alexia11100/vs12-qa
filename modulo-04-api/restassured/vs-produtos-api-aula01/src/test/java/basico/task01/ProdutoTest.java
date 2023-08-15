package basico.task01;

import basico.pojo.ProdutoPojo;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.*;
import static io.restassured.RestAssured.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProdutoTest {
    private static String token;
    private static String productId;

    @BeforeEach
    public void setup(){
        baseURI = "http://localhost:3000";

        token = given()
                    .contentType(ContentType.JSON)
                    .body("{\"email\": \"fulano@qa.com\", \"password\": \"teste\"}")
                .when()
                    .post("/login")
                    .then()
                    .extract().jsonPath().getString("authorization");
    }

    @Test
    @Order(1)
    public void testListarProdutos(){
        given()
        .when()
            .get("/produtos")
        .then()
            .log().all()
            .statusCode(200);
    }

    @Test
    @Order(2)
    public void testCadastrarProduto(){
        ProdutoPojo produto = new ProdutoPojo();
        produto.setNome("ProdutoTeste");
        produto.setPreco(10);
        produto.setDescricao("um produto para testar");
        produto.setQuantidade(1);
        productId = given()
                        .header("Authorization", token)
                        .contentType(ContentType.JSON)
                        .body(produto)
                    .when()
                        .post("/produtos")
                    .then()
                        .log().all()
                        .statusCode(201)
                        .extract().jsonPath().getString("_id");
    }

    @Test
    @Order(3)
    public void testBuscarProdutoPorId(){
        String resultado =  given()
                            .when()
                                .get("/produtos/" + productId)
                            .then()
                                .log().all()
                                .statusCode(200)
                                .extract().jsonPath().getString("_id");
        Assertions.assertEquals(productId, resultado);
    }

    @Test
    @Order(5)
    public void testExcluirProduto(){
        String mensagemEsperada = "Registro excluído com sucesso";
        String resultado =  given()
                                .header("Authorization", token)
                            .when()
                                .delete("/produtos/" + productId)
                            .then()
                                .log().all()
                                .statusCode(200)
                                .extract().jsonPath().getString("message");
        Assertions.assertEquals(mensagemEsperada, resultado);
    }

    @Test
    @Order(4)
    public void testAtualizarProduto() {
        ProdutoPojo produtoAtualizado = new ProdutoPojo();
        produtoAtualizado.setNome("TesteAtualizado");
        produtoAtualizado.setPreco(1);
        produtoAtualizado.setDescricao("um produto atualizado");
        produtoAtualizado.setQuantidade(1);

        String mensagemEsperada = "Registro alterado com sucesso";
        String resultado =  given()
                                .header("Authorization", token)
                                .contentType(ContentType.JSON)
                                .body(produtoAtualizado)
                            .when()
                                .put("/produtos/" + productId)
                            .then()
                                .log().all()
                                .statusCode(200)
                                .extract().jsonPath().getString("message");
        Assertions.assertEquals(mensagemEsperada, resultado);
    }
}