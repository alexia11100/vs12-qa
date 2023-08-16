package basico.task02;

import basico.pojo.ProdutoPojo;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProdutoTest {
    private static String token;
    private static String productId;

    @BeforeEach
    public void setup() throws IOException {
        Properties properties = new Properties();

        // defina o caminho do seu arquivo de configuração aqui (config.properties)
        InputStream input = new FileInputStream("C:\\Users\\alexia.oliveira\\vs12-qa\\modulo-04-api\\restassured\\vs-produtos-api-aula01\\src\\test\\java\\basico\\task02\\config.properties");
        properties.load(input);

        String username = properties.getProperty("email");
        String password = properties.getProperty("password");

        baseURI = "http://localhost:3000";

        token = given()
                    .contentType(ContentType.JSON)
                    .body("{\"email\": \"" + username + "\", \"password\": \"" + password + "\"}")
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
            .assertThat()
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
                        .assertThat()
                            .statusCode(201)
                        .extract().jsonPath().getString("_id");
    }

    @Test
    @Order(3)
    public void testBuscarProdutoPorId(){
        given()
        .when()
            .get("/produtos/" + productId)
        .then()
            .log().all()
            .assertThat()
                .statusCode(200)
                .body("_id", equalTo(productId));
    }

    @Test
    @Order(5)
    public void testExcluirProduto(){
        given()
            .header("Authorization", token)
        .when()
            .delete("/produtos/" + productId)
        .then()
            .log().all()
            .assertThat()
                .statusCode(200)
                .body("message", equalTo("Registro excluído com sucesso"));
    }

    @Test
    @Order(4)
    public void testAtualizarProduto() {
        ProdutoPojo produtoAtualizado = new ProdutoPojo();
        produtoAtualizado.setNome("TesteAtualizado");
        produtoAtualizado.setPreco(1);
        produtoAtualizado.setDescricao("um produto atualizado");
        produtoAtualizado.setQuantidade(1);

        given()
            .header("Authorization", token)
            .contentType(ContentType.JSON)
            .body(produtoAtualizado)
        .when()
            .put("/produtos/" + productId)
        .then()
            .log().all()
            .assertThat()
                .statusCode(200)
                .body("message", equalTo("Registro alterado com sucesso"));
    }
}