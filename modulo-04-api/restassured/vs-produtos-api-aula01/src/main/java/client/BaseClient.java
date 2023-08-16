package client;

import static io.restassured.RestAssured.*;

// Classe que contém configurações em comum para as requisições
public abstract class BaseClient {

    public static void initConfig() {
        baseURI = "http://localhost";
        port = 3000;

        // faz o log das informações caso a req ou asserção tenha uma falha
        enableLoggingOfRequestAndResponseIfValidationFails();
    }
}