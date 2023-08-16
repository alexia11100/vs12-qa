package utils;

import client.AuthClient;
import model.Login;

public class Auth {
    private static final AuthClient authClient = new AuthClient();

    public static String tokenAdmin() {

        Login loginAdm = new Login(
                Manipulation.getProp().getProperty("email"),
                Manipulation.getProp().getProperty("password")
        );

        return authClient.logar(loginAdm)
                .then()
                    .extract().jsonPath().getString("authorization")
                ;
    }
}