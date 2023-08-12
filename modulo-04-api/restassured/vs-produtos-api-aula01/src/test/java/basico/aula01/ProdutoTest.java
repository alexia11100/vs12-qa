package basico.aula01;

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
        productId = given()
                .header("Authorization", token)
                .contentType(ContentType.JSON)
                .body("{\"nome\": \"produtoteste821\", \"preco\":10, \"descricao\":\"produto de teste\", \"quantidade\":1}")
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
        String resultado = given()
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
        String resultado = given()
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
        String mensagemEsperada = "Registro alterado com sucesso";
        String resultado = given()
                .header("Authorization", token)
                .contentType(ContentType.JSON)
                .body("{\"nome\": \"produtoatualizado\", \"preco\": 10, \"descricao\": \"descricao qualquer\", \"quantidade\": 2}")
                .when()
                .put("/produtos/" + productId)
                .then()
                .log().all()
                .statusCode(200)
                .extract().jsonPath().getString("message");
        Assertions.assertEquals(mensagemEsperada, resultado);
    }
}